package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.bo */
/* compiled from: PG */
public final class C53105bo extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53105bo f139161c;

    /* renamed from: d */
    private static volatile C63010eb f139162d;

    /* renamed from: a */
    public int f139163a = 0;

    /* renamed from: b */
    public Object f139164b;

    static {
        C53105bo boVar = new C53105bo();
        f139161c = boVar;
        C62942bv.registerDefaultInstance(C53105bo.class, boVar);
    }

    private C53105bo() {
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
                return newMessageInfo(f139161c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C53104bn.class, C53102bl.class});
            case 3:
                return new C53105bo();
            case 4:
                return new C53100bj();
            case 5:
                return f139161c;
            case 6:
                C63010eb ebVar = f139162d;
                if (ebVar == null) {
                    synchronized (C53105bo.class) {
                        ebVar = f139162d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139161c);
                            f139162d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
