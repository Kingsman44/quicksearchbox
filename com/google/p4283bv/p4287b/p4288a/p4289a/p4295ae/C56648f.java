package com.google.p4283bv.p4287b.p4288a.p4289a.p4295ae;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.ae.f */
/* compiled from: PG */
public final class C56648f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56648f f151232a;

    /* renamed from: b */
    private static volatile C63010eb f151233b;

    static {
        C56648f fVar = new C56648f();
        f151232a = fVar;
        C62942bv.registerDefaultInstance(C56648f.class, fVar);
    }

    private C56648f() {
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
                return newMessageInfo(f151232a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56648f();
            case 4:
                return new C56647e();
            case 5:
                return f151232a;
            case 6:
                C63010eb ebVar = f151233b;
                if (ebVar == null) {
                    synchronized (C56648f.class) {
                        ebVar = f151233b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151232a);
                            f151233b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
