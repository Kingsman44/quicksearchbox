package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.bm */
/* compiled from: PG */
public final class C66835bm extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66835bm f181742c;

    /* renamed from: e */
    private static volatile C63010eb f181743e;

    /* renamed from: a */
    public C67131me f181744a;

    /* renamed from: b */
    public C67135mi f181745b;

    /* renamed from: d */
    private int f181746d;

    static {
        C66835bm bmVar = new C66835bm();
        f181742c = bmVar;
        C62942bv.registerDefaultInstance(C66835bm.class, bmVar);
    }

    private C66835bm() {
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
                return newMessageInfo(f181742c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C66835bm();
            case 4:
                return new C66834bl();
            case 5:
                return f181742c;
            case 6:
                C63010eb ebVar = f181743e;
                if (ebVar == null) {
                    synchronized (C66835bm.class) {
                        ebVar = f181743e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181742c);
                            f181743e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
