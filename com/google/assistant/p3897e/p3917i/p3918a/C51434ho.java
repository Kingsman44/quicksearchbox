package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.ho */
/* compiled from: PG */
public final class C51434ho extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51434ho f133959c;

    /* renamed from: d */
    private static volatile C63010eb f133960d;

    /* renamed from: a */
    public int f133961a;

    /* renamed from: b */
    public C51430hk f133962b;

    static {
        C51434ho hoVar = new C51434ho();
        f133959c = hoVar;
        C62942bv.registerDefaultInstance(C51434ho.class, hoVar);
    }

    private C51434ho() {
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
                return newMessageInfo(f133959c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C51434ho();
            case 4:
                return new C51433hn();
            case 5:
                return f133959c;
            case 6:
                C63010eb ebVar = f133960d;
                if (ebVar == null) {
                    synchronized (C51434ho.class) {
                        ebVar = f133960d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133959c);
                            f133960d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
