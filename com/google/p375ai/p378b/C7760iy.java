package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.iy */
/* compiled from: PG */
public final class C7760iy extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C7760iy f27173c;

    /* renamed from: d */
    private static volatile C63010eb f27174d;

    /* renamed from: a */
    public int f27175a = 0;

    /* renamed from: b */
    public Object f27176b;

    static {
        C7760iy iyVar = new C7760iy();
        f27173c = iyVar;
        C62942bv.registerDefaultInstance(C7760iy.class, iyVar);
    }

    private C7760iy() {
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
                return newMessageInfo(f27173c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"b", "a", C7759ix.class});
            case 3:
                return new C7760iy();
            case 4:
                return new C7755it();
            case 5:
                return f27173c;
            case 6:
                C63010eb ebVar = f27174d;
                if (ebVar == null) {
                    synchronized (C7760iy.class) {
                        ebVar = f27174d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27173c);
                            f27174d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
