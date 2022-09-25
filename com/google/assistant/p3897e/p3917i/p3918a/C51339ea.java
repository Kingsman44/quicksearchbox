package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.assistant.p3897e.p3902c.p3907c.C51050en;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.ea */
/* compiled from: PG */
public final class C51339ea extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51339ea f133718c;

    /* renamed from: d */
    private static volatile C63010eb f133719d;

    /* renamed from: a */
    public int f133720a;

    /* renamed from: b */
    public int f133721b;

    static {
        C51339ea eaVar = new C51339ea();
        f133718c = eaVar;
        C62942bv.registerDefaultInstance(C51339ea.class, eaVar);
    }

    private C51339ea() {
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
                return newMessageInfo(f133718c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C51050en.f132932a});
            case 3:
                return new C51339ea();
            case 4:
                return new C51337dz();
            case 5:
                return f133718c;
            case 6:
                C63010eb ebVar = f133719d;
                if (ebVar == null) {
                    synchronized (C51339ea.class) {
                        ebVar = f133719d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133718c);
                            f133719d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
