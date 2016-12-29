/**
 * by simon
 */
    $(function () {
    	
    	$('#demo').pagination({
    	    dataSource: '/index/ii',
    	    locator: 'items',
    	    totalNumber: 120,
    	    pageSize: 20,
    	    ajax: {
    	        beforeSend: function() {
    	            dataContainer.html('Loading data from flickr.com ...');
    	        }
    	    },
    	    callback: function(data, pagination) {
    	        // template method of yourself
    	        var html = template(data);
    	        dataContainer.html(html);
    	    }
    	})
    	
    	
    	
    	
        function createDemo(name) {
            var container = $('#pagination-' + name);
            
            
            var sources = function () {
                var result = [];

                for (var i = 1; i < 196; i++) {
                    result.push(i);
                }

                return result;
            }();

            var options = {
                dataSource: sources,
                callback: function (response, pagination) {
//                    window.console && console.log(response, pagination);

                    var dataHtml = '<tr>';

                    $.each(response, function (index, item) {
                        dataHtml += '<td>' + item + '</td>';
                    });

                    dataHtml += '</tr>';

                    container.prev().html(dataHtml);
                }
            };

            //$.pagination(container, options);

//            container.addHook('beforeInit', function () {
//                window.console && console.log('beforeInit...');
//            });
            container.pagination(options);

            /*container.addHook('beforePageOnClick', function () {
                window.console && console.log('beforePageOnClick...');
                //return false
            });*/

            return container;
        }
    });