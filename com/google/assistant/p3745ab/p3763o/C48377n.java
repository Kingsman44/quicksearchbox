package com.google.assistant.p3745ab.p3763o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.o.n */
/* compiled from: PG */
public final class C48377n extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48377n f125054a;

    /* renamed from: d */
    private static volatile C63010eb f125055d;

    /* renamed from: b */
    private C48373j f125056b;

    /* renamed from: c */
    private byte f125057c = 2;

    static {
        C48377n nVar = new C48377n();
        f125054a = nVar;
        C62942bv.registerDefaultInstance(C48377n.class, nVar);
    }

    private C48377n() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f125057c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f125057c = b;
                return null;
            case 2:
                return newMessageInfo(f125054a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"b"});
            case 3:
                return new C48377n();
            case 4:
                return new C48376m();
            case 5:
                return f125054a;
            case 6:
                C63010eb ebVar = f125055d;
                if (ebVar == null) {
                    synchronized (C48377n.class) {
                        ebVar = f125055d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125054a);
                            f125055d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
