package com.google.android.apps.search.assistant.platform.p9141h.p9167j.p9168a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.h.j.a.d */
/* compiled from: PG */
public final class C121167d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C121167d f336660c;

    /* renamed from: d */
    private static volatile C63010eb f336661d;

    /* renamed from: a */
    public int f336662a;

    /* renamed from: b */
    public int f336663b;

    static {
        C121167d dVar = new C121167d();
        f336660c = dVar;
        C62942bv.registerDefaultInstance(C121167d.class, dVar);
    }

    private C121167d() {
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
                return newMessageInfo(f336660c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C121166c.m200460b()});
            case 3:
                return new C121167d();
            case 4:
                return new C121164a();
            case 5:
                return f336660c;
            case 6:
                C63010eb ebVar = f336661d;
                if (ebVar == null) {
                    synchronized (C121167d.class) {
                        ebVar = f336661d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f336660c);
                            f336661d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
