package com.google.assistant.p3931f.p3940d.p3941a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.f.d.a.n */
/* compiled from: PG */
public final class C52907n extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52907n f138745b;

    /* renamed from: c */
    private static volatile C63010eb f138746c;

    /* renamed from: a */
    public int f138747a;

    static {
        C52907n nVar = new C52907n();
        f138745b = nVar;
        C62942bv.registerDefaultInstance(C52907n.class, nVar);
    }

    private C52907n() {
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
                return newMessageInfo(f138745b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
            case 3:
                return new C52907n();
            case 4:
                return new C52906m();
            case 5:
                return f138745b;
            case 6:
                C63010eb ebVar = f138746c;
                if (ebVar == null) {
                    synchronized (C52907n.class) {
                        ebVar = f138746c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138745b);
                            f138746c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
