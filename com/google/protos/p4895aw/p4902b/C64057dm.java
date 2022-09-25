package com.google.protos.p4895aw.p4902b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.dm */
/* compiled from: PG */
public final class C64057dm extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64057dm f173196c;

    /* renamed from: d */
    private static volatile C63010eb f173197d;

    /* renamed from: a */
    public int f173198a = 0;

    /* renamed from: b */
    public Object f173199b;

    static {
        C64057dm dmVar = new C64057dm();
        f173196c = dmVar;
        C62942bv.registerDefaultInstance(C64057dm.class, dmVar);
    }

    private C64057dm() {
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
                return newMessageInfo(f173196c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C64075ed.class, C63992bb.class});
            case 3:
                return new C64057dm();
            case 4:
                return new C64055dk();
            case 5:
                return f173196c;
            case 6:
                C63010eb ebVar = f173197d;
                if (ebVar == null) {
                    synchronized (C64057dm.class) {
                        ebVar = f173197d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173196c);
                            f173197d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
