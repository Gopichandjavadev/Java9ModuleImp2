module easytextimp2 {
    requires easytextapi;
    
    provides easytextapi.Analyzer with easytextimp2.Imp2;
}