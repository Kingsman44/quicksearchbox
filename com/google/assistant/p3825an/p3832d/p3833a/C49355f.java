package com.google.assistant.p3825an.p3832d.p3833a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.d.a.f */
/* compiled from: PG */
public final class C49355f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C49355f f127581a;

    /* renamed from: b */
    private static volatile C63010eb f127582b;

    static {
        C49355f fVar = new C49355f();
        f127581a = fVar;
        C62942bv.registerDefaultInstance(C49355f.class, fVar);
    }

    private C49355f() {
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
                return newMessageInfo(f127581a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C49355f();
            case 4:
                return new C49354e();
            case 5:
                return f127581a;
            case 6:
                C63010eb ebVar = f127582b;
                if (ebVar == null) {
                    synchronized (C49355f.class) {
                        ebVar = f127582b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127581a);
                            f127582b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
