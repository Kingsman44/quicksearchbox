package com.google.common.p4552o.p4563i;

import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.ap */
/* compiled from: PG */
public final class C59880ap extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59880ap f161815c;

    /* renamed from: d */
    private static volatile C63010eb f161816d;

    /* renamed from: a */
    public int f161817a;

    /* renamed from: b */
    public C62910ar f161818b;

    static {
        C59880ap apVar = new C59880ap();
        f161815c = apVar;
        C62942bv.registerDefaultInstance(C59880ap.class, apVar);
    }

    private C59880ap() {
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
                return newMessageInfo(f161815c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C59880ap();
            case 4:
                return new C59879ao();
            case 5:
                return f161815c;
            case 6:
                C63010eb ebVar = f161816d;
                if (ebVar == null) {
                    synchronized (C59880ap.class) {
                        ebVar = f161816d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161815c);
                            f161816d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
