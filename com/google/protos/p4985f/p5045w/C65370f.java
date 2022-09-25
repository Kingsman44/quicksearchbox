package com.google.protos.p4985f.p5045w;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.w.f */
/* compiled from: PG */
public final class C65370f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65370f f177764a;

    /* renamed from: b */
    private static volatile C63010eb f177765b;

    static {
        C65370f fVar = new C65370f();
        f177764a = fVar;
        C62942bv.registerDefaultInstance(C65370f.class, fVar);
    }

    private C65370f() {
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
                return newMessageInfo(f177764a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65370f();
            case 4:
                return new C65369e();
            case 5:
                return f177764a;
            case 6:
                C63010eb ebVar = f177765b;
                if (ebVar == null) {
                    synchronized (C65370f.class) {
                        ebVar = f177765b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177764a);
                            f177765b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
