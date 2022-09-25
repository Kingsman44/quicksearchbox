package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.f.a.a.f */
/* compiled from: PG */
public final class C57645f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C57645f f153951a;

    /* renamed from: b */
    private static volatile C63010eb f153952b;

    static {
        C57645f fVar = new C57645f();
        f153951a = fVar;
        C62942bv.registerDefaultInstance(C57645f.class, fVar);
    }

    private C57645f() {
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
                return newMessageInfo(f153951a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C57645f();
            case 4:
                return new C57644e();
            case 5:
                return f153951a;
            case 6:
                C63010eb ebVar = f153952b;
                if (ebVar == null) {
                    synchronized (C57645f.class) {
                        ebVar = f153952b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153951a);
                            f153952b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
