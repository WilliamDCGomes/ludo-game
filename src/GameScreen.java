import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author William Douglas
 *         Wiuta
 */
public class GameScreen extends javax.swing.JFrame {
    public GameScreen() {
        initComponents();
        selecaoVerde.setVisible(false);
        selecaoVermelho.setVisible(false);
        selecaoAzul.setVisible(false);
        selecaoAmarelo.setVisible(false);
        lado1.setVisible(false);
        lado2.setVisible(false);
        lado3.setVisible(false);
        lado4.setVisible(false);
        lado5.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lado1 = new javax.swing.JLabel();
        lado2 = new javax.swing.JLabel();
        lado3 = new javax.swing.JLabel();
        lado4 = new javax.swing.JLabel();
        lado5 = new javax.swing.JLabel();
        lado6 = new javax.swing.JLabel();
        jogador3Azul = new javax.swing.JLabel();
        jogador1Azul = new javax.swing.JLabel();
        jogador2Azul = new javax.swing.JLabel();
        jogador4Azul = new javax.swing.JLabel();
        jogador3Amarelo = new javax.swing.JLabel();
        jogador1Amarelo = new javax.swing.JLabel();
        jogador2Amarelo = new javax.swing.JLabel();
        jogador4Amarelo = new javax.swing.JLabel();
        jogador3Verde = new javax.swing.JLabel();
        jogador1Verde = new javax.swing.JLabel();
        jogador2Verde = new javax.swing.JLabel();
        jogador4Verde = new javax.swing.JLabel();
        jogador1Vermelho = new javax.swing.JLabel();
        jogador4Vermelho = new javax.swing.JLabel();
        jogador3Vermelho = new javax.swing.JLabel();
        jogador2Vermelho = new javax.swing.JLabel();
        selecaoVermelho = new javax.swing.JLabel();
        selecaoAmarelo = new javax.swing.JLabel();
        selecaoAzul = new javax.swing.JLabel();
        selecaoVerde = new javax.swing.JLabel();
        campoDeBatalha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LUDO GAME");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        lado1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1.png"))); // NOI18N
        lado1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lado1MouseClicked(evt);
            }
        });
        getContentPane().add(lado1);
        lado1.setBounds(218, 222, 50, 50);

        lado2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/2.png"))); // NOI18N
        lado2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lado2MouseClicked(evt);
            }
        });
        getContentPane().add(lado2);
        lado2.setBounds(218, 222, 50, 50);

        lado3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lado3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/3.png"))); // NOI18N
        lado3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lado3MouseClicked(evt);
            }
        });
        getContentPane().add(lado3);
        lado3.setBounds(218, 222, 50, 50);

        lado4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lado4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/4.png"))); // NOI18N
        lado4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lado4MouseClicked(evt);
            }
        });
        getContentPane().add(lado4);
        lado4.setBounds(218, 222, 50, 50);

        lado5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lado5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/5.png"))); // NOI18N
        lado5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lado5MouseClicked(evt);
            }
        });
        getContentPane().add(lado5);
        lado5.setBounds(218, 222, 50, 50);

        lado6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lado6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/6.png"))); // NOI18N
        lado6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lado6MouseClicked(evt);
            }
        });
        getContentPane().add(lado6);
        lado6.setBounds(218, 222, 50, 50);

        jogador3Azul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jogador3Azul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/peão azul.png"))); // NOI18N
        jogador3Azul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jogador3AzulMouseClicked(evt);
            }
        });
        jogador3Azul.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jogador3AzulComponentMoved(evt);
            }
        });
        getContentPane().add(jogador3Azul);
        jogador3Azul.setBounds(340, 390, 40, 40);

        jogador1Azul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jogador1Azul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/peão azul.png"))); // NOI18N
        jogador1Azul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jogador1AzulMouseClicked(evt);
            }
        });
        jogador1Azul.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jogador1AzulComponentMoved(evt);
            }
        });
        getContentPane().add(jogador1Azul);
        jogador1Azul.setBounds(340, 330, 40, 40);

        jogador2Azul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jogador2Azul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/peão azul.png"))); // NOI18N
        jogador2Azul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jogador2AzulMouseClicked(evt);
            }
        });
        jogador2Azul.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jogador2AzulComponentMoved(evt);
            }
        });
        getContentPane().add(jogador2Azul);
        jogador2Azul.setBounds(400, 330, 50, 40);

        jogador4Azul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jogador4Azul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/peão azul.png"))); // NOI18N
        jogador4Azul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jogador4AzulMouseClicked(evt);
            }
        });
        jogador4Azul.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jogador4AzulComponentMoved(evt);
            }
        });
        getContentPane().add(jogador4Azul);
        jogador4Azul.setBounds(400, 390, 50, 40);

        jogador3Amarelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jogador3Amarelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/peão amarelo.png"))); // NOI18N
        jogador3Amarelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jogador3AmareloMouseClicked(evt);
            }
        });
        jogador3Amarelo.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jogador3AmareloComponentMoved(evt);
            }
        });
        getContentPane().add(jogador3Amarelo);
        jogador3Amarelo.setBounds(40, 390, 50, 40);

        jogador1Amarelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jogador1Amarelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/peão amarelo.png"))); // NOI18N
        jogador1Amarelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jogador1AmareloMouseClicked(evt);
            }
        });
        jogador1Amarelo.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jogador1AmareloComponentMoved(evt);
            }
        });
        getContentPane().add(jogador1Amarelo);
        jogador1Amarelo.setBounds(40, 330, 50, 40);

        jogador2Amarelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jogador2Amarelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/peão amarelo.png"))); // NOI18N
        jogador2Amarelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jogador2AmareloMouseClicked(evt);
            }
        });
        jogador2Amarelo.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jogador2AmareloComponentMoved(evt);
            }
        });
        getContentPane().add(jogador2Amarelo);
        jogador2Amarelo.setBounds(110, 330, 40, 40);

        jogador4Amarelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jogador4Amarelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/peão amarelo.png"))); // NOI18N
        jogador4Amarelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jogador4AmareloMouseClicked(evt);
            }
        });
        jogador4Amarelo.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jogador4AmareloComponentMoved(evt);
            }
        });
        getContentPane().add(jogador4Amarelo);
        jogador4Amarelo.setBounds(110, 390, 40, 40);

        jogador3Verde.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jogador3Verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/peão verde.png"))); // NOI18N
        jogador3Verde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jogador3VerdeMouseClicked(evt);
            }
        });
        jogador3Verde.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jogador3VerdeComponentMoved(evt);
            }
        });
        getContentPane().add(jogador3Verde);
        jogador3Verde.setBounds(40, 100, 48, 40);

        jogador1Verde.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jogador1Verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/peão verde.png"))); // NOI18N
        jogador1Verde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jogador1VerdeMouseClicked(evt);
            }
        });
        jogador1Verde.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jogador1VerdeComponentMoved(evt);
            }
        });
        getContentPane().add(jogador1Verde);
        jogador1Verde.setBounds(40, 30, 50, 40);

        jogador2Verde.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jogador2Verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/peão verde.png"))); // NOI18N
        jogador2Verde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jogador2VerdeMouseClicked(evt);
            }
        });
        jogador2Verde.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jogador2VerdeComponentMoved(evt);
            }
        });
        getContentPane().add(jogador2Verde);
        jogador2Verde.setBounds(110, 30, 40, 40);

        jogador4Verde.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jogador4Verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/peão verde.png"))); // NOI18N
        jogador4Verde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jogador4VerdeMouseClicked(evt);
            }
        });
        jogador4Verde.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jogador4VerdeComponentMoved(evt);
            }
        });
        getContentPane().add(jogador4Verde);
        jogador4Verde.setBounds(110, 100, 40, 40);

        jogador1Vermelho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jogador1Vermelho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/peão vermelho.png"))); // NOI18N
        jogador1Vermelho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jogador1VermelhoMouseClicked(evt);
            }
        });
        jogador1Vermelho.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jogador1VermelhoComponentMoved(evt);
            }
        });
        getContentPane().add(jogador1Vermelho);
        jogador1Vermelho.setBounds(340, 30, 40, 40);

        jogador4Vermelho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jogador4Vermelho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/peão vermelho.png"))); // NOI18N
        jogador4Vermelho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jogador4VermelhoMouseClicked(evt);
            }
        });
        jogador4Vermelho.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jogador4VermelhoComponentMoved(evt);
            }
        });
        getContentPane().add(jogador4Vermelho);
        jogador4Vermelho.setBounds(400, 100, 50, 40);

        jogador3Vermelho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jogador3Vermelho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/peão vermelho.png"))); // NOI18N
        jogador3Vermelho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jogador3VermelhoMouseClicked(evt);
            }
        });
        jogador3Vermelho.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jogador3VermelhoComponentMoved(evt);
            }
        });
        getContentPane().add(jogador3Vermelho);
        jogador3Vermelho.setBounds(340, 100, 40, 40);

        jogador2Vermelho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jogador2Vermelho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/peão vermelho.png"))); // NOI18N
        jogador2Vermelho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jogador2VermelhoMouseClicked(evt);
            }
        });
        jogador2Vermelho.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jogador2VermelhoComponentMoved(evt);
            }
        });
        getContentPane().add(jogador2Vermelho);
        jogador2Vermelho.setBounds(400, 30, 50, 40);

        selecaoVermelho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo laranja.png"))); // NOI18N
        getContentPane().add(selecaoVermelho);
        selecaoVermelho.setBounds(308, 10, 175, 175);

        selecaoAmarelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo laranja.png"))); // NOI18N
        getContentPane().add(selecaoAmarelo);
        selecaoAmarelo.setBounds(10, 310, 175, 175);

        selecaoAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo laranja.png"))); // NOI18N
        getContentPane().add(selecaoAzul);
        selecaoAzul.setBounds(308, 310, 175, 175);

        selecaoVerde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo laranja.png"))); // NOI18N
        getContentPane().add(selecaoVerde);
        selecaoVerde.setBounds(10, 10, 175, 175);

        campoDeBatalha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campoDeBatalha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/51+WI6YJCjL.png"))); // NOI18N
        getContentPane().add(campoDeBatalha);
        campoDeBatalha.setBounds(0, 0, 490, 490);

        setSize(new java.awt.Dimension(496, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    int valorDoDado=0;
    int x=0;
    int ini=0,jogAtual=0,blocoAtual=0,jogVolta=0;
    boolean saiVerde1=false,saiVerde2=false,saiVerde3=false,saiVerde4=false;
    boolean saiVermelho1=false,saiVermelho2=false,saiVermelho3=false,saiVermelho4=false;
    boolean saiAzul1=false,saiAzul2=false,saiAzul3=false,saiAzul4=false;
    boolean saiAmarelo1=false,saiAmarelo2=false,saiAmarelo3=false,saiAmarelo4=false;
    boolean bloqueaDado=false;
    boolean moveVerde1=false,moveVerde2=false,moveVerde3=false,moveVerde4=false;
    boolean moveVermelho1=false,moveVermelho2=false,moveVermelho3=false,moveVermelho4=false;
    boolean moveAzul1=false,moveAzul2=false,moveAzul3=false,moveAzul4=false;
    boolean moveAmarelo1=false,moveAmarelo2=false,moveAmarelo3=false,moveAmarelo4=false;
    boolean verificaMoveu=false,voltou=false;
    int px=0,py=0,pxa=0,pya=0,cont=0,dadoSuporte=0;
    private void primeiroJogador(){
        Random num = new Random();
        blocoAtual=num.nextInt(4)+1;
    }
    private void passaVez(){
        if(blocoAtual==4){
            blocoAtual=1;
        }
        else{
            blocoAtual++;
        }
        if(blocoAtual==1){
            selecaoVerde.setVisible(true);
            selecaoVermelho.setVisible(false);
            selecaoAzul.setVisible(false);
            selecaoAmarelo.setVisible(false);
        }
        else if(blocoAtual==2){
            selecaoVerde.setVisible(false);
            selecaoVermelho.setVisible(true);
            selecaoAzul.setVisible(false);
            selecaoAmarelo.setVisible(false);
        }
        else if(blocoAtual==3){
            selecaoVerde.setVisible(false);
            selecaoVermelho.setVisible(false);
            selecaoAzul.setVisible(true);
            selecaoAmarelo.setVisible(false);
        }
        else if(blocoAtual==4){
            selecaoVerde.setVisible(false);
            selecaoVermelho.setVisible(false);
            selecaoAzul.setVisible(false);
            selecaoAmarelo.setVisible(true);
        }
    }
    private void dadoJogado(){
        voltou=false;
        if(valorDoDado==6&&blocoAtual==1){
            bloqueaDado=true;
            if(jogador1Verde.getX()==40&&jogador1Verde.getY()==30){
                saiVerde1=true;
            }
            if(jogador2Verde.getX()==110&&jogador2Verde.getY()==30){
                saiVerde2=true;
            }
            if(jogador3Verde.getX()==40&&jogador3Verde.getY()==100){
                saiVerde3=true;
            }
            if(jogador4Verde.getX()==110&&jogador4Verde.getY()==100){
                saiVerde4=true;
            }
        }
        else if(valorDoDado==6&&blocoAtual==2){
            bloqueaDado=true;
            if(jogador1Vermelho.getX()==340&&jogador1Vermelho.getY()==30){
                saiVermelho1=true;
            }
            if(jogador2Vermelho.getX()==400&&jogador2Vermelho.getY()==30){
                saiVermelho2=true;
            }
            if(jogador3Vermelho.getX()==340&&jogador3Vermelho.getY()==100){
                saiVermelho3=true;
            }
            if(jogador4Vermelho.getX()==400&&jogador4Vermelho.getY()==100){
                saiVermelho4=true;
            }
        }
        else if(valorDoDado==6&&blocoAtual==4){
            bloqueaDado=true;
            if(jogador1Amarelo.getX()==40&&jogador1Amarelo.getY()==330){
                saiAmarelo1=true;
            }
            if(jogador2Amarelo.getX()==110&&jogador2Amarelo.getY()==330){
                saiAmarelo2=true;
            }
            if(jogador3Amarelo.getX()==40&&jogador3Amarelo.getY()==390){
                saiAmarelo3=true;
            }
            if(jogador4Amarelo.getX()==110&&jogador4Amarelo.getY()==390){
                saiAmarelo4=true;
            }
        }
        else if(valorDoDado==6&&blocoAtual==3){
            bloqueaDado=true;
            if(jogador1Azul.getX()==340&&jogador1Azul.getY()==330){
                saiAzul1=true;
            }
            if(jogador2Azul.getX()==400&&jogador2Azul.getY()==330){
                saiAzul2=true;
            }
            if(jogador3Azul.getX()==340&&jogador3Azul.getY()==390){
                saiAzul3=true;
            }
            if(jogador4Azul.getX()==400&&jogador4Azul.getY()==390){
                saiAzul4=true;
            }
        }
        if(blocoAtual==1&&((jogador1Verde.getX()!=40&&jogador1Verde.getY()!=30)||(jogador2Verde.getX()!=110&&jogador2Verde.getY()!=30)||(jogador3Verde.getX()!=40&&jogador3Verde.getY()!=100)||(jogador4Verde.getX()!=110&&jogador4Verde.getY()!=100))){
            bloqueaDado=true;
            moveVerde1=true;
            moveVerde2=true;
            moveVerde3=true;
            moveVerde4=true;
        }
        else if(blocoAtual==2&&((jogador1Vermelho.getX()!=340&&jogador1Vermelho.getY()!=30)||(jogador2Vermelho.getX()!=400&&jogador2Vermelho.getY()!=30)||(jogador3Vermelho.getX()!=340&&jogador3Vermelho.getY()!=100)||(jogador4Vermelho.getX()!=400&&jogador4Vermelho.getY()!=100))){
            bloqueaDado=true;
            moveVermelho1=true;
            moveVermelho2=true;
            moveVermelho3=true;
            moveVermelho4=true;
        }
        else if(blocoAtual==4&&((jogador1Amarelo.getX()!=40&&jogador1Amarelo.getY()!=330)||(jogador2Amarelo.getX()!=110&&jogador2Amarelo.getY()!=330)||(jogador3Amarelo.getX()!=40&&jogador3Amarelo.getY()!=390)||(jogador4Amarelo.getX()!=110&&jogador4Amarelo.getY()!=390))){
            bloqueaDado=true;
            moveAmarelo1=true;
            moveAmarelo2=true;
            moveAmarelo3=true;
            moveAmarelo4=true;
        }
        else if(blocoAtual==3&&((jogador1Azul.getX()!=340&&jogador1Azul.getY()!=330)||(jogador2Azul.getX()!=400&&jogador2Azul.getY()!=330)||(jogador3Azul.getX()!=340&&jogador3Azul.getY()!=390)||(jogador4Azul.getX()!=400&&jogador4Azul.getY()!=390))){
            bloqueaDado=true;
            moveAzul1=true;
            moveAzul2=true;
            moveAzul3=true;
            moveAzul4=true;
        }
    }
    private void moveJogador(){
        if(blocoAtual==1&&(px>=-13&&px<=-7)&&(py>=210&&py<=216)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px<23){
                            px++;
                        }  
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        if(px==23){
                            px=23;
                            py=213;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if(blocoAtual==1&&(px>=20&&px<=26)&&(py>=210&&py<=216)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px<56){
                            px++;
                        }  
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        if(px==56){
                            px=56;
                            py=213;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if(blocoAtual==1&&(px>=53&&px<=59)&&(py>=210&&py<=216)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px<89){
                            px++;
                        }  
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        if(px==89){
                            px=89;
                            py=213;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if(blocoAtual==1&&(px>=86&&px<=92)&&(py>=210&&py<=216)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px<122){
                            px++;
                        }  
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        if(px==122){
                            px=122;
                            py=213;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if(blocoAtual==1&&(px>=119&&px<=125)&&(py>=210&&py<=216)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px<155){
                            px++;
                        }  
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        if(px==155){
                            px=155;
                            py=213;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if(blocoAtual==1&&(px>=152&&px<=158)&&(py>=210&&py<=216)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px<188){
                            px++;
                        }  
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        if(px==188){
                            px=188;
                            py=213;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if(blocoAtual==2&&(px>=218&&px<=224)&&(py>=-21&&py<=-15)){//começo do vermelho
            new Thread(){
                public void run(){
                    while(true){
                        if(py<15){
                            py++;
                        }  
                        if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        if(py==15){
                            px=221;
                            py=15;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if(blocoAtual==2&&(px>=218&&px<=224)&&(py>=12&&py<=18)){
            new Thread(){
                public void run(){
                    while(true){
                        if(py<48){
                            py++;
                        }  
                        if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        if(py==48){
                            px=221;
                            py=48;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if(blocoAtual==2&&(px>=218&&px<=224)&&(py>=45&&py<=51)){
            new Thread(){
                public void run(){
                    while(true){
                        if(py<81){
                            py++;
                        }  
                        if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        if(py==81){
                            px=221;
                            py=81;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if(blocoAtual==2&&(px>=218&&px<=224)&&(py>=78&&py<=84)){
            new Thread(){
                public void run(){
                    while(true){
                        if(py<114){
                            py++;
                        }  
                        if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        if(py==114){
                            px=221;
                            py=114;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if(blocoAtual==2&&(px>=218&&px<=224)&&(py>=111&&py<=117)){
            new Thread(){
                public void run(){
                    while(true){
                        if(py<147){
                            py++;
                        }  
                        if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        if(py==147){
                            px=221;
                            py=147;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if(blocoAtual==2&&(px>=218&&px<=224)&&(py>=144&&py<=150)){
            new Thread(){
                public void run(){
                    while(true){
                        if(py<180){
                            py++;
                        }  
                        if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        if(py==180){
                            px=221;
                            py=180;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if(blocoAtual==3&&(px>=449&&px<=455)&&(py>=210&&py<=216)){//começo do azul
            new Thread(){
                public void run(){
                    while(true){
                        if(px>419){
                            px--;
                        }  
                        if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        if(px==419){
                            px=419;
                            py=213;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if(blocoAtual==3&&(px>=416&&px<=422)&&(py>=210&&py<=216)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px>386){
                            px--;
                        }  
                        if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        if(px==386){
                            px=386;
                            py=213;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if(blocoAtual==3&&(px>=383&&px<=389)&&(py>=210&&py<=216)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px>353){
                            px--;
                        }  
                        if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        if(px==353){
                            px=353;
                            py=213;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if(blocoAtual==3&&(px>=350&&px<=356)&&(py>=210&&py<=216)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px>320){
                            px--;
                        }  
                        if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        if(px==320){
                            px=320;
                            py=213;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if(blocoAtual==3&&(px>=317&&px<=323)&&(py>=210&&py<=216)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px>287){
                            px--;
                        }  
                        if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        if(px==287){
                            px=287;
                            py=213;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if(blocoAtual==3&&(px>=284&&px<=290)&&(py>=210&&py<=216)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px>254){
                            px--;
                        }  
                        if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        if(px==254){
                            px=254;
                            py=213;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if(blocoAtual==4&&(px>=218&&px<=224)&&(py>=441&&py<=447)){//começo do amarelo
            new Thread(){
                public void run(){
                    while(true){
                        if(py>411){
                            py--;
                        }  
                        if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(py==411){
                            px=221;
                            py=411;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if(blocoAtual==4&&(px>=218&&px<=224)&&(py>=408&&py<=414)){
            new Thread(){
                public void run(){
                    while(true){
                        if(py>378){
                            py--;
                        }  
                        if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(py==378){
                            px=221;
                            py=378;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if(blocoAtual==4&&(px>=218&&px<=224)&&(py>=375&&py<=381)){
            new Thread(){
                public void run(){
                    while(true){
                        if(py>345){
                            py--;
                        }  
                        if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(py==345){
                            px=221;
                            py=345;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if(blocoAtual==4&&(px>=218&&px<=224)&&(py>=342&&py<=348)){
            new Thread(){
                public void run(){
                    while(true){
                        if(py>312){
                            py--;
                        }  
                        if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(py==312){
                            px=221;
                            py=312;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if(blocoAtual==4&&(px>=218&&px<=224)&&(py>=309&&py<=315)){
            new Thread(){
                public void run(){
                    while(true){
                        if(py>279){
                            py--;
                        }  
                        if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(py==279){
                            px=221;
                            py=279;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if(blocoAtual==4&&(px>=218&&px<=224)&&(py>=276&&py<=282)){
            new Thread(){
                public void run(){
                    while(true){
                        if(py>246){
                            py--;
                        }  
                        if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(py==246){
                            px=221;
                            py=246;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=-13&&px<=-7)&&(py>=177&&py<=183)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px<23){
                            px++;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(px==23){
                            px=23;
                            py=180;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=20&&px<=26)&&(py>=177&&py<=183)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px<56){
                            px++;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(px==56){
                            px=56;
                            py=180;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=53&&px<=59)&&(py>=177&&py<=183)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px<89){
                            px++;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }  
                        if(px==89){
                            px=89;
                            py=180;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=86&&px<=92)&&(py>=177&&py<=183)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px<122){
                            px++;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }   
                        if(px==122){
                            px=122;
                            py=180;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=119&&px<=125)&&(py>=177&&py<=183)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px<155){
                            px++;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }  
                        if(px==155){
                            px=155;
                            py=180;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=152&&px<=158)&&(py>=177&&py<=183)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px<188){
                            px++;
                        }   
                        if(py>147){
                            py--;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(px==188&&py==147){
                            px=188;
                            py=147;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=185&&px<=191)&&(py>=144&&py<=150)){
            new Thread(){
                public void run(){
                    while(true){
                        if(py>114){
                            py--;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(py==114){
                            px=188;
                            py=114;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=185&&px<=191)&&(py>=111&&py<=117)){
            new Thread(){
                public void run(){
                    while(true){
                        if(py>81){
                            py--;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(py==81){
                            px=188;
                            py=81;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=185&&px<=191)&&(py>=78&&py<=84)){
            new Thread(){
                public void run(){
                    while(true){
                        if(py>48){
                            py--;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(py==48){
                            px=188;
                            py=48;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=185&&px<=191)&&(py>=45&&py<=51)){
            new Thread(){
                public void run(){
                    while(true){
                        if(py>15){
                            py--;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(py==15){
                            px=188;
                            py=15;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=185&&px<=191)&&(py>=12&&py<=18)){
            new Thread(){
                public void run(){
                    while(true){
                        if(py>-18){
                            py--;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(py==-18){
                            px=188;
                            py=-18;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=185&&px<=191)&&(py>=-21&&py<=-15)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px<221){
                            px++;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(px==221){
                            px=221;
                            py=-18;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=218&&px<=224)&&(py>=-21&&py<=-15)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px<254){
                           px++;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(px==254){
                            px=254;
                            py=-18;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=251&&px<=257)&&(py>=-21&&py<=-15)){
            new Thread(){
                public void run(){
                    while(true){
                        if(py<15){
                            py++;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(py==15){
                            px=254;
                            py=15;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=251&&px<=257)&&(py>=12&&py<=18)){
            new Thread(){
                public void run(){
                    while(true){
                        if(py<48){
                            py++;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(py==48){
                            px=254;
                            py=48;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=251&&px<=257)&&(py>=45&&py<=51)){
            new Thread(){
                public void run(){
                    while(true){
                        if(py<81){
                            py++;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(py==81){
                            px=254;
                            py=81;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=251&&px<=257)&&(py>=78&&py<=84)){
            new Thread(){
                public void run(){
                    while(true){
                        if(py<114){
                            py++;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(py==114){
                            px=254;
                            py=114;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=251&&px<=257)&&(py>=111&&py<=117)){
            new Thread(){
                public void run(){
                    while(true){
                        if(py<147){
                            py++;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(py==147){
                            px=254;
                            py=147;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=251&&px<=257)&&(py>=144&&py<=150)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px<287){
                            px++;
                        }
                        if(py<180){
                            py++;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(px==287&&py==180){
                            px=287;
                            py=180;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=284&&px<=290)&&(py>=177&&py<=183)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px<320){
                            px++;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(px==320){
                            px=320;
                            py=180;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=317&&px<=323)&&(py>=177&&py<=183)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px<353){
                            px++;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(px==353){
                            px=353;
                            py=180;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=350&&px<=356)&&(py>=177&&py<=183)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px<386){
                            px++;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(px==386){
                            px=386;
                            py=180;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=383&&px<=389)&&(py>=177&&py<=183)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px<419){
                            px++;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(px==419){
                            px=419;
                            py=180;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=416&&px<=422)&&(py>=177&&py<=183)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px<452){
                            px++;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(px==452){
                            px=452;
                            py=180;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=449&&px<=455)&&(py>=177&&py<=183)){
            new Thread(){
                public void run(){
                    while(true){
                        if(py<213){
                            py++;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(py==213){
                            px=452;
                            py=213;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=449&&px<=455)&&(py>=210&&py<=216)){
            new Thread(){
                public void run(){
                    while(true){
                        if(py<246){
                            py++;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(py==246){
                            px=452;
                            py=246;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=449&&px<=455)&&(py>=243&&py<=249)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px>419){
                            px--;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(px==419){
                            px=419;
                            py=246;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=416&&px<=422)&&(py>=243&&py<=249)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px>386){
                            px--;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(px==386){
                            px=386;
                            py=246;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=383&&px<=389)&&(py>=243&&py<=249)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px>353){
                            px--;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(px==353){
                            px=353;
                            py=246;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=350&&px<=356)&&(py>=243&&py<=249)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px>320){
                            px--;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(px==320){
                            px=320;
                            py=246;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=317&&px<=323)&&(py>=243&&py<=249)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px>287){
                            px--;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(px==287){
                            px=287;
                            py=246;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=284&&px<=290)&&(py>=243&&py<=249)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px>254){
                            px--;
                        }
                        if(py<279){
                            py++;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(px==254&&py==279){
                            px=254;
                            py=279;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=251&&px<=257)&&(py>=276&&py<=282)){
            new Thread(){
                public void run(){
                    while(true){
                        if(py<312){
                            py++;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(py==312){
                            px=254;
                            py=312;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=251&&px<=257)&&(py>=309&&py<=315)){
            new Thread(){
                public void run(){
                    while(true){
                        if(py<345){
                            py++;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(py==345){
                            px=254;
                            py=345;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=251&&px<=257)&&(py>=342&&py<=348)){
            new Thread(){
                public void run(){
                    while(true){
                        if(py<378){
                            py++;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(py==378){
                            px=254;
                            py=378;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=251&&px<=257)&&(py>=375&&py<=381)){
            new Thread(){
                public void run(){
                    while(true){
                        if(py<411){
                            py++;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(py==411){
                            px=254;
                            py=411;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=251&&px<=257)&&(py>=408&&py<=414)){
            new Thread(){
                public void run(){
                    while(true){
                        if(py<444){
                            py++;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(py==444){
                            px=254;
                            py=444;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=251&&px<=257)&&(py>=441&&py<=447)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px>221){
                            px--;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(px==221){
                            px=221;
                            py=444;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=218&&px<=224)&&(py>=441&&py<=447)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px>188){
                            px--;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(px==188){
                            px=188;
                            py=444;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=185&&px<=191)&&(py>=441&&py<=447)){
            new Thread(){
                public void run(){
                    while(true){
                        if(py>411){
                            py--;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(py==411){
                            px=188;
                            py=411;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=185&&px<=191)&&(py>=408&&py<=414)){
            new Thread(){
                public void run(){
                    while(true){
                        if(py>378){
                            py--;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(py==378){
                            px=188;
                            py=378;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=185&&px<=191)&&(py>=375&&py<=381)){
            new Thread(){
                public void run(){
                    while(true){
                        if(py>345){
                            py--;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(py==345){
                            px=188;
                            py=345;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=185&&px<=191)&&(py>=342&&py<=348)){
            new Thread(){
                public void run(){
                    while(true){
                        if(py>312){
                            py--;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(py==312){
                            px=188;
                            py=312;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=185&&px<=191)&&(py>=309&&py<=315)){
            new Thread(){
                public void run(){
                    while(true){
                        if(py>279){
                            py--;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(py==279){
                            px=188;
                            py=279;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=185&&px<=191)&&(py>=276&&py<=282)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px>155){
                            px--;
                        }
                        if(py>246){
                            py--;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(px==155&&py==246){
                            px=155;
                            py=246;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=152&&px<=158)&&(py>=243&&py<=249)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px>122){
                            px--;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(px==122){
                            px=122;
                            py=246;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=119&&px<=125)&&(py>=243&&py<=249)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px>89){
                            px--;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(px==89){
                            px=89;
                            py=246;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=86&&px<=92)&&(py>=243&&py<=249)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px>56){
                            px--;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(px==56){
                            px=56;
                            py=246;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=53&&px<=59)&&(py>=243&&py<=249)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px>23){
                            px--;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(px==23){
                            px=23;
                            py=246;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=20&&px<=26)&&(py>=243&&py<=249)){
            new Thread(){
                public void run(){
                    while(true){
                        if(px>-10){
                            px--;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(px==-10){
                            px=-10;
                            py=246;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=-13&&px<=-7)&&(py>=243&&py<=249)){
            new Thread(){
                public void run(){
                    while(true){
                        if(py>213){
                            py--;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(py==213){
                            px=-10;
                            py=213;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        else if((px>=-13&&px<=-7)&&(py>=210&&py<=216)){
            new Thread(){
                public void run(){
                    while(true){
                        if(py>180){
                            py--;
                        }
                        if(jogAtual==1){
                            jogador1Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==2){
                            jogador2Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==3){
                            jogador3Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==4){
                            jogador4Verde.setLocation(px,py); 
                        }
                        else if(jogAtual==5){
                            jogador1Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==6){
                            jogador2Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==7){
                            jogador3Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==8){
                            jogador4Vermelho.setLocation(px,py); 
                        }
                        else if(jogAtual==9){
                            jogador1Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==10){
                            jogador2Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==11){
                            jogador3Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==12){
                            jogador4Azul.setLocation(px,py); 
                        }
                        else if(jogAtual==13){
                            jogador1Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==14){
                            jogador2Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==15){
                            jogador3Amarelo.setLocation(px,py); 
                        }
                        else if(jogAtual==16){
                            jogador4Amarelo.setLocation(px,py); 
                        }
                        if(py==180){
                            px=-10;
                            py=180;
                            break;
                        }
                        try {
                            sleep(10);
                        } catch (Exception e) {
                        }
                    }
                }
            }.start();
        }
        cont=0;
    }
    
    private void jogador1VerdeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jogador1VerdeMouseClicked
        if((valorDoDado>1&&jogador1Verde.getX()>=152&&jogador1Verde.getX()<=158&&jogador1Verde.getY()>=210&&jogador1Verde.getY()<=216)||(valorDoDado>2&&jogador1Verde.getX()>=119&&jogador1Verde.getX()<=125&&jogador1Verde.getY()>=210&&jogador1Verde.getY()<=216)||(valorDoDado>3&&jogador1Verde.getX()>=86&&jogador1Verde.getX()<=92&&jogador1Verde.getY()>=210&&jogador1Verde.getY()<=216)||(valorDoDado>4&&jogador1Verde.getX()>=53&&jogador1Verde.getX()<=59&&jogador1Verde.getY()>=210&&jogador1Verde.getY()<=216)||(valorDoDado>5&&jogador1Verde.getX()>=20&&jogador1Verde.getX()<=26&&jogador1Verde.getY()>=210&&jogador1Verde.getY()<=216)){
        
        }
        else{
            jogAtual=1;
            blocoAtual=1;
            if(saiVerde1==true){
                verde1Sai();
                moveVerde1=false;
                moveVerde2=false;
                moveVerde3=false;
                moveVerde4=false;
                saiVerde1=false;
                saiVerde2=false;
                saiVerde3=false;
                saiVerde4=false;
                bloqueaDado=false;
            }
            else if(moveVerde1==true){
                px=jogador1Verde.getX();
                py=jogador1Verde.getY();
                moveJogador();
                dadoSuporte=1;
                if(valorDoDado==1){
                    moveVerde1=false;
                    moveVerde2=false;
                    moveVerde3=false;
                    moveVerde4=false;
                    saiVerde1=false;
                    saiVerde2=false;
                    saiVerde3=false;
                    saiVerde4=false;
                    bloqueaDado=false;
                    px=jogador1Verde.getX();
                    py=jogador1Verde.getY();
                    if(voltou==false){
                        passaVez();
                    }
                }
            }
        }
    }//GEN-LAST:event_jogador1VerdeMouseClicked
    private void lado6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lado6MouseClicked
        if(bloqueaDado==false){
            moveDado();
        }
    }//GEN-LAST:event_lado6MouseClicked

    private void lado5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lado5MouseClicked
        if(bloqueaDado==false){
            moveDado();
        }
    }//GEN-LAST:event_lado5MouseClicked

    private void lado4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lado4MouseClicked
        if(bloqueaDado==false){
            moveDado();
        }
    }//GEN-LAST:event_lado4MouseClicked

    private void lado3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lado3MouseClicked
        if(bloqueaDado==false){
            moveDado();
        }
    }//GEN-LAST:event_lado3MouseClicked

    private void lado2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lado2MouseClicked
        if(bloqueaDado==false){
            moveDado();
        }
    }//GEN-LAST:event_lado2MouseClicked

    private void lado1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lado1MouseClicked
        if(bloqueaDado==false){
            moveDado();
        }
    }//GEN-LAST:event_lado1MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if(ini==0){
            ini++;
            primeiroJogador();
            if(blocoAtual==1){
                selecaoVerde.setVisible(true);
            }
            else if(blocoAtual==2){
                selecaoVermelho.setVisible(true);
            }
            else if(blocoAtual==3){
                selecaoAzul.setVisible(true);
            }
            else{
                selecaoAmarelo.setVisible(true);
            }
        }
    }//GEN-LAST:event_formWindowActivated

    private void jogador2VerdeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jogador2VerdeMouseClicked
        if((valorDoDado>1&&jogador2Verde.getX()>=152&&jogador2Verde.getX()<=158&&jogador2Verde.getY()>=210&&jogador2Verde.getY()<=216)||(valorDoDado>2&&jogador2Verde.getX()>=119&&jogador2Verde.getX()<=125&&jogador2Verde.getY()>=210&&jogador2Verde.getY()<=216)||(valorDoDado>3&&jogador2Verde.getX()>=86&&jogador2Verde.getX()<=92&&jogador2Verde.getY()>=210&&jogador2Verde.getY()<=216)||(valorDoDado>4&&jogador2Verde.getX()>=53&&jogador2Verde.getX()<=59&&jogador2Verde.getY()>=210&&jogador2Verde.getY()<=216)||(valorDoDado>5&&jogador2Verde.getX()>=20&&jogador2Verde.getX()<=26&&jogador2Verde.getY()>=210&&jogador2Verde.getY()<=216)){
        
        }
        else{
            jogAtual=2;
            blocoAtual=1;
            if(saiVerde2==true){
                verde2Sai();
                moveVerde1=false;
                moveVerde2=false;
                moveVerde3=false;
                moveVerde4=false;
                saiVerde1=false;
                saiVerde2=false;
                saiVerde3=false;
                saiVerde4=false;
                bloqueaDado=false;
            }
            else if(moveVerde2==true){
                px=jogador2Verde.getX();
                py=jogador2Verde.getY();
                moveJogador();
                dadoSuporte=1;
                if(valorDoDado==1){
                    moveVerde1=false;
                    moveVerde2=false;
                    moveVerde3=false;
                    moveVerde4=false;
                    saiVerde1=false;
                    saiVerde2=false;
                    saiVerde3=false;
                    saiVerde4=false;
                    bloqueaDado=false;
                    px=jogador2Verde.getX();
                    py=jogador2Verde.getY();
                    if(voltou==false){
                        passaVez();
                    }
                }
            }
        }
    }//GEN-LAST:event_jogador2VerdeMouseClicked

    private void jogador3VerdeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jogador3VerdeMouseClicked
        if((valorDoDado>1&&jogador3Verde.getX()>=152&&jogador3Verde.getX()<=158&&jogador3Verde.getY()>=210&&jogador3Verde.getY()<=216)||(valorDoDado>2&&jogador3Verde.getX()>=119&&jogador3Verde.getX()<=125&&jogador3Verde.getY()>=210&&jogador3Verde.getY()<=216)||(valorDoDado>3&&jogador3Verde.getX()>=86&&jogador3Verde.getX()<=92&&jogador3Verde.getY()>=210&&jogador3Verde.getY()<=216)||(valorDoDado>4&&jogador3Verde.getX()>=53&&jogador3Verde.getX()<=59&&jogador3Verde.getY()>=210&&jogador3Verde.getY()<=216)||(valorDoDado>5&&jogador3Verde.getX()>=20&&jogador3Verde.getX()<=26&&jogador3Verde.getY()>=210&&jogador3Verde.getY()<=216)){
        
        }
        else{
            jogAtual=3;
            blocoAtual=1;
            if(saiVerde3==true){
                verde3Sai();
                moveVerde1=false;
                moveVerde2=false;
                moveVerde3=false;
                moveVerde4=false;
                saiVerde1=false;
                saiVerde2=false;
                saiVerde3=false;
                saiVerde4=false;
                bloqueaDado=false;
            }
            else if(moveVerde3==true){
                px=jogador3Verde.getX();
                py=jogador3Verde.getY();
                moveJogador();
                dadoSuporte=1;
                if(valorDoDado==1){
                    moveVerde1=false;
                    moveVerde2=false;
                    moveVerde3=false;
                    moveVerde4=false;
                    saiVerde1=false;
                    saiVerde2=false;
                    saiVerde3=false;
                    saiVerde4=false;
                    bloqueaDado=false;
                    px=jogador3Verde.getX();
                    py=jogador3Verde.getY();
                    if(voltou==false){
                        passaVez();
                    }
                }
            }
        }
    }//GEN-LAST:event_jogador3VerdeMouseClicked

    private void jogador1VermelhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jogador1VermelhoMouseClicked
        if((valorDoDado>1&&jogador1Vermelho.getX()>=218&&jogador1Vermelho.getX()<=224&&jogador1Vermelho.getY()>=144&&jogador1Vermelho.getY()<=150)||(valorDoDado>2&&jogador1Vermelho.getX()>=218&&jogador1Vermelho.getX()<=224&&jogador1Vermelho.getY()>=111&&jogador1Vermelho.getY()<=117)||(valorDoDado>3&&jogador1Vermelho.getX()>=218&&jogador1Vermelho.getX()<=224&&jogador1Vermelho.getY()>=78&&jogador1Vermelho.getY()<=84)||(valorDoDado>4&&jogador1Vermelho.getX()>=218&&jogador1Vermelho.getX()<=224&&jogador1Vermelho.getY()>=45&&jogador1Vermelho.getY()<=51)||(valorDoDado>5&&jogador1Vermelho.getX()>=218&&jogador1Vermelho.getX()<=224&&jogador1Vermelho.getY()>=12&&jogador1Vermelho.getY()<=18)){
        
        }
        else{
            jogAtual=5;
            blocoAtual=2;
            if(saiVermelho1==true){
                vermelho1Sai();
                moveVermelho1=false;
                moveVermelho2=false;
                moveVermelho3=false;
                moveVermelho4=false;
                saiVermelho1=false;
                saiVermelho2=false;
                saiVermelho3=false;
                saiVermelho4=false;
                bloqueaDado=false;
            }
            else if(moveVermelho1==true){
                px=jogador1Vermelho.getX();
                py=jogador1Vermelho.getY();
                moveJogador();
                dadoSuporte=1;
                if(valorDoDado==1){
                    moveVermelho1=false;
                    moveVermelho2=false;
                    moveVermelho3=false;
                    moveVermelho4=false;
                    saiVermelho1=false;
                    saiVermelho2=false;
                    saiVermelho3=false;
                    saiVermelho4=false;
                    bloqueaDado=false;
                    px=jogador1Vermelho.getX();
                    py=jogador1Vermelho.getY();
                    if(voltou==false){
                        passaVez();
                    }
                }
            }
        }
    }//GEN-LAST:event_jogador1VermelhoMouseClicked

    private void jogador2VermelhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jogador2VermelhoMouseClicked
        if((valorDoDado>1&&jogador2Vermelho.getX()>=218&&jogador2Vermelho.getX()<=224&&jogador2Vermelho.getY()>=144&&jogador2Vermelho.getY()<=150)||(valorDoDado>2&&jogador2Vermelho.getX()>=218&&jogador2Vermelho.getX()<=224&&jogador2Vermelho.getY()>=111&&jogador2Vermelho.getY()<=117)||(valorDoDado>3&&jogador2Vermelho.getX()>=218&&jogador2Vermelho.getX()<=224&&jogador2Vermelho.getY()>=78&&jogador2Vermelho.getY()<=84)||(valorDoDado>4&&jogador2Vermelho.getX()>=218&&jogador2Vermelho.getX()<=224&&jogador2Vermelho.getY()>=45&&jogador2Vermelho.getY()<=51)||(valorDoDado>5&&jogador2Vermelho.getX()>=218&&jogador2Vermelho.getX()<=224&&jogador2Vermelho.getY()>=12&&jogador2Vermelho.getY()<=18)){
        
        }
        else{
            jogAtual=6;
            blocoAtual=2;
            if(saiVermelho2==true){
                vermelho2Sai();
                moveVermelho1=false;
                moveVermelho2=false;
                moveVermelho3=false;
                moveVermelho4=false;
                saiVermelho1=false;
                saiVermelho2=false;
                saiVermelho3=false;
                saiVermelho4=false;
                bloqueaDado=false;
            }
            else if(moveVermelho2==true){
                px=jogador2Vermelho.getX();
                py=jogador2Vermelho.getY();
                moveJogador();
                dadoSuporte=1;
                if(valorDoDado==1){
                    moveVermelho1=false;
                    moveVermelho2=false;
                    moveVermelho3=false;
                    moveVermelho4=false;
                    saiVermelho1=false;
                    saiVermelho2=false;
                    saiVermelho3=false;
                    saiVermelho4=false;
                    bloqueaDado=false;
                    px=jogador2Vermelho.getX();
                    py=jogador2Vermelho.getY();
                    if(voltou==false){
                        passaVez();
                    }
                }
            }
        }
    }//GEN-LAST:event_jogador2VermelhoMouseClicked

    private void jogador3VermelhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jogador3VermelhoMouseClicked
        if((valorDoDado>1&&jogador3Vermelho.getX()>=218&&jogador3Vermelho.getX()<=224&&jogador3Vermelho.getY()>=144&&jogador3Vermelho.getY()<=150)||(valorDoDado>2&&jogador3Vermelho.getX()>=218&&jogador3Vermelho.getX()<=224&&jogador3Vermelho.getY()>=111&&jogador3Vermelho.getY()<=117)||(valorDoDado>3&&jogador3Vermelho.getX()>=218&&jogador3Vermelho.getX()<=224&&jogador3Vermelho.getY()>=78&&jogador3Vermelho.getY()<=84)||(valorDoDado>4&&jogador3Vermelho.getX()>=218&&jogador3Vermelho.getX()<=224&&jogador3Vermelho.getY()>=45&&jogador3Vermelho.getY()<=51)||(valorDoDado>5&&jogador3Vermelho.getX()>=218&&jogador3Vermelho.getX()<=224&&jogador3Vermelho.getY()>=12&&jogador3Vermelho.getY()<=18)){
        
        }
        else{
            jogAtual=7;
            blocoAtual=2;
            if(saiVermelho3==true){
                vermelho3Sai();
                moveVermelho1=false;
                moveVermelho2=false;
                moveVermelho3=false;
                moveVermelho4=false;
                saiVermelho1=false;
                saiVermelho2=false;
                saiVermelho3=false;
                saiVermelho4=false;
                bloqueaDado=false;
            }
            else if(moveVermelho3==true){
                px=jogador3Vermelho.getX();
                py=jogador3Vermelho.getY();
                moveJogador();
                dadoSuporte=1;
                if(valorDoDado==1){
                    moveVermelho1=false;
                    moveVermelho2=false;
                    moveVermelho3=false;
                    moveVermelho4=false;
                    saiVermelho1=false;
                    saiVermelho2=false;
                    saiVermelho3=false;
                    saiVermelho4=false;
                    bloqueaDado=false;
                    px=jogador3Vermelho.getX();
                    py=jogador3Vermelho.getY();
                    if(voltou==false){
                        passaVez();
                    }
                }
            }
        }
    }//GEN-LAST:event_jogador3VermelhoMouseClicked

    private void jogador4VermelhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jogador4VermelhoMouseClicked
        if((valorDoDado>1&&jogador4Vermelho.getX()>=218&&jogador4Vermelho.getX()<=224&&jogador4Vermelho.getY()>=144&&jogador4Vermelho.getY()<=150)||(valorDoDado>2&&jogador4Vermelho.getX()>=218&&jogador4Vermelho.getX()<=224&&jogador4Vermelho.getY()>=111&&jogador4Vermelho.getY()<=117)||(valorDoDado>3&&jogador4Vermelho.getX()>=218&&jogador4Vermelho.getX()<=224&&jogador4Vermelho.getY()>=78&&jogador4Vermelho.getY()<=84)||(valorDoDado>4&&jogador4Vermelho.getX()>=218&&jogador4Vermelho.getX()<=224&&jogador4Vermelho.getY()>=45&&jogador4Vermelho.getY()<=51)||(valorDoDado>5&&jogador4Vermelho.getX()>=218&&jogador4Vermelho.getX()<=224&&jogador4Vermelho.getY()>=12&&jogador4Vermelho.getY()<=18)){
        
        }
        else{
            jogAtual=8;
            blocoAtual=2;
            if(saiVermelho4==true){
                vermelho4Sai();
                moveVermelho1=false;
                moveVermelho2=false;
                moveVermelho3=false;
                moveVermelho4=false;
                saiVermelho1=false;
                saiVermelho2=false;
                saiVermelho3=false;
                saiVermelho4=false;
                bloqueaDado=false;
            }
            else if(moveVermelho4==true){
                px=jogador4Vermelho.getX();
                py=jogador4Vermelho.getY();
                moveJogador();
                dadoSuporte=1;
                if(valorDoDado==1){
                    moveVermelho1=false;
                    moveVermelho2=false;
                    moveVermelho3=false;
                    moveVermelho4=false;
                    saiVermelho1=false;
                    saiVermelho2=false;
                    saiVermelho3=false;
                    saiVermelho4=false;
                    bloqueaDado=false;
                    px=jogador4Vermelho.getX();
                    py=jogador4Vermelho.getY();
                    if(voltou==false){
                        passaVez();
                    }
                }
            }
        }
    }//GEN-LAST:event_jogador4VermelhoMouseClicked

    private void jogador1AmareloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jogador1AmareloMouseClicked
        if((valorDoDado>1&&jogador1Amarelo.getX()>=218&&jogador1Amarelo.getX()<=224&&jogador1Amarelo.getY()>=276&&jogador1Amarelo.getY()<=282)||(valorDoDado>2&&jogador1Amarelo.getX()>=218&&jogador1Amarelo.getX()<=224&&jogador1Amarelo.getY()>=309&&jogador1Amarelo.getY()<=315)||(valorDoDado>3&&jogador1Amarelo.getX()>=218&&jogador1Amarelo.getX()<=224&&jogador1Amarelo.getY()>=342&&jogador1Amarelo.getY()<=348)||(valorDoDado>4&&jogador1Amarelo.getX()>=218&&jogador1Amarelo.getX()<=224&&jogador1Amarelo.getY()>=375&&jogador1Amarelo.getY()<=381)||(valorDoDado>5&&jogador1Amarelo.getX()>=218&&jogador1Amarelo.getX()<=224&&jogador1Amarelo.getY()>=408&&jogador1Amarelo.getY()<=414)){
        
        }
        else{
            jogAtual=13;
            blocoAtual=4;
            if(saiAmarelo1==true){
                amarelo1Sai();
                moveAmarelo1=false;
                moveAmarelo2=false;
                moveAmarelo3=false;
                moveAmarelo4=false;
                saiAmarelo1=false;
                saiAmarelo2=false;
                saiAmarelo3=false;
                saiAmarelo4=false;
                bloqueaDado=false;
            }
            else if(moveAmarelo1==true){
                px=jogador1Amarelo.getX();
                py=jogador1Amarelo.getY();
                moveJogador();
                dadoSuporte=1;
                if(valorDoDado==1){
                    moveAmarelo1=false;
                    moveAmarelo2=false;
                    moveAmarelo3=false;
                    moveAmarelo4=false;
                    saiAmarelo1=false;
                    saiAmarelo2=false;
                    saiAmarelo3=false;
                    saiAmarelo4=false;
                    bloqueaDado=false;
                    px=jogador1Amarelo.getX();
                    py=jogador1Amarelo.getY();
                    if(voltou==false){
                        passaVez();
                    }
                }
            }
        }
    }//GEN-LAST:event_jogador1AmareloMouseClicked

    private void jogador2AmareloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jogador2AmareloMouseClicked
        if((valorDoDado>1&&jogador2Amarelo.getX()>=218&&jogador2Amarelo.getX()<=224&&jogador2Amarelo.getY()>=276&&jogador2Amarelo.getY()<=282)||(valorDoDado>2&&jogador2Amarelo.getX()>=218&&jogador2Amarelo.getX()<=224&&jogador2Amarelo.getY()>=309&&jogador2Amarelo.getY()<=315)||(valorDoDado>3&&jogador2Amarelo.getX()>=218&&jogador2Amarelo.getX()<=224&&jogador2Amarelo.getY()>=342&&jogador2Amarelo.getY()<=348)||(valorDoDado>4&&jogador2Amarelo.getX()>=218&&jogador2Amarelo.getX()<=224&&jogador2Amarelo.getY()>=375&&jogador2Amarelo.getY()<=381)||(valorDoDado>5&&jogador2Amarelo.getX()>=218&&jogador2Amarelo.getX()<=224&&jogador2Amarelo.getY()>=408&&jogador2Amarelo.getY()<=414)){
        
        }
        else{
            jogAtual=14;
            blocoAtual=4;
            if(saiAmarelo2==true){
                amarelo2Sai();
                moveAmarelo1=false;
                moveAmarelo2=false;
                moveAmarelo3=false;
                moveAmarelo4=false;
                saiAmarelo1=false;
                saiAmarelo2=false;
                saiAmarelo3=false;
                saiAmarelo4=false;
                bloqueaDado=false;
            }
            else if(moveAmarelo2==true){
                px=jogador2Amarelo.getX();
                py=jogador2Amarelo.getY();
                moveJogador();
                dadoSuporte=1;
                if(valorDoDado==1){
                    moveAmarelo1=false;
                    moveAmarelo2=false;
                    moveAmarelo3=false;
                    moveAmarelo4=false;
                    saiAmarelo1=false;
                    saiAmarelo2=false;
                    saiAmarelo3=false;
                    saiAmarelo4=false;
                    bloqueaDado=false;
                    px=jogador2Amarelo.getX();
                    py=jogador2Amarelo.getY();
                    if(voltou==false){
                        passaVez();
                    }
                }
            }
        }
    }//GEN-LAST:event_jogador2AmareloMouseClicked

    private void jogador3AmareloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jogador3AmareloMouseClicked
        if((valorDoDado>1&&jogador3Amarelo.getX()>=218&&jogador3Amarelo.getX()<=224&&jogador3Amarelo.getY()>=276&&jogador3Amarelo.getY()<=282)||(valorDoDado>2&&jogador3Amarelo.getX()>=218&&jogador3Amarelo.getX()<=224&&jogador3Amarelo.getY()>=309&&jogador3Amarelo.getY()<=315)||(valorDoDado>3&&jogador3Amarelo.getX()>=218&&jogador3Amarelo.getX()<=224&&jogador3Amarelo.getY()>=342&&jogador3Amarelo.getY()<=348)||(valorDoDado>4&&jogador3Amarelo.getX()>=218&&jogador3Amarelo.getX()<=224&&jogador3Amarelo.getY()>=375&&jogador3Amarelo.getY()<=381)||(valorDoDado>5&&jogador3Amarelo.getX()>=218&&jogador3Amarelo.getX()<=224&&jogador3Amarelo.getY()>=408&&jogador3Amarelo.getY()<=414)){
        
        }
        else{
            jogAtual=15;
            blocoAtual=4;
            if(saiAmarelo3==true){
                amarelo3Sai();
                moveAmarelo1=false;
                moveAmarelo2=false;
                moveAmarelo3=false;
                moveAmarelo4=false;
                saiAmarelo1=false;
                saiAmarelo2=false;
                saiAmarelo3=false;
                saiAmarelo4=false;
                bloqueaDado=false;
            }
            else if(moveAmarelo3==true){
                px=jogador3Amarelo.getX();
                py=jogador3Amarelo.getY();
                moveJogador();
                dadoSuporte=1;
                if(valorDoDado==1){
                    moveAmarelo1=false;
                    moveAmarelo2=false;
                    moveAmarelo3=false;
                    moveAmarelo4=false;
                    saiAmarelo1=false;
                    saiAmarelo2=false;
                    saiAmarelo3=false;
                    saiAmarelo4=false;
                    bloqueaDado=false;
                    px=jogador3Amarelo.getX();
                    py=jogador3Amarelo.getY();
                    if(voltou==false){
                        passaVez();
                    }
                }
            }
        }
    }//GEN-LAST:event_jogador3AmareloMouseClicked

    private void jogador4AmareloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jogador4AmareloMouseClicked
        if((valorDoDado>1&&jogador4Amarelo.getX()>=218&&jogador4Amarelo.getX()<=224&&jogador4Amarelo.getY()>=276&&jogador4Amarelo.getY()<=282)||(valorDoDado>2&&jogador4Amarelo.getX()>=218&&jogador4Amarelo.getX()<=224&&jogador4Amarelo.getY()>=309&&jogador4Amarelo.getY()<=315)||(valorDoDado>3&&jogador4Amarelo.getX()>=218&&jogador4Amarelo.getX()<=224&&jogador4Amarelo.getY()>=342&&jogador4Amarelo.getY()<=348)||(valorDoDado>4&&jogador4Amarelo.getX()>=218&&jogador4Amarelo.getX()<=224&&jogador4Amarelo.getY()>=375&&jogador4Amarelo.getY()<=381)||(valorDoDado>5&&jogador4Amarelo.getX()>=218&&jogador4Amarelo.getX()<=224&&jogador4Amarelo.getY()>=408&&jogador4Amarelo.getY()<=414)){
        
        }
        else{
            jogAtual=16;
            blocoAtual=4;
            if(saiAmarelo4==true){
                amarelo4Sai();
                moveAmarelo1=false;
                moveAmarelo2=false;
                moveAmarelo3=false;
                moveAmarelo4=false;
                saiAmarelo1=false;
                saiAmarelo2=false;
                saiAmarelo3=false;
                saiAmarelo4=false;
                bloqueaDado=false;
            }
            else if(moveAmarelo4==true){
                px=jogador4Amarelo.getX();
                py=jogador4Amarelo.getY();
                moveJogador();
                dadoSuporte=1;
                if(valorDoDado==1){
                    moveAmarelo1=false;
                    moveAmarelo2=false;
                    moveAmarelo3=false;
                    moveAmarelo4=false;
                    saiAmarelo1=false;
                    saiAmarelo2=false;
                    saiAmarelo3=false;
                    saiAmarelo4=false;
                    bloqueaDado=false;
                    px=jogador4Amarelo.getX();
                    py=jogador4Amarelo.getY();
                    if(voltou==false){
                        passaVez();
                    }
                }
            }
        }
    }//GEN-LAST:event_jogador4AmareloMouseClicked

    private void jogador1AzulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jogador1AzulMouseClicked
        if((valorDoDado>1&&jogador1Azul.getX()>=284&&jogador1Azul.getX()<=290&&jogador1Azul.getY()>=210&&jogador1Azul.getY()<=216)||(valorDoDado>2&&jogador1Azul.getX()>=317&&jogador1Azul.getX()<=323&&jogador1Azul.getY()>=210&&jogador1Azul.getY()<=216)||(valorDoDado>3&&jogador1Azul.getX()>=350&&jogador1Azul.getX()<=356&&jogador1Azul.getY()>=210&&jogador1Azul.getY()<=216)||(valorDoDado>4&&jogador1Azul.getX()>=383&&jogador1Azul.getX()<=389&&jogador1Azul.getY()>=210&&jogador1Azul.getY()<=216)||(valorDoDado>5&&jogador1Azul.getX()>=416&&jogador1Azul.getX()<=422&&jogador1Azul.getY()>=210&&jogador1Azul.getY()<=216)){
        
        }
        else{
            jogAtual=9;
            blocoAtual=3;
            if(saiAzul1==true){
                azul1Sai();
                moveAzul1=false;
                moveAzul2=false;
                moveAzul3=false;
                moveAzul4=false;
                saiAzul1=false;
                saiAzul2=false;
                saiAzul3=false;
                saiAzul4=false;
                bloqueaDado=false;
            }
            else if(moveAzul1==true){
                px=jogador1Azul.getX();
                py=jogador1Azul.getY();
                moveJogador();
                dadoSuporte=1;
                if(valorDoDado==1){
                    moveAzul1=false;
                    moveAzul2=false;
                    moveAzul3=false;
                    moveAzul4=false;
                    saiAzul1=false;
                    saiAzul2=false;
                    saiAzul3=false;
                    saiAzul4=false;
                    bloqueaDado=false;
                    px=jogador1Azul.getX();
                    py=jogador1Azul.getY();
                    if(voltou==false){
                        passaVez();
                    }
                }
            }
        }
    }//GEN-LAST:event_jogador1AzulMouseClicked

    private void jogador2AzulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jogador2AzulMouseClicked
        if((valorDoDado>1&&jogador2Azul.getX()>=284&&jogador2Azul.getX()<=290&&jogador2Azul.getY()>=210&&jogador2Azul.getY()<=216)||(valorDoDado>2&&jogador2Azul.getX()>=317&&jogador2Azul.getX()<=323&&jogador2Azul.getY()>=210&&jogador2Azul.getY()<=216)||(valorDoDado>3&&jogador2Azul.getX()>=350&&jogador2Azul.getX()<=356&&jogador2Azul.getY()>=210&&jogador2Azul.getY()<=216)||(valorDoDado>4&&jogador2Azul.getX()>=383&&jogador2Azul.getX()<=389&&jogador2Azul.getY()>=210&&jogador2Azul.getY()<=216)||(valorDoDado>5&&jogador2Azul.getX()>=416&&jogador2Azul.getX()<=422&&jogador2Azul.getY()>=210&&jogador2Azul.getY()<=216)){
        
        }
        else{
            jogAtual=10;
            blocoAtual=3;
            if(saiAzul2==true){
                azul2Sai();
                moveAzul1=false;
                moveAzul2=false;
                moveAzul3=false;
                moveAzul4=false;
                saiAzul1=false;
                saiAzul2=false;
                saiAzul3=false;
                saiAzul4=false;
                bloqueaDado=false;
            }
            else if(moveAzul2==true){
                px=jogador2Azul.getX();
                py=jogador2Azul.getY();
                moveJogador();
                dadoSuporte=1;
                if(valorDoDado==1){
                    moveAzul1=false;
                    moveAzul2=false;
                    moveAzul3=false;
                    moveAzul4=false;
                    saiAzul1=false;
                    saiAzul2=false;
                    saiAzul3=false;
                    saiAzul4=false;
                    bloqueaDado=false;
                    px=jogador2Azul.getX();
                    py=jogador2Azul.getY();
                    if(voltou==false){
                        passaVez();
                    }
                }
            }
        }
    }//GEN-LAST:event_jogador2AzulMouseClicked

    private void jogador3AzulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jogador3AzulMouseClicked
        if((valorDoDado>1&&jogador3Azul.getX()>=284&&jogador3Azul.getX()<=290&&jogador3Azul.getY()>=210&&jogador3Azul.getY()<=216)||(valorDoDado>2&&jogador3Azul.getX()>=317&&jogador3Azul.getX()<=323&&jogador3Azul.getY()>=210&&jogador3Azul.getY()<=216)||(valorDoDado>3&&jogador3Azul.getX()>=350&&jogador3Azul.getX()<=356&&jogador3Azul.getY()>=210&&jogador3Azul.getY()<=216)||(valorDoDado>4&&jogador3Azul.getX()>=383&&jogador3Azul.getX()<=389&&jogador3Azul.getY()>=210&&jogador3Azul.getY()<=216)||(valorDoDado>5&&jogador3Azul.getX()>=416&&jogador3Azul.getX()<=422&&jogador3Azul.getY()>=210&&jogador3Azul.getY()<=216)){
        
        }
        else{
            jogAtual=11;
            blocoAtual=3;
            if(saiAzul3==true){
                azul3Sai();
                moveAzul1=false;
                moveAzul2=false;
                moveAzul3=false;
                moveAzul4=false;
                saiAzul1=false;
                saiAzul2=false;
                saiAzul3=false;
                saiAzul4=false;
                bloqueaDado=false;
            }
            else if(moveAzul3==true){
                px=jogador3Azul.getX();
                py=jogador3Azul.getY();
                moveJogador();
                dadoSuporte=1;
                if(valorDoDado==1){
                    moveAzul1=false;
                    moveAzul2=false;
                    moveAzul3=false;
                    moveAzul4=false;
                    saiAzul1=false;
                    saiAzul2=false;
                    saiAzul3=false;
                    saiAzul4=false;
                    bloqueaDado=false;
                    px=jogador3Azul.getX();
                    py=jogador3Azul.getY();
                    if(voltou==false){
                        passaVez();
                    }
                }
            }
        }
    }//GEN-LAST:event_jogador3AzulMouseClicked

    private void jogador4AzulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jogador4AzulMouseClicked
        if((valorDoDado>1&&jogador4Azul.getX()>=284&&jogador4Azul.getX()<=290&&jogador4Azul.getY()>=210&&jogador4Azul.getY()<=216)||(valorDoDado>2&&jogador4Azul.getX()>=317&&jogador4Azul.getX()<=323&&jogador4Azul.getY()>=210&&jogador4Azul.getY()<=216)||(valorDoDado>3&&jogador4Azul.getX()>=350&&jogador4Azul.getX()<=356&&jogador4Azul.getY()>=210&&jogador4Azul.getY()<=216)||(valorDoDado>4&&jogador4Azul.getX()>=383&&jogador4Azul.getX()<=389&&jogador4Azul.getY()>=210&&jogador4Azul.getY()<=216)||(valorDoDado>5&&jogador4Azul.getX()>=416&&jogador4Azul.getX()<=422&&jogador4Azul.getY()>=210&&jogador4Azul.getY()<=216)){
        
        }
        else{
            jogAtual=12;
            blocoAtual=3;
            if(saiAzul4==true){
                azul4Sai();
                moveAzul1=false;
                moveAzul2=false;
                moveAzul3=false;
                moveAzul4=false;
                saiAzul1=false;
                saiAzul2=false;
                saiAzul3=false;
                saiAzul4=false;
                bloqueaDado=false;
            }
            else if(moveAzul4==true){
                px=jogador4Azul.getX();
                py=jogador4Azul.getY();
                moveJogador();
                dadoSuporte=1;
                if(valorDoDado==1){
                    moveAzul1=false;
                    moveAzul2=false;
                    moveAzul3=false;
                    moveAzul4=false;
                    saiAzul1=false;
                    saiAzul2=false;
                    saiAzul3=false;
                    saiAzul4=false;
                    bloqueaDado=false;
                    px=jogador4Azul.getX();
                    py=jogador4Azul.getY();
                    if(voltou==false){
                        passaVez();
                    }
                }
            }
        }
    }//GEN-LAST:event_jogador4AzulMouseClicked
    
    private void jogador1VerdeComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jogador1VerdeComponentMoved
        cont++;
        if(cont==33&&dadoSuporte<=valorDoDado&&moveVerde1==true&&valorDoDado!=1){
            dadoSuporte++;
            moveJogador();
            if(dadoSuporte==valorDoDado&&moveVerde1==true){
                moveVerde1=false;
                moveVerde2=false;
                moveVerde3=false;
                moveVerde4=false;
                saiVerde1=false;
                saiVerde2=false;
                saiVerde3=false;
                saiVerde4=false;
                bloqueaDado=false;
                if(valorDoDado<6){
                    px=jogador1Verde.getX();
                    py=jogador1Verde.getY();
                    if(voltou==false){
                        passaVez();
                    }
                }
            }
        }
    }//GEN-LAST:event_jogador1VerdeComponentMoved

    private void jogador2VerdeComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jogador2VerdeComponentMoved
        cont++;
        if(cont==33&&dadoSuporte<=valorDoDado&&moveVerde2==true&&valorDoDado!=1){
            dadoSuporte++;
            moveJogador();
            if(dadoSuporte==valorDoDado&&moveVerde2==true){
                moveVerde1=false;
                moveVerde2=false;
                moveVerde3=false;
                moveVerde4=false;
                saiVerde1=false;
                saiVerde2=false;
                saiVerde3=false;
                saiVerde4=false;
                bloqueaDado=false;
                if(valorDoDado<6){
                    px=jogador2Verde.getX();
                    py=jogador2Verde.getY();
                    if(voltou==false){
                        passaVez();
                    }
                }
            }
        }
    }//GEN-LAST:event_jogador2VerdeComponentMoved

    private void jogador3VerdeComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jogador3VerdeComponentMoved
        cont++;
        if(cont==33&&dadoSuporte<=valorDoDado&&moveVerde3==true&&valorDoDado!=1){
            dadoSuporte++;
            moveJogador();
            if(dadoSuporte==valorDoDado&&moveVerde3==true){
                moveVerde1=false;
                moveVerde2=false;
                moveVerde3=false;
                moveVerde4=false;
                saiVerde1=false;
                saiVerde2=false;
                saiVerde3=false;
                saiVerde4=false;
                bloqueaDado=false;
                if(valorDoDado<6){
                    px=jogador3Verde.getX();
                    py=jogador3Verde.getY();
                    if(voltou==false){
                        passaVez();
                    }
                }
            }
        }
    }//GEN-LAST:event_jogador3VerdeComponentMoved

    private void jogador4VerdeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jogador4VerdeMouseClicked
        if((valorDoDado>1&&jogador4Verde.getX()>=152&&jogador4Verde.getX()<=158&&jogador4Verde.getY()>=210&&jogador4Verde.getY()<=216)||(valorDoDado>2&&jogador4Verde.getX()>=119&&jogador4Verde.getX()<=125&&jogador4Verde.getY()>=210&&jogador4Verde.getY()<=216)||(valorDoDado>3&&jogador4Verde.getX()>=86&&jogador4Verde.getX()<=92&&jogador4Verde.getY()>=210&&jogador4Verde.getY()<=216)||(valorDoDado>4&&jogador4Verde.getX()>=53&&jogador4Verde.getX()<=59&&jogador4Verde.getY()>=210&&jogador4Verde.getY()<=216)||(valorDoDado>5&&jogador4Verde.getX()>=20&&jogador4Verde.getX()<=26&&jogador4Verde.getY()>=210&&jogador4Verde.getY()<=216)){

        }
        else{
            jogAtual=4;
            blocoAtual=1;
            if(saiVerde4==true){
                verde4Sai();
                moveVerde1=false;
                moveVerde2=false;
                moveVerde3=false;
                moveVerde4=false;
                saiVerde1=false;
                saiVerde2=false;
                saiVerde3=false;
                saiVerde4=false;
                bloqueaDado=false;
            }
            else if(moveVerde4==true){
                px=jogador4Verde.getX();
                py=jogador4Verde.getY();
                moveJogador();
                dadoSuporte=1;
                if(valorDoDado==1){
                    moveVerde1=false;
                    moveVerde2=false;
                    moveVerde3=false;
                    moveVerde4=false;
                    saiVerde1=false;
                    saiVerde2=false;
                    saiVerde3=false;
                    saiVerde4=false;
                    bloqueaDado=false;
                    px=jogador4Verde.getX();
                    py=jogador4Verde.getY();
                    if(voltou==false){
                        passaVez();
                    }
                }
            }
        }
    }//GEN-LAST:event_jogador4VerdeMouseClicked

    private void jogador4VerdeComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jogador4VerdeComponentMoved
        cont++;
        if(cont==33&&dadoSuporte<=valorDoDado&&moveVerde4==true&&valorDoDado!=1){
            dadoSuporte++;
            moveJogador();
            if(dadoSuporte==valorDoDado&&moveVerde4==true){
                moveVerde1=false;
                moveVerde2=false;
                moveVerde3=false;
                moveVerde4=false;
                saiVerde1=false;
                saiVerde2=false;
                saiVerde3=false;
                saiVerde4=false;
                bloqueaDado=false;
                if(valorDoDado<6){
                    px=jogador4Verde.getX();
                    py=jogador4Verde.getY();
                    if(voltou==false){
                        passaVez();
                    }
                }
            }
        }
    }//GEN-LAST:event_jogador4VerdeComponentMoved

    private void jogador1VermelhoComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jogador1VermelhoComponentMoved
        cont++;
        if(cont==33&&dadoSuporte<=valorDoDado&&moveVermelho1==true&&valorDoDado!=1){
            dadoSuporte++;
            moveJogador();
            if(dadoSuporte==valorDoDado&&moveVermelho1==true){
                moveVermelho1=false;
                moveVermelho2=false;
                moveVermelho3=false;
                moveVermelho4=false;
                saiVermelho1=false;
                saiVermelho2=false;
                saiVermelho3=false;
                saiVermelho4=false;
                bloqueaDado=false;
                if(valorDoDado<6){
                    px=jogador1Vermelho.getX();
                    py=jogador1Vermelho.getY();
                    if(voltou==false){
                        passaVez();
                    }
                }
            }
        }
    }//GEN-LAST:event_jogador1VermelhoComponentMoved

    private void jogador2VermelhoComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jogador2VermelhoComponentMoved
        cont++;
        if(cont==33&&dadoSuporte<=valorDoDado&&moveVermelho2==true&&valorDoDado!=1){
            dadoSuporte++;
            moveJogador();
            if(dadoSuporte==valorDoDado&&moveVermelho2==true){
                moveVermelho1=false;
                moveVermelho2=false;
                moveVermelho3=false;
                moveVermelho4=false;
                saiVermelho1=false;
                saiVermelho2=false;
                saiVermelho3=false;
                saiVermelho4=false;
                bloqueaDado=false;
                if(valorDoDado<6){
                    px=jogador2Vermelho.getX();
                    py=jogador2Vermelho.getY();
                    if(voltou==false){
                        passaVez();
                    }
                }
            }
        }
    }//GEN-LAST:event_jogador2VermelhoComponentMoved

    private void jogador3VermelhoComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jogador3VermelhoComponentMoved
        cont++;
        if(cont==33&&dadoSuporte<=valorDoDado&&moveVermelho3==true&&valorDoDado!=1){
            dadoSuporte++;
            moveJogador();
            if(dadoSuporte==valorDoDado&&moveVermelho3==true){
                moveVermelho1=false;
                moveVermelho2=false;
                moveVermelho3=false;
                moveVermelho4=false;
                saiVermelho1=false;
                saiVermelho2=false;
                saiVermelho3=false;
                saiVermelho4=false;
                bloqueaDado=false;
                if(valorDoDado<6){
                    px=jogador3Vermelho.getX();
                    py=jogador3Vermelho.getY();
                    if(voltou==false){
                        passaVez();
                    }
                }
            }
        }
    }//GEN-LAST:event_jogador3VermelhoComponentMoved

    private void jogador4VermelhoComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jogador4VermelhoComponentMoved
        cont++;
        if(cont==33&&dadoSuporte<=valorDoDado&&moveVermelho4==true&&valorDoDado!=1){
            dadoSuporte++;
            moveJogador();
            if(dadoSuporte==valorDoDado&&moveVermelho4==true){
                moveVermelho1=false;
                moveVermelho2=false;
                moveVermelho3=false;
                moveVermelho4=false;
                saiVermelho1=false;
                saiVermelho2=false;
                saiVermelho3=false;
                saiVermelho4=false;
                bloqueaDado=false;
                if(valorDoDado<6){
                    px=jogador4Vermelho.getX();
                    py=jogador4Vermelho.getY();
                    if(voltou==false){
                        passaVez();
                    }
                }
            }
        }
    }//GEN-LAST:event_jogador4VermelhoComponentMoved

    private void jogador1AzulComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jogador1AzulComponentMoved
        cont++;
        if(cont==33&&dadoSuporte<=valorDoDado&&moveAzul1==true&&valorDoDado!=1){
            dadoSuporte++;
            moveJogador();
            if(dadoSuporte==valorDoDado&&moveAzul1==true){
                moveAzul1=false;
                moveAzul2=false;
                moveAzul3=false;
                moveAzul4=false;
                saiAzul1=false;
                saiAzul2=false;
                saiAzul3=false;
                saiAzul4=false;
                bloqueaDado=false;
                if(valorDoDado<6){
                    px=jogador1Azul.getX();
                    py=jogador1Azul.getY();
                    if(voltou==false){
                        passaVez();
                    }
                }
            }
        }
    }//GEN-LAST:event_jogador1AzulComponentMoved

    private void jogador2AzulComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jogador2AzulComponentMoved
        cont++;
        if(cont==33&&dadoSuporte<=valorDoDado&&moveAzul2==true&&valorDoDado!=1){
            dadoSuporte++;
            moveJogador();
            if(dadoSuporte==valorDoDado&&moveAzul2==true){
                moveAzul1=false;
                moveAzul2=false;
                moveAzul3=false;
                moveAzul4=false;
                saiAzul1=false;
                saiAzul2=false;
                saiAzul3=false;
                saiAzul4=false;
                bloqueaDado=false;
                if(valorDoDado<6){
                    px=jogador2Azul.getX();
                    py=jogador2Azul.getY();
                    if(voltou==false){
                        passaVez();
                    }
                }
            }
        }
    }//GEN-LAST:event_jogador2AzulComponentMoved

    private void jogador3AzulComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jogador3AzulComponentMoved
        cont++;
        if(cont==33&&dadoSuporte<=valorDoDado&&moveAzul3==true&&valorDoDado!=1){
            dadoSuporte++;
            moveJogador();
            if(dadoSuporte==valorDoDado&&moveAzul3==true){
                moveAzul1=false;
                moveAzul2=false;
                moveAzul3=false;
                moveAzul4=false;
                saiAzul1=false;
                saiAzul2=false;
                saiAzul3=false;
                saiAzul4=false;
                bloqueaDado=false;
                if(valorDoDado<6){
                    px=jogador3Azul.getX();
                    py=jogador3Azul.getY();
                    if(voltou==false){
                        passaVez();
                    }
                }
            }
        }
    }//GEN-LAST:event_jogador3AzulComponentMoved

    private void jogador4AzulComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jogador4AzulComponentMoved
        cont++;
        if(cont==33&&dadoSuporte<=valorDoDado&&moveAzul4==true&&valorDoDado!=1){
            dadoSuporte++;
            moveJogador();
            if(dadoSuporte==valorDoDado&&moveAzul4==true){
                moveAzul1=false;
                moveAzul2=false;
                moveAzul3=false;
                moveAzul4=false;
                saiAzul1=false;
                saiAzul2=false;
                saiAzul3=false;
                saiAzul4=false;
                bloqueaDado=false;
                if(valorDoDado<6){
                    px=jogador4Azul.getX();
                    py=jogador4Azul.getY();
                    if(voltou==false){
                        passaVez();
                    }
                }
            }
        }
    }//GEN-LAST:event_jogador4AzulComponentMoved

    private void jogador1AmareloComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jogador1AmareloComponentMoved
        cont++;
        if(cont==33&&dadoSuporte<=valorDoDado&&moveAmarelo1==true&&valorDoDado!=1){
            dadoSuporte++;
            moveJogador();
            if(dadoSuporte==valorDoDado&&moveAmarelo1==true){
                moveAmarelo1=false;
                moveAmarelo2=false;
                moveAmarelo3=false;
                moveAmarelo4=false;
                saiAmarelo1=false;
                saiAmarelo2=false;
                saiAmarelo3=false;
                saiAmarelo4=false;
                bloqueaDado=false;
                if(valorDoDado<6){
                    px=jogador1Amarelo.getX();
                    py=jogador1Amarelo.getY();
                    if(voltou==false){
                        passaVez();
                    }
                }
            }
        }
    }//GEN-LAST:event_jogador1AmareloComponentMoved

    private void jogador2AmareloComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jogador2AmareloComponentMoved
        cont++;
        if(cont==33&&dadoSuporte<=valorDoDado&&moveAmarelo2==true&&valorDoDado!=1){
            dadoSuporte++;
            moveJogador();
            if(dadoSuporte==valorDoDado&&moveAmarelo2==true){
                moveAmarelo1=false;
                moveAmarelo2=false;
                moveAmarelo3=false;
                moveAmarelo4=false;
                saiAmarelo1=false;
                saiAmarelo2=false;
                saiAmarelo3=false;
                saiAmarelo4=false;
                bloqueaDado=false;
                if(valorDoDado<6){
                    px=jogador2Amarelo.getX();
                    py=jogador2Amarelo.getY();
                    if(voltou==false){
                        passaVez();
                    }
                }
            }
        }
    }//GEN-LAST:event_jogador2AmareloComponentMoved

    private void jogador3AmareloComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jogador3AmareloComponentMoved
        cont++;
        if(cont==33&&dadoSuporte<=valorDoDado&&moveAmarelo3==true&&valorDoDado!=1){
            dadoSuporte++;
            moveJogador();
            if(dadoSuporte==valorDoDado&&moveAmarelo3==true){
                moveAmarelo1=false;
                moveAmarelo2=false;
                moveAmarelo3=false;
                moveAmarelo4=false;
                saiAmarelo1=false;
                saiAmarelo2=false;
                saiAmarelo3=false;
                saiAmarelo4=false;
                bloqueaDado=false;
                if(valorDoDado<6){
                    px=jogador3Amarelo.getX();
                    py=jogador3Amarelo.getY();
                    if(voltou==false){
                        passaVez();
                    }
                }
            }
        }
    }//GEN-LAST:event_jogador3AmareloComponentMoved

    private void jogador4AmareloComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jogador4AmareloComponentMoved
        cont++;
        if(cont==33&&dadoSuporte<=valorDoDado&&moveAmarelo4==true&&valorDoDado!=1){
            dadoSuporte++;
            moveJogador();
            if(dadoSuporte==valorDoDado&&moveAmarelo4==true){
                moveAmarelo1=false;
                moveAmarelo2=false;
                moveAmarelo3=false;
                moveAmarelo4=false;
                saiAmarelo1=false;
                saiAmarelo2=false;
                saiAmarelo3=false;
                saiAmarelo4=false;
                bloqueaDado=false;
                if(valorDoDado<6){
                    px=jogador4Amarelo.getX();
                    py=jogador4Amarelo.getY();
                    if(voltou==false){
                        passaVez();
                    }
                }
            }
        }
    }//GEN-LAST:event_jogador4AmareloComponentMoved
    private void moveDado(){
        Timer timer = new Timer();
            final long SEGUNDOS = (150*1);
            TimerTask tarefa = new TimerTask(){
            @Override
            public void run() {
                x++;
                if(valorDoDado==1){
                    lado1.setVisible(false);
                }
                else if(valorDoDado==2){
                    lado2.setVisible(false);
                }
                else if(valorDoDado==3){
                    lado3.setVisible(false);
                }
                else if(valorDoDado==4){
                    lado4.setVisible(false);
                }
                else if(valorDoDado==5){
                    lado5.setVisible(false);
                }
                else{
                    lado6.setVisible(false);
                }
                Random num = new Random();
                valorDoDado=num.nextInt(6)+1;
                if(valorDoDado==1){
                    lado1.setVisible(true);
                }
                else if(valorDoDado==2){
                    lado2.setVisible(true);
                }
                else if(valorDoDado==3){
                    lado3.setVisible(true);
                }
                else if(valorDoDado==4){
                    lado4.setVisible(true);
                }
                else if(valorDoDado==5){
                    lado5.setVisible(true);
                }
                else{
                    lado6.setVisible(true);
                }
                if(x==10){
                    timer.cancel();
                    x=0;
                    dadoJogado();
                }
            }
        };
        timer.scheduleAtFixedRate(tarefa, 0, SEGUNDOS);
    }
    private void azul1Sai(){
        new Thread(){
            public void run(){
                int x=340,y=jogador1Azul.getLocation().y;
                while(true){
                    if(x<419){
                        x++;
                    }
                    if(y>246){
                        y--;
                    }
                    jogador1Azul.setLocation(x,y);   
                    if(x==419&&y==246){
                        break;
                    }
                    try {
                        sleep(10);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }
    private void azul2Sai(){
        new Thread(){
            public void run(){
                int x=400,y=jogador2Azul.getLocation().y;
                while(true){
                    if(x<419){
                        x++;
                    }
                    if(y>246){
                        y--;
                    }
                    jogador2Azul.setLocation(x,y);    
                    if(x==419&&y==246){
                        break;
                    }
                    try {
                        sleep(10);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }
    private void azul3Sai(){
        new Thread(){
            public void run(){
                int x=340,y=jogador3Azul.getLocation().y;
                while(true){
                    if(x<419){
                        x++;
                    }
                    if(y>246){
                        y--;
                    }
                    jogador3Azul.setLocation(x,y);    
                    if(x==419&&y==246){
                        break;
                    }
                    try {
                        sleep(10);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }
    private void azul4Sai(){
        new Thread(){
            public void run(){
                int x=400,y=jogador4Azul.getLocation().y;
                while(true){
                    if(x<419){
                        x++;
                    }
                    if(y>246){
                        y--;
                    }
                    jogador4Azul.setLocation(x,y);    
                    if(x==419&&y==246){
                        break;
                    }
                    try {
                        sleep(10);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }
    private void amarelo1Sai(){
        new Thread(){
            public void run(){
                int x=40,y=jogador1Amarelo.getLocation().y;
                while(true){
                    if(x<188){
                        x++;
                    }
                    if(y<411){
                        y++;
                    }
                    jogador1Amarelo.setLocation(x,y);    
                    if(x==188&&y==411){
                        break;
                    }
                    try {
                        sleep(10);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }
    private void amarelo2Sai(){
        new Thread(){
            public void run(){
                int x=110,y=jogador2Amarelo.getLocation().y;
                while(true){
                    if(x<188){
                        x++;
                    }
                    if(y<411){
                        y++;
                    }
                    jogador2Amarelo.setLocation(x,y);    
                    if(x==188&&y==411){
                        break;
                    }
                    try {
                        sleep(10);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }
    private void amarelo3Sai(){
        new Thread(){
            public void run(){
                int x=40,y=jogador3Amarelo.getLocation().y;
                while(true){
                    if(x<188){
                        x++;
                    }
                    if(y<411){
                        y++;
                    }
                    jogador3Amarelo.setLocation(x,y);    
                    if(x==188&&y==411){
                        break;
                    }
                    try {
                        sleep(10);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }
    private void amarelo4Sai(){
        new Thread(){
            public void run(){
                int x=110,y=jogador4Amarelo.getLocation().y;
                while(true){
                    if(x<188){
                        x++;
                    }
                    if(y<411){
                        y++;
                    }
                    jogador4Amarelo.setLocation(x,y);    
                    if(x==188&&y==411){
                        break;
                    }
                    try {
                        sleep(10);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }
    private void vermelho1Sai(){
        new Thread(){
            public void run(){
                int x=340,y=jogador1Vermelho.getLocation().y;
                while(true){
                    if(x>254){
                        x--;
                    }
                    if(y>15){
                        y--;
                    }
                    jogador1Vermelho.setLocation(x,y);    
                    if(x==254&&y==15){
                        break;
                    }
                    try {
                        sleep(10);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }
    private void vermelho2Sai(){
        new Thread(){
            public void run(){
                int x=400,y=jogador2Vermelho.getLocation().y;
                while(true){
                    if(x>254){
                        x--;
                    }
                    if(y>15){
                        y--;
                    }
                    jogador2Vermelho.setLocation(x,y);    
                    if(x==254&&y==15){
                        break;
                    }
                    try {
                        sleep(10);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }
    private void vermelho3Sai(){
        new Thread(){
            public void run(){
                int x=340,y=jogador3Vermelho.getLocation().y;
                while(true){
                    if(x>254){
                        x--;
                    }
                    if(y>15){
                        y--;
                    }
                    jogador3Vermelho.setLocation(x,y);    
                    if(x==254&&y==15){
                        break;
                    }
                    try {
                        sleep(10);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }
    private void vermelho4Sai(){
        new Thread(){
            public void run(){
                int x=400,y=jogador4Vermelho.getLocation().y;
                while(true){
                    if(x>254){
                        x--;
                    }
                    if(y>15){
                        y--;
                    }
                    jogador4Vermelho.setLocation(x,y);    
                    if(x==254&&y==15){
                        break;
                    }
                    try {
                        sleep(10);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }
    private void verde1Sai(){
        new Thread(){
            public void run(){
                int x=40,y=30;
                while(true){
                    if(x>23){
                        x--;
                    }
                    if(y<180){
                        y++;
                    }       
                    jogador1Verde.setLocation(x,y);
                    if(x==23&&y==180){
                        break;
                    }
                    try {
                        sleep(10);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }
    private void verde2Sai(){
        new Thread(){
            public void run(){
                int x=110,y=30;
                while(true){
                    if(x>23){
                        x--;
                    }  
                    if(y<180){
                        y++;
                    } 
                    jogador2Verde.setLocation(x,y);
                    if(x==23&&y==180){
                        x=23;
                        y=180;
                        jogador2Verde.setLocation(x,y);
                        break;
                    }
                    try {
                        sleep(10);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }
    private void verde3Sai(){
        new Thread(){
            public void run(){
                int x=40,y=100;
                while(true){
                    if(x>23){
                        x--;
                    }  
                    if(y<180){
                        y++;
                    }     
                    jogador3Verde.setLocation(x,y);
                    if(x==23&&y==180){
                        x=23;
                        y=180;
                        jogador3Verde.setLocation(x,y);
                        break;
                    }
                    try {
                        sleep(10);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }
    private void verde4Sai(){
        new Thread(){
            public void run(){
                int x=110,y=100;
                while(true){
                    if(x>23){
                        x--;
                    }  
                    if(y<180){
                        y++;
                    }       
                    jogador4Verde.setLocation(x,y);
                    if(x==23&&y==180){
                        x=23;
                        y=180;
                        jogador4Verde.setLocation(x,y);
                        break;
                    }
                    try {
                        sleep(10);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel campoDeBatalha;
    private javax.swing.JLabel jogador1Amarelo;
    private javax.swing.JLabel jogador1Azul;
    private javax.swing.JLabel jogador1Verde;
    private javax.swing.JLabel jogador1Vermelho;
    private javax.swing.JLabel jogador2Amarelo;
    private javax.swing.JLabel jogador2Azul;
    private javax.swing.JLabel jogador2Verde;
    private javax.swing.JLabel jogador2Vermelho;
    private javax.swing.JLabel jogador3Amarelo;
    private javax.swing.JLabel jogador3Azul;
    private javax.swing.JLabel jogador3Verde;
    private javax.swing.JLabel jogador3Vermelho;
    private javax.swing.JLabel jogador4Amarelo;
    private javax.swing.JLabel jogador4Azul;
    private javax.swing.JLabel jogador4Verde;
    private javax.swing.JLabel jogador4Vermelho;
    private javax.swing.JLabel lado1;
    private javax.swing.JLabel lado2;
    private javax.swing.JLabel lado3;
    private javax.swing.JLabel lado4;
    private javax.swing.JLabel lado5;
    private javax.swing.JLabel lado6;
    private javax.swing.JLabel selecaoAmarelo;
    private javax.swing.JLabel selecaoAzul;
    private javax.swing.JLabel selecaoVerde;
    private javax.swing.JLabel selecaoVermelho;
    // End of variables declaration//GEN-END:variables
}