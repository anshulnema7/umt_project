


	function theNotification(name,message) {
		//alert("sadadasd");
                var getname=name;
                if(getname=='Lenoogle Chat Room')
                    {
                        var n = new Notification(name,  {
	   		icon: 'OnePage/GroupChat.png',
	   		tag: 'note',
	   		body: message
	    });
                    }
                else
                    {
                     var n = new Notification(name,  {
	   		icon: 'OnePage/error_1.png',
	   		tag: 'note',
	   		body: message
	    });
                    }
	   	
	}

	function timeOut() {

		setTimeout(function() {

			var a  = document.querySelectorAll('[data-fade]');
			for(s = 0; s < a.length; ++s) {

				a[s].remove();

			}

			running = false;

		}, 0);

	}

	var running = false;

	function fallbackNote() {

		if(running === false) {
			running = true;

			var attr = document.createAttribute('data-fade');
			var at = document.createAttribute('data-fade');
			var not = document.querySelectorAll('.notification');

			if(not !== null) {
				for (i = 0; i < not.length; i++) {
					if(!not[i].hasAttribute('data-fade')) {
						not[i].setAttributeNode(attr);
					}
				}
			}

			var ne = document.createElement('div');

                   

			ne.className = 'search';

			ne.innerHTML = '<h2>I\'m a notification! </h2><div class="close">Notification Content</div><div class="close">&#10008;</div>';

			var org = document.querySelector('#container');

			document.body.insertBefore(ne, org);

			setTimeout(function() {
				var a  = document.querySelectorAll('.notification');

				for(s = 0; s < a.length; ++s) {

					a[s].style.top = '60px';

					a[s].onclick = function(e) {

						if(!this.hasAttribute('data-fade')) {
							this.setAttributeNode(at);
							timeOut();
						}
					}
				}

			}, 20);

			timeOut();

		}
	}

           function ShowmNotification(name,message){
//alert("dsdddad");

		if (Notification && Notification.permission === "granted") {
			theNotification(name,message);
		}

		// If they are not denied (i.e. default)
		else if (Notification && Notification.permission !== "denied") {

			// Request permission
			Notification.requestPermission(function (status) {

				// Change based on user's decision
				if (Notification.permission !== status) {
					Notification.permission = status;
				}

				// If it's granted show the notification
				if (status === "granted") {
					theNotification(name,message);
				}

				else {
					fallbackNote();
				}

			});

		}

		else {
			fallbackNote();
		}

                }





