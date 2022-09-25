package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.og */
/* compiled from: PG */
public final class C51615og extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51615og f134516c;

    /* renamed from: d */
    private static volatile C63010eb f134517d;

    /* renamed from: a */
    public int f134518a;

    /* renamed from: b */
    public int f134519b = 1;

    static {
        C51615og ogVar = new C51615og();
        f134516c = ogVar;
        C62942bv.registerDefaultInstance(C51615og.class, ogVar);
    }

    private C51615og() {
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
                return newMessageInfo(f134516c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C51613oe.m86251b()});
            case 3:
                return new C51615og();
            case 4:
                return new C51614of();
            case 5:
                return f134516c;
            case 6:
                C63010eb ebVar = f134517d;
                if (ebVar == null) {
                    synchronized (C51615og.class) {
                        ebVar = f134517d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134516c);
                            f134517d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
