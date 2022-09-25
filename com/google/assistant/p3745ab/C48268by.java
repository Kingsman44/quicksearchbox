package com.google.assistant.p3745ab;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.by */
/* compiled from: PG */
public final class C48268by extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48268by f124847a;

    /* renamed from: b */
    private static volatile C63010eb f124848b;

    static {
        C48268by byVar = new C48268by();
        f124847a = byVar;
        C62942bv.registerDefaultInstance(C48268by.class, byVar);
    }

    private C48268by() {
        emptyIntList();
        emptyIntList();
        emptyIntList();
        emptyIntList();
        emptyIntList();
        emptyIntList();
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
                return newMessageInfo(f124847a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48268by();
            case 4:
                return new C48267bx();
            case 5:
                return f124847a;
            case 6:
                C63010eb ebVar = f124848b;
                if (ebVar == null) {
                    synchronized (C48268by.class) {
                        ebVar = f124848b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124847a);
                            f124848b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
