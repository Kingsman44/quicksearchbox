package com.google.assistant.p3745ab.p3772x;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.x.f */
/* compiled from: PG */
public final class C48429f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48429f f125149a;

    /* renamed from: b */
    private static volatile C63010eb f125150b;

    static {
        C48429f fVar = new C48429f();
        f125149a = fVar;
        C62942bv.registerDefaultInstance(C48429f.class, fVar);
    }

    private C48429f() {
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
                return newMessageInfo(f125149a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C48429f();
            case 4:
                return new C48428e();
            case 5:
                return f125149a;
            case 6:
                C63010eb ebVar = f125150b;
                if (ebVar == null) {
                    synchronized (C48429f.class) {
                        ebVar = f125150b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125149a);
                            f125150b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
