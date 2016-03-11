var count = 0;
var count2 = 0;
function doWeatherAjaxCall() {
	if (count == 0) {
		$.ajax({
			type : "POST",
			url : "/AjaxForWeatherRestApi",
			dataType : 'json',
			cache : false,
			success : function(data) {
				$("#WeatheTabId").find('tbody').append(
						$('<tr>')
								.append(
										'<td>' + '<B>' + 'Attribute' + '</B>'
												+ '</td>').append(
										'<td>' + '<B>' + 'value' + '</B>'
												+ '</td>'));
				$.each(data, function(key, value) {

					$("#WeatheTabId").find('tbody').append(
							$('<tr>').append('<td>' + key + '</td>').append(
									'<td>' + value + '</td>'));
				});
				count++;
			},
			error : function(e) {
				alert('Error: ' + e);
			}
		});
	}
}

function doDBDataAjaxCall() {
	if (count2 == 0) {
		$.ajax({
			type : "GET",
			url : "/AjaxForDBData",
			dataType : 'json',
			cache : false,
			success : function(data) {
				if (data.length > 0) {
					$("#DBDataTabId").find('tbody').append(
							$('<tr>').append(
									'<td>' + '<B>' + 'ID' + '</B>' + '</td>')
									.append(
											'<td>' + '<B>' + 'ITEM' + '</B>'
													+ '</td>').append(
											'<td>' + '<B>' + 'Model' + '</B>'
													+ '</td>').append(
											'<td>' + '<B>' + 'Country' + '</B>'
													+ '</td>'));
					for (var i = 0; i < data.length; i++) {
						var brandVal = data[i];
						$("#DBDataTabId").find('tbody').append(
								$('<tr>')
										.append('<td>' + brandVal.id + '</td>')
										.append(
												'<td>' + brandVal.item
														+ '</td>').append(
												'<td>' + brandVal.model
														+ '</td>').append(
												'<td>' + brandVal.country
														+ '</td>'));
					}
				}
				count2++;
			},
			error : function(e) {
				alert('Error: ' + e);
			}
		});
	}
}
