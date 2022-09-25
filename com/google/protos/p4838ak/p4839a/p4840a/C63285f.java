package com.google.protos.p4838ak.p4839a.p4840a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ak.a.a.f */
/* compiled from: PG */
public final class C63285f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63285f f171030a;

    /* renamed from: b */
    private static volatile C63010eb f171031b;

    static {
        C63285f fVar = new C63285f();
        f171030a = fVar;
        C62942bv.registerDefaultInstance(C63285f.class, fVar);
    }

    private C63285f() {
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
                return newMessageInfo(f171030a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C63285f();
            case 4:
                return new C63284e();
            case 5:
                return f171030a;
            case 6:
                C63010eb ebVar = f171031b;
                if (ebVar == null) {
                    synchronized (C63285f.class) {
                        ebVar = f171031b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171030a);
                            f171031b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
