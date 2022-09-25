package com.google.android.apps.search.fedora.p10107j.p10108a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.fedora.j.a.u */
/* compiled from: PG */
public final class C132974u extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C132974u f362665a;

    /* renamed from: b */
    private static volatile C63010eb f362666b;

    static {
        C132974u uVar = new C132974u();
        f362665a = uVar;
        C62942bv.registerDefaultInstance(C132974u.class, uVar);
    }

    private C132974u() {
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
                return newMessageInfo(f362665a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C132974u();
            case 4:
                return new C132973t();
            case 5:
                return f362665a;
            case 6:
                C63010eb ebVar = f362666b;
                if (ebVar == null) {
                    synchronized (C132974u.class) {
                        ebVar = f362666b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362665a);
                            f362666b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
