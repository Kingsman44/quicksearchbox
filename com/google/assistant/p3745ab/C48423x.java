package com.google.assistant.p3745ab;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.x */
/* compiled from: PG */
public final class C48423x extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48423x f125141a;

    /* renamed from: b */
    private static volatile C63010eb f125142b;

    static {
        C48423x xVar = new C48423x();
        f125141a = xVar;
        C62942bv.registerDefaultInstance(C48423x.class, xVar);
    }

    private C48423x() {
        emptyProtobufList();
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
                return newMessageInfo(f125141a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48423x();
            case 4:
                return new C48413w();
            case 5:
                return f125141a;
            case 6:
                C63010eb ebVar = f125142b;
                if (ebVar == null) {
                    synchronized (C48423x.class) {
                        ebVar = f125142b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125141a);
                            f125142b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
