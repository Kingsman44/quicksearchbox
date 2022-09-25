package com.google.android.libraries.assistant.p1467d.p1472c.p1474b.p1475a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.d.c.b.a.k */
/* compiled from: PG */
public final class C17861k extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C17861k f51191a;

    /* renamed from: b */
    private static volatile C63010eb f51192b;

    static {
        C17861k kVar = new C17861k();
        f51191a = kVar;
        C62942bv.registerDefaultInstance(C17861k.class, kVar);
    }

    private C17861k() {
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
                return newMessageInfo(f51191a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C17861k();
            case 4:
                return new C17860j();
            case 5:
                return f51191a;
            case 6:
                C63010eb ebVar = f51192b;
                if (ebVar == null) {
                    synchronized (C17861k.class) {
                        ebVar = f51192b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f51191a);
                            f51192b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
