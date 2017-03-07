<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="header">
		<div class="container">
			<div class="w3layouts_logo">
				<a href="index.html"><h1>CoBook<span></span></h1></a>
			</div>
			<div class="w3_search">
				<form action="#" method="post">
					<input type="text" name="Search" placeholder="Search" required="">
					<input type="submit" value="Go">
				</form>
			</div>
			<div class="w3l_sign_in_register">
				<ul>
					<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">Wish List <span class="badge">2</span></a>
					<ul class="dropdown-menu multi-column columns-2">
									 <li>
									<div class="wishlist_dropdown">
										<ul class="multi-column-dropdown">
											<li><a href="#">1권</a></li>
											<li><a href="#">뱀파이어와의 인터뷰</a></li>
											 <div class="dropdown-divider"><a></a></div>
											 <li><a href="#">Action</a></li>
											<li><a href="#">Biography</a></li>
											 
										</ul>
									</div>
									<div class="clearfix"></div>
									</li>
								</ul>
					</li>
					<li><a href="#" data-toggle="modal" data-target="#myModal">Login</a></li>
				</ul>
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>