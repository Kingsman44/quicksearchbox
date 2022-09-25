package com.google.assistant.p3931f.p3939c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.f.c.u */
/* compiled from: PG */
public final class C52844u extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52844u f138645b;

    /* renamed from: c */
    private static volatile C63010eb f138646c;

    /* renamed from: a */
    public C52818ah f138647a;

    static {
        C52844u uVar = new C52844u();
        f138645b = uVar;
        C62942bv.registerDefaultInstance(C52844u.class, uVar);
    }

    private C52844u() {
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
                return newMessageInfo(f138645b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C52844u();
            case 4:
                return new C52843t();
            case 5:
                return f138645b;
            case 6:
                C63010eb ebVar = f138646c;
                if (ebVar == null) {
                    synchronized (C52844u.class) {
                        ebVar = f138646c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138645b);
                            f138646c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
