package com.google.protos.p4985f.p5009j.p5019j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.j.j.b */
/* compiled from: PG */
public final class C64897b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64897b f175806a;

    /* renamed from: b */
    private static volatile C63010eb f175807b;

    static {
        C64897b bVar = new C64897b();
        f175806a = bVar;
        C62942bv.registerDefaultInstance(C64897b.class, bVar);
    }

    private C64897b() {
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
                return newMessageInfo(f175806a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64897b();
            case 4:
                return new C64896a();
            case 5:
                return f175806a;
            case 6:
                C63010eb ebVar = f175807b;
                if (ebVar == null) {
                    synchronized (C64897b.class) {
                        ebVar = f175807b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175806a);
                            f175807b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
