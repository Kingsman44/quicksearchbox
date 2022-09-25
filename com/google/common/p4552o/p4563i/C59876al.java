package com.google.common.p4552o.p4563i;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.al */
/* compiled from: PG */
public final class C59876al extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59876al f161807c;

    /* renamed from: d */
    private static volatile C63010eb f161808d;

    /* renamed from: a */
    public int f161809a;

    /* renamed from: b */
    public int f161810b;

    static {
        C59876al alVar = new C59876al();
        f161807c = alVar;
        C62942bv.registerDefaultInstance(C59876al.class, alVar);
    }

    private C59876al() {
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
                return newMessageInfo(f161807c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C59875ak.f161806a});
            case 3:
                return new C59876al();
            case 4:
                return new C59874aj();
            case 5:
                return f161807c;
            case 6:
                C63010eb ebVar = f161808d;
                if (ebVar == null) {
                    synchronized (C59876al.class) {
                        ebVar = f161808d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161807c);
                            f161808d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
