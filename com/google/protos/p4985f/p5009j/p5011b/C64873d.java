package com.google.protos.p4985f.p5009j.p5011b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.j.b.d */
/* compiled from: PG */
public final class C64873d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64873d f175780a;

    /* renamed from: b */
    private static volatile C63010eb f175781b;

    static {
        C64873d dVar = new C64873d();
        f175780a = dVar;
        C62942bv.registerDefaultInstance(C64873d.class, dVar);
    }

    private C64873d() {
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
                return newMessageInfo(f175780a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64873d();
            case 4:
                return new C64872c();
            case 5:
                return f175780a;
            case 6:
                C63010eb ebVar = f175781b;
                if (ebVar == null) {
                    synchronized (C64873d.class) {
                        ebVar = f175781b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175780a);
                            f175781b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
