package com.google.protos.p4985f.p5005g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.g.b */
/* compiled from: PG */
public final class C64855b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64855b f175753a;

    /* renamed from: b */
    private static volatile C63010eb f175754b;

    static {
        C64855b bVar = new C64855b();
        f175753a = bVar;
        C62942bv.registerDefaultInstance(C64855b.class, bVar);
    }

    private C64855b() {
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
                return newMessageInfo(f175753a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64855b();
            case 4:
                return new C64854a();
            case 5:
                return f175753a;
            case 6:
                C63010eb ebVar = f175754b;
                if (ebVar == null) {
                    synchronized (C64855b.class) {
                        ebVar = f175754b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175753a);
                            f175754b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
