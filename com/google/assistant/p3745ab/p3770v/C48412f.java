package com.google.assistant.p3745ab.p3770v;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.v.f */
/* compiled from: PG */
public final class C48412f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48412f f125112a;

    /* renamed from: b */
    private static volatile C63010eb f125113b;

    static {
        C48412f fVar = new C48412f();
        f125112a = fVar;
        C62942bv.registerDefaultInstance(C48412f.class, fVar);
    }

    private C48412f() {
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
                return newMessageInfo(f125112a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C48412f();
            case 4:
                return new C48411e();
            case 5:
                return f125112a;
            case 6:
                C63010eb ebVar = f125113b;
                if (ebVar == null) {
                    synchronized (C48412f.class) {
                        ebVar = f125113b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125112a);
                            f125113b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
