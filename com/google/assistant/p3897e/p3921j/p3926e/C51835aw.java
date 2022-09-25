package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.aw */
/* compiled from: PG */
public final class C51835aw extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51835aw f135984a;

    /* renamed from: b */
    private static volatile C63010eb f135985b;

    static {
        C51835aw awVar = new C51835aw();
        f135984a = awVar;
        C62942bv.registerDefaultInstance(C51835aw.class, awVar);
    }

    private C51835aw() {
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
                return newMessageInfo(f135984a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51835aw();
            case 4:
                return new C51834av();
            case 5:
                return f135984a;
            case 6:
                C63010eb ebVar = f135985b;
                if (ebVar == null) {
                    synchronized (C51835aw.class) {
                        ebVar = f135985b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135984a);
                            f135985b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
