package p5488io.grpc.p5527g.p5528a;

import java.util.Arrays;
import java.util.List;

/* renamed from: io.grpc.g.a.c */
/* compiled from: PG */
public final class C70790c {

    /* renamed from: a */
    public static final C70790c f188780a;

    /* renamed from: f */
    private static final C70771a[] f188781f;

    /* renamed from: b */
    final boolean f188782b = true;

    /* renamed from: c */
    public final String[] f188783c;

    /* renamed from: d */
    public final String[] f188784d;

    /* renamed from: e */
    public final boolean f188785e;

    static {
        C70771a[] aVarArr = {C70771a.TLS_AES_128_GCM_SHA256, C70771a.TLS_AES_256_GCM_SHA384, C70771a.TLS_CHACHA20_POLY1305_SHA256, C70771a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, C70771a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, C70771a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, C70771a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, C70771a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, C70771a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, C70771a.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, C70771a.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, C70771a.TLS_RSA_WITH_AES_128_GCM_SHA256, C70771a.TLS_RSA_WITH_AES_256_GCM_SHA384, C70771a.TLS_RSA_WITH_AES_128_CBC_SHA, C70771a.TLS_RSA_WITH_AES_256_CBC_SHA, C70771a.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f188781f = aVarArr;
        C70787b bVar = new C70787b();
        bVar.mo62482a(aVarArr);
        bVar.mo62484c(C70805r.TLS_1_3, C70805r.TLS_1_2);
        bVar.f188773c = true;
        C70790c cVar = new C70790c(bVar);
        f188780a = cVar;
        C70787b bVar2 = new C70787b(cVar);
        bVar2.mo62484c(C70805r.TLS_1_3, C70805r.TLS_1_2, C70805r.TLS_1_1, C70805r.TLS_1_0);
        bVar2.f188773c = true;
    }

    public C70790c(C70787b bVar) {
        this.f188783c = bVar.f188771a;
        this.f188784d = bVar.f188772b;
        this.f188785e = bVar.f188773c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C70790c)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C70790c cVar = (C70790c) obj;
        boolean z = cVar.f188782b;
        return Arrays.equals(this.f188783c, cVar.f188783c) && Arrays.equals(this.f188784d, cVar.f188784d) && this.f188785e == cVar.f188785e;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f188783c) + 527) * 31) + Arrays.hashCode(this.f188784d)) * 31) + (this.f188785e ^ true ? 1 : 0);
    }

    public final String toString() {
        List list;
        String str;
        String[] strArr = this.f188783c;
        int i = 0;
        if (strArr == null) {
            list = null;
        } else {
            C70771a[] aVarArr = new C70771a[strArr.length];
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.f188783c;
                if (i2 >= strArr2.length) {
                    break;
                }
                aVarArr[i2] = C70771a.m103485a(strArr2[i2]);
                i2++;
            }
            list = C70806s.m103573a(aVarArr);
        }
        if (list == null) {
            str = "[use default]";
        } else {
            str = list.toString();
        }
        C70805r[] rVarArr = new C70805r[this.f188784d.length];
        while (true) {
            String[] strArr3 = this.f188784d;
            if (i < strArr3.length) {
                rVarArr[i] = C70805r.m103572a(strArr3[i]);
                i++;
            } else {
                String valueOf = String.valueOf(C70806s.m103573a(rVarArr));
                boolean z = this.f188785e;
                return "ConnectionSpec(cipherSuites=" + str + ", tlsVersions=" + valueOf + ", supportsTlsExtensions=" + z + ")";
            }
        }
    }
}
