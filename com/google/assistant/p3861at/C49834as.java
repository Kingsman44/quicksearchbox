package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.as */
/* compiled from: PG */
public final class C49834as extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C49834as f129495a;

    /* renamed from: b */
    private static volatile C63010eb f129496b;

    static {
        C49834as asVar = new C49834as();
        f129495a = asVar;
        C62942bv.registerDefaultInstance(C49834as.class, asVar);
    }

    private C49834as() {
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
                return newMessageInfo(f129495a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C49834as();
            case 4:
                return new C49833ar();
            case 5:
                return f129495a;
            case 6:
                C63010eb ebVar = f129496b;
                if (ebVar == null) {
                    synchronized (C49834as.class) {
                        ebVar = f129496b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129495a);
                            f129496b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
