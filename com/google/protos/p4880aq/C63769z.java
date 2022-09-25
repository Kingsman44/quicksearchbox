package com.google.protos.p4880aq;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aq.z */
/* compiled from: PG */
public final class C63769z extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63769z f172506c;

    /* renamed from: d */
    private static volatile C63010eb f172507d;

    /* renamed from: a */
    public int f172508a = 0;

    /* renamed from: b */
    public Object f172509b;

    static {
        C63769z zVar = new C63769z();
        f172506c = zVar;
        C62942bv.registerDefaultInstance(C63769z.class, zVar);
    }

    private C63769z() {
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
                return newMessageInfo(f172506c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C63715ad.class, C63766w.class});
            case 3:
                return new C63769z();
            case 4:
                return new C63767x();
            case 5:
                return f172506c;
            case 6:
                C63010eb ebVar = f172507d;
                if (ebVar == null) {
                    synchronized (C63769z.class) {
                        ebVar = f172507d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172506c);
                            f172507d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
