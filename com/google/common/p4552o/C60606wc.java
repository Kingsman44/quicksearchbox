package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.wc */
/* compiled from: PG */
public final class C60606wc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60606wc f164409c;

    /* renamed from: d */
    private static volatile C63010eb f164410d;

    /* renamed from: a */
    public int f164411a;

    /* renamed from: b */
    public int f164412b;

    static {
        C60606wc wcVar = new C60606wc();
        f164409c = wcVar;
        C62942bv.registerDefaultInstance(C60606wc.class, wcVar);
    }

    private C60606wc() {
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
                return newMessageInfo(f164409c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C60605wb.f164408a});
            case 3:
                return new C60606wc();
            case 4:
                return new C60604wa();
            case 5:
                return f164409c;
            case 6:
                C63010eb ebVar = f164410d;
                if (ebVar == null) {
                    synchronized (C60606wc.class) {
                        ebVar = f164410d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164409c);
                            f164410d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
