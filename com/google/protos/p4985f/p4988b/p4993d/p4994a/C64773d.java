package com.google.protos.p4985f.p4988b.p4993d.p4994a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.b.d.a.d */
/* compiled from: PG */
public final class C64773d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64773d f175569a;

    /* renamed from: b */
    private static volatile C63010eb f175570b;

    static {
        C64773d dVar = new C64773d();
        f175569a = dVar;
        C62942bv.registerDefaultInstance(C64773d.class, dVar);
    }

    private C64773d() {
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
                return newMessageInfo(f175569a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64773d();
            case 4:
                return new C64772c();
            case 5:
                return f175569a;
            case 6:
                C63010eb ebVar = f175570b;
                if (ebVar == null) {
                    synchronized (C64773d.class) {
                        ebVar = f175570b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175569a);
                            f175570b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
