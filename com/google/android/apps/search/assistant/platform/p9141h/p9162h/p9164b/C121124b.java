package com.google.android.apps.search.assistant.platform.p9141h.p9162h.p9164b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.h.h.b.b */
/* compiled from: PG */
public final class C121124b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C121124b f336563c;

    /* renamed from: d */
    private static volatile C63010eb f336564d;

    /* renamed from: a */
    public int f336565a;

    /* renamed from: b */
    public boolean f336566b;

    static {
        C121124b bVar = new C121124b();
        f336563c = bVar;
        C62942bv.registerDefaultInstance(C121124b.class, bVar);
    }

    private C121124b() {
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
                return newMessageInfo(f336563c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C121124b();
            case 4:
                return new C121123a();
            case 5:
                return f336563c;
            case 6:
                C63010eb ebVar = f336564d;
                if (ebVar == null) {
                    synchronized (C121124b.class) {
                        ebVar = f336564d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f336563c);
                            f336564d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
