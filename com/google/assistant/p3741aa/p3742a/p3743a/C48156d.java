package com.google.assistant.p3741aa.p3742a.p3743a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.aa.a.a.d */
/* compiled from: PG */
public final class C48156d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48156d f124605a;

    /* renamed from: b */
    private static volatile C63010eb f124606b;

    static {
        C48156d dVar = new C48156d();
        f124605a = dVar;
        C62942bv.registerDefaultInstance(C48156d.class, dVar);
    }

    private C48156d() {
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
                return newMessageInfo(f124605a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C48156d();
            case 4:
                return new C48155c();
            case 5:
                return f124605a;
            case 6:
                C63010eb ebVar = f124606b;
                if (ebVar == null) {
                    synchronized (C48156d.class) {
                        ebVar = f124606b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124605a);
                            f124606b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
