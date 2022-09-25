package com.google.protos.p4850an.p4855d.p4863h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.d.h.f */
/* compiled from: PG */
public final class C63572f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63572f f171952a;

    /* renamed from: b */
    private static volatile C63010eb f171953b;

    static {
        C63572f fVar = new C63572f();
        f171952a = fVar;
        C62942bv.registerDefaultInstance(C63572f.class, fVar);
    }

    private C63572f() {
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
                return newMessageInfo(f171952a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C63572f();
            case 4:
                return new C63571e();
            case 5:
                return f171952a;
            case 6:
                C63010eb ebVar = f171953b;
                if (ebVar == null) {
                    synchronized (C63572f.class) {
                        ebVar = f171953b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171952a);
                            f171953b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
