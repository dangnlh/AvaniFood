<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<body>


	<!-- 
Body Section 
-->

	<div class="row">
		<div id="sidebar" class="span3">
			<div class="well well-small">
				<ul class="nav nav-list">
					<c:forEach var="item" items="${ categorys }">
						<li>
						<a href='<c:url value="/san-pham/${ item.id }"/>'><span
								class="icon-circle-blank"></span>${ item.name }</a></li>
					</c:forEach>



					<li><a class="totalInCart" href="cart.html"><strong>Total
								Amount <span class="badge badge-warning pull-right"
								style="line-height: 18px;">$448.42</span>
						</strong></a></li>
				</ul>
			</div>

			<div class="well well-small alert alert-warning cntr">
				<h2>50% Discount</h2>
				<p>
					only valid for online order. <br> <br> <a
						class="defaultBtn" href="#">Click here </a>
				</p>
			</div>
			<div class="well well-small">
				<a href="#"><img src="assets/img/paypal.jpg"
					alt="payment method paypal"></a>
			</div>

			<a class="shopBtn btn-block" href="#">Upcoming products <br>
				<small>Click to view</small></a> <br> <br>
			<ul class="nav nav-list promowrapper">
				<li>
					<div class="thumbnail">
						<a class="zoomTool" href="product_details.html"
							title="add to cart"><span class="icon-search"></span> QUICK
							VIEW</a> <img src="assets/img/bootstrap-ecommerce-templates.png"
							alt="bootstrap ecommerce templates">
						<div class="caption">
							<h4>
								<a class="defaultBtn" href="product_details.html">VIEW</a> <span
									class="pull-right">$22.00</span>
							</h4>
						</div>
					</div>
				</li>
				<li style="border: 0">&nbsp;</li>
				<li>
					<div class="thumbnail">
						<a class="zoomTool" href="product_details.html"
							title="add to cart"><span class="icon-search"></span> QUICK
							VIEW</a> <img src="assets/img/shopping-cart-template.png"
							alt="shopping cart template">
						<div class="caption">
							<h4>
								<a class="defaultBtn" href="product_details.html">VIEW</a> <span
									class="pull-right">$22.00</span>
							</h4>
						</div>
					</div>
				</li>
				<li style="border: 0">&nbsp;</li>
				<li>
					<div class="thumbnail">
						<a class="zoomTool" href="product_details.html"
							title="add to cart"><span class="icon-search"></span> QUICK
							VIEW</a> <img src="assets/img/bootstrap-template.png"
							alt="bootstrap template">
						<div class="caption">
							<h4>
								<a class="defaultBtn" href="product_details.html">VIEW</a> <span
									class="pull-right">$22.00</span>
							</h4>
						</div>
					</div>
				</li>
			</ul>

		</div>
		<div class="span9">
			<div class="well np">
				<div id="myCarousel" class="carousel slide homCar">
					<div class="carousel-inner">


						<c:forEach var="item" items="${ slides }" varStatus="index">


							<c:if test="${ index.first }">
								<div class="item active">
							</c:if>

							<c:if test="${ not index.first }">
								<div class="item">
							</c:if>
							<img style="width: 100%"
								src="<c:url value="/assets/user/img/slide/${ item.img }"/>"
								alt="bootstrap ecommerce templates">


							<div class="carousel-caption">
								<h4>${ item.caption }</h4>
								<p>
									<span>${ item.content }</span>
								</p>

							</div>
					</div>
					</c:forEach>

				</div>


				<!--
				<div class="item active">
						<img style="width: 100%"
							src="<c:url value="/assets/user/img/carousel3.png"/> "
							alt="bootstrap ecommerce templates">
						<div class="carousel-caption">
							<h4>Twitter Bootstrap cart</h4>
							<p>
								<span>Very easy to integrate and expand.</span>
							</p>
						</div>
					</div>
				  -->




				<a class="left carousel-control" href="#myCarousel"
					data-slide="prev">&lsaquo;</a> <a class="right carousel-control"
					href="#myCarousel" data-slide="next">&rsaquo;</a>
			</div>
		</div>
		<!--
New Products
-->
		<h2>${ products.size() }</h2>
		<div class="well well-small">
			<h3>S???n Ph???m M???i</h3>

			<hr class="soften" />
			<div class="row-fluid">
				<div id="newProductCar" class="carousel slide">
					<div class="carousel-inner">
					<c:if test="${ products.size() > 0 }">
						<div class="item active">
							<ul class="thumbnails">
							<c:forEach var="item" items="${ products }" varStatus="loop">
								<li class="span3">
									<div class="thumbnail">
										<a class="zoomTool" href="product_details.html"
											title="add to cart"><span class="icon-search"></span>
											QUICK VIEW</a> <a href="product_details.html"><img
											src="<c:url value="/assets/user/img/${ item.img }"/>" alt=""></a>
									</div>
								</li>
								<c:if test="${ (loop.index + 1) % 4 == 0 || (loop.index + 1)  == products.size() }">
										</ul>
									</div>
									<c:if test="${ (loop.index + 1) < products.size() }">
										<div class="item">
											<ul class="thumbnails">
									</c:if>
								</c:if>
							</c:forEach>
					</c:if>
						
					</div>			
					
				
					
					<a class="left carousel-control" href="#newProductCar"
						data-slide="prev">&lsaquo;</a> <a class="right carousel-control"
						href="#newProductCar" data-slide="next">&rsaquo;</a>
				</div>
			</div>

		</div>
		<!--
	Featured Products
	-->
	<h2>${ highlightproducts.size() }</h2>
		<div class="well well-small">
			<h3>
				<a class="btn btn-mini pull-right" href="products.html"
					title="View more">VIew More<span class="icon-plus"></span></a> S???n
				Ph???m N???i B???t

			</h3>
		
			<hr class="soften" />
			<div class="row-fluid">

				<c:if test="${ highlightproducts.size() > 0 }">
					<ul class="thumbnails">

						<c:forEach var="item" items="${ highlightproducts }" varStatus="loop">
							<li class="span4">
								<div class="thumbnail">
									<a class="zoomTool" href="#" title="add to cart"><span
										class="icon-search"></span> QUICK VIEW</a> <a
										href="chi-tiet-san-pham/${ item.id_product }"><img
										src="<c:url value="/assets/user/img/${ item.img }"/>" alt=""></a>
									<div class="caption">
										<h5>${ item.name }</h5>
										<h4>
											<a class="defaultBtn" href="product_details.html"
												title="Click to view"><span class="icon-zoom-in"></span></a>
											<a class="shopBtn" href="<c:url value="/AddCart/${ item.id_product }"/>" title="add to cart"><span
												class="icon-plus"></span></a>
												 <span class="pull-right">
												${ item.price }
												???</span>
										</h4>
									</div>
								</div>
							</li>

							<c:if
								test="${ (loop.index + 1) % 3 == 0 || (loop.index + 1)  == highlightproducts.size() }">
					</ul>
					<c:if test="${ (loop.index + 1) < highlightproducts.size() }">
						<ul class="thumbnails">
					</c:if>
				</c:if>

				</c:forEach>

				</c:if>

			</div>
		</div>
		<hr>
		<div class="well well-small">
			<a class="btn btn-mini pull-right" href="#">View more <span
				class="icon-plus"></span></a> T???t C??? S???n Ph???m
		</div>


	</div>
	</div>


</body>


