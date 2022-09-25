package com.google.protos.youtube.p5162a.p5163a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.a.a.p */
/* compiled from: PG */
public final class C65999p extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65999p f179492c;

    /* renamed from: d */
    private static volatile C63010eb f179493d;

    /* renamed from: a */
    public int f179494a = 0;

    /* renamed from: b */
    public Object f179495b;

    static {
        C65999p pVar = new C65999p();
        f179492c = pVar;
        C62942bv.registerDefaultInstance(C65999p.class, pVar);
    }

    private C65999p() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f179492c, "\u0001\u0006\u0001\u0000\u0001\u0010\u0006\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\tြ\u0000\fြ\u0000\rြ\u0000\u0010ြ\u0000", new Object[]{"b", "a", C65980aj.class, C65982al.class, C66009z.class, C66003t.class, C66001r.class, C66005v.class});
            case 3:
                return new C65999p();
            case 4:
                return new C65998o();
            case 5:
                return f179492c;
            case 6:
                C63010eb ebVar = f179493d;
                if (ebVar == null) {
                    synchronized (C65999p.class) {
                        ebVar = f179493d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179492c);
                            f179493d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
