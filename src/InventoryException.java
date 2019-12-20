public class InventoryException extends Exception {

    /**
     *InventoryException est lancé Si on tente de retirer plus d’éléments que l’inventaire n’en contient
     * @param errorMessage Le msg à afficher
     */
    public InventoryException(String errorMessage) {
        super(errorMessage);
    }
}
