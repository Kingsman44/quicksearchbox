package com.google.speech.p5218j.p5219a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.a.y */
/* compiled from: PG */
public final class C66758y extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C66758y f181569a;

    /* renamed from: b */
    private static volatile C63010eb f181570b;

    static {
        C66758y yVar = new C66758y();
        f181569a = yVar;
        C62942bv.registerDefaultInstance(C66758y.class, yVar);
    }

    private C66758y() {
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
                return newMessageInfo(f181569a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66758y();
            case 4:
                return new C66757x();
            case 5:
                return f181569a;
            case 6:
                C63010eb ebVar = f181570b;
                if (ebVar == null) {
                    synchronized (C66758y.class) {
                        ebVar = f181570b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181569a);
                            f181570b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
