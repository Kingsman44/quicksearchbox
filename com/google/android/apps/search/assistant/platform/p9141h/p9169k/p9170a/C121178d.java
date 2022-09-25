package com.google.android.apps.search.assistant.platform.p9141h.p9169k.p9170a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.h.k.a.d */
/* compiled from: PG */
public final class C121178d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C121178d f336682c;

    /* renamed from: d */
    private static volatile C63010eb f336683d;

    /* renamed from: a */
    public int f336684a;

    /* renamed from: b */
    public int f336685b;

    static {
        C121178d dVar = new C121178d();
        f336682c = dVar;
        C62942bv.registerDefaultInstance(C121178d.class, dVar);
    }

    private C121178d() {
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
                return newMessageInfo(f336682c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C121177c.m200469b()});
            case 3:
                return new C121178d();
            case 4:
                return new C121175a();
            case 5:
                return f336682c;
            case 6:
                C63010eb ebVar = f336683d;
                if (ebVar == null) {
                    synchronized (C121178d.class) {
                        ebVar = f336683d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f336682c);
                            f336683d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
