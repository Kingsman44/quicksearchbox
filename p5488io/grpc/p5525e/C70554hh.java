package p5488io.grpc.p5525e;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58832aw;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p5488io.grpc.C70246bq;

/* renamed from: io.grpc.e.hh */
/* compiled from: PG */
final class C70554hh {

    /* renamed from: a */
    public final C70624jx f188075a;

    /* renamed from: b */
    public final Object f188076b;

    /* renamed from: c */
    public final Map f188077c;

    /* renamed from: d */
    private final C70552hf f188078d;

    /* renamed from: e */
    private final Map f188079e;

    /* renamed from: f */
    private final Map f188080f;

    public C70554hh(C70552hf hfVar, Map map, Map map2, C70624jx jxVar, Object obj, Map map3) {
        this.f188078d = hfVar;
        this.f188079e = Collections.unmodifiableMap(new HashMap(map));
        this.f188080f = Collections.unmodifiableMap(new HashMap(map2));
        this.f188075a = jxVar;
        this.f188076b = obj;
        this.f188077c = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C70246bq mo62300a() {
        if (!this.f188080f.isEmpty() || !this.f188079e.isEmpty() || this.f188078d != null) {
            return new C70553hg(this);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: io.grpc.e.hf} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p5488io.grpc.p5525e.C70552hf mo62301b(p5488io.grpc.C70338di r3) {
        /*
            r2 = this;
            java.util.Map r0 = r2.f188079e
            java.lang.String r1 = r3.f187497b
            java.lang.Object r0 = r0.get(r1)
            io.grpc.e.hf r0 = (p5488io.grpc.p5525e.C70552hf) r0
            if (r0 != 0) goto L_0x0017
            java.lang.String r3 = r3.f187498c
            java.util.Map r0 = r2.f188080f
            java.lang.Object r3 = r0.get(r3)
            r0 = r3
            io.grpc.e.hf r0 = (p5488io.grpc.p5525e.C70552hf) r0
        L_0x0017:
            if (r0 != 0) goto L_0x001c
            io.grpc.e.hf r3 = r2.f188078d
            return r3
        L_0x001c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5525e.C70554hh.mo62301b(io.grpc.di):io.grpc.e.hf");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C70554hh hhVar = (C70554hh) obj;
            return C58832aw.m90831a(this.f188078d, hhVar.f188078d) && C58832aw.m90831a(this.f188079e, hhVar.f188079e) && C58832aw.m90831a(this.f188080f, hhVar.f188080f) && C58832aw.m90831a(this.f188075a, hhVar.f188075a) && C58832aw.m90831a(this.f188076b, hhVar.f188076b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f188078d, this.f188079e, this.f188080f, this.f188075a, this.f188076b});
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("defaultMethodConfig", this.f188078d);
        b.mo56102b("serviceMethodMap", this.f188079e);
        b.mo56102b("serviceMap", this.f188080f);
        b.mo56102b("retryThrottling", this.f188075a);
        b.mo56102b("loadBalancingConfig", this.f188076b);
        return b.toString();
    }
}
