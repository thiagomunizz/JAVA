package view;

import java.util.ArrayList;

public class Pedido {
	
	private int idPedido;
	private ArrayList<ItemPedido> ItemPedido;
	public Pedido() {
		ItemPedido = new ArrayList<ItemPedido>();
	}
	
	public void add(ItemPedido umPedido) {
		ItemPedido.add(umPedido);
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
}
