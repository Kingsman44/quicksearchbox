package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.ch */
/* compiled from: PG */
public final class C64501ch extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64501ch f174941c;

    /* renamed from: d */
    private static volatile C63010eb f174942d;

    /* renamed from: a */
    public C64500cg f174943a;

    /* renamed from: b */
    public C64498ce f174944b;

    static {
        C64501ch chVar = new C64501ch();
        f174941c = chVar;
        C62942bv.registerDefaultInstance(C64501ch.class, chVar);
    }

    private C64501ch() {
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
                return newMessageInfo(f174941c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C64501ch();
            case 4:
                return new C64494ca();
            case 5:
                return f174941c;
            case 6:
                C63010eb ebVar = f174942d;
                if (ebVar == null) {
                    synchronized (C64501ch.class) {
                        ebVar = f174942d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174941c);
                            f174942d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
