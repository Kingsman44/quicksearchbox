package com.google.protos.p5129p.p5130a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.p.a.i */
/* compiled from: PG */
public final class C65724i extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65724i f178564a;

    /* renamed from: b */
    private static volatile C63010eb f178565b;

    static {
        C65724i iVar = new C65724i();
        f178564a = iVar;
        C62942bv.registerDefaultInstance(C65724i.class, iVar);
    }

    private C65724i() {
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
                return newMessageInfo(f178564a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65724i();
            case 4:
                return new C65723h();
            case 5:
                return f178564a;
            case 6:
                C63010eb ebVar = f178565b;
                if (ebVar == null) {
                    synchronized (C65724i.class) {
                        ebVar = f178565b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178564a);
                            f178565b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
