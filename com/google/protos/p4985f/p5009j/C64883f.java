package com.google.protos.p4985f.p5009j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.j.f */
/* compiled from: PG */
public final class C64883f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64883f f175791a;

    /* renamed from: b */
    private static volatile C63010eb f175792b;

    static {
        C64883f fVar = new C64883f();
        f175791a = fVar;
        C62942bv.registerDefaultInstance(C64883f.class, fVar);
    }

    private C64883f() {
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
                return newMessageInfo(f175791a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64883f();
            case 4:
                return new C64880e();
            case 5:
                return f175791a;
            case 6:
                C63010eb ebVar = f175792b;
                if (ebVar == null) {
                    synchronized (C64883f.class) {
                        ebVar = f175792b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175791a);
                            f175792b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
