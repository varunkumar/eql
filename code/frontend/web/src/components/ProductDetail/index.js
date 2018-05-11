//Dependencies
import React, { Component } from 'react';
import { Icon } from 'react-materialize';
import { Link } from 'react-router-dom';
//Internals
import PRODUCTS from '../Data';
import './index.css';

class ProductDetail extends Component {
  render() {
    const product = PRODUCTS.find(item => item.id === parseInt(this.props.match.params.id, 10));
    const currentProduct = product;
    return (
      <div className="show-product">
        <div className="item-wrapper">
          <div className="item-image">
            <img className="product-image" src={currentProduct.img} alt={currentProduct.name} title={currentProduct.name} />
          </div>
          <div className="item-name">
            <div className="product-info">
              <h3 id="product-name">{currentProduct.name}</h3>
            </div>
            <div className="product-bio">
              <p id="product-description">{currentProduct.description}</p>
              <p id="product-price">${currentProduct.price}</p>
              <Icon small id="add-icon">add_shopping_cart</Icon>
            </div>
            <div className="product-review">
              <div className="stars">
                <Icon small id="add-icon">star</Icon>
                <Icon small id="add-icon">star</Icon>
                <Icon small id="add-icon">star</Icon>
                <Icon small id="add-icon">star</Icon>
                <Icon small id="add-icon">star_half</Icon>
              </div>
            </div>
          </div>
        </div>
        <div className="similar-products">
          <h5>You might also like</h5>
          {PRODUCTS.map((product) => {
            if (
              product.gender === currentProduct.gender
              && product.type === currentProduct.type
              && product.name !== currentProduct.name) {
              return (
                <Link to={`/products/${product.id}`} key={product.id} >
                  <div key={product.id} className="item">
                    <Link to={`/products/${product.id}`}>
                      <div className="product-img">
                        <img alt={product.name} src={product.img} />
                      </div>
                      <div className="product-details">
                        <div id="product-name">{product.name}</div>
                        <div id="product-description">{product.description}</div>
                      </div>
                    </Link>
                    <div className="price-add">
                      <h5 id="product-price">${product.price}</h5>
                      <Icon small id="add-icon">add_shopping_cart</Icon>
                    </div>
                  </div>
                </Link>
              )
            }
            return undefined;
          })}
        </div>
      </div>
    );
  }
}

export default ProductDetail;