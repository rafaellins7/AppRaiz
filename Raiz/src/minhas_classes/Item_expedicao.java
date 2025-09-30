package Classes_Clara;

public class Item_expedicao {
		private int id;
		private int ordem_id;
		private int quantidade;
	 
		public Item_expedicao() {
		}
		
		public Item_expedicao(int id, int ordem_id, int quantidade) {
			this.id = id;
			this.ordem_id = ordem_id;
			this.quantidade = quantidade;
			}
		
		public int getId() {
			return this.id;
			}
		public void setId(int id) {
			this.id = id;
		}
		
		public int ordem_id() {
			return this.ordem_id;
			}
		public void setordem_id(int ordem_id) {
			this.ordem_id = ordem_id;
		}
		
		public int quantidade() {
			return this.quantidade;
			}
		public void setquantidade(int quantidade) {
			this.quantidade = quantidade;
		}
}
