package p5488io.grpc.p5527g.p5528a;

/* renamed from: io.grpc.g.a.r */
/* compiled from: PG */
public enum C70805r {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    

    /* renamed from: f */
    final String f188831f;

    private C70805r(String str) {
        this.f188831f = str;
    }

    /* renamed from: a */
    public static C70805r m103572a(String str) {
        if ("TLSv1.3".equals(str)) {
            return TLS_1_3;
        }
        if ("TLSv1.2".equals(str)) {
            return TLS_1_2;
        }
        if ("TLSv1.1".equals(str)) {
            return TLS_1_1;
        }
        if ("TLSv1".equals(str)) {
            return TLS_1_0;
        }
        if ("SSLv3".equals(str)) {
            return SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(String.valueOf(str)));
    }
}
