public class Cliente {

    private String mat;
        private String nome;
        private String telefone;
        private String email;
        private String endereço;


        public Cliente(String mat, String nome) {
            this.mat = mat;
            this.nome = nome;
        }

        public String getMat() {
            return mat;
        }

        public void setMat(String mat) {
            this.mat = mat;
        }
        
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getTelefone() {
            return telefone;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getEndereço() {
            return endereço;
        }

        public void setEndereço(String endereço) {
            this.endereço = endereço;
        }

        public Object getFone() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'getFone'");
        }

        public void setFone(String telefone2) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'setFone'");
        }
}
