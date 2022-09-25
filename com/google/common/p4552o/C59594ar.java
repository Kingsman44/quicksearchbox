package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.common.o.ar */
/* compiled from: PG */
public final class C59594ar extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59594ar f159800c;

    /* renamed from: d */
    private static volatile C63010eb f159801d;

    /* renamed from: a */
    public int f159802a;

    /* renamed from: b */
    public C63042fg f159803b;

    static {
        C59594ar arVar = new C59594ar();
        f159800c = arVar;
        C62942bv.registerDefaultInstance(C59594ar.class, arVar);
    }

    private C59594ar() {
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
                return newMessageInfo(f159800c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C59594ar();
            case 4:
                return new C59593aq();
            case 5:
                return f159800c;
            case 6:
                C63010eb ebVar = f159801d;
                if (ebVar == null) {
                    synchronized (C59594ar.class) {
                        ebVar = f159801d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159800c);
                            f159801d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
