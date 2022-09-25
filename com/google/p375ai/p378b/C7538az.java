package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.az */
/* compiled from: PG */
public final class C7538az extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C7538az f26102a;

    /* renamed from: b */
    private static volatile C63010eb f26103b;

    static {
        C7538az azVar = new C7538az();
        f26102a = azVar;
        C62942bv.registerDefaultInstance(C7538az.class, azVar);
    }

    private C7538az() {
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
                return newMessageInfo(f26102a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C7538az();
            case 4:
                return new C7537ay();
            case 5:
                return f26102a;
            case 6:
                C63010eb ebVar = f26103b;
                if (ebVar == null) {
                    synchronized (C7538az.class) {
                        ebVar = f26103b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26102a);
                            f26103b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
