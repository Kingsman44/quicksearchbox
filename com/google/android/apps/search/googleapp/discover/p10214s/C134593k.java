package com.google.android.apps.search.googleapp.discover.p10214s;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.s.k */
/* compiled from: PG */
public final class C134593k extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C134593k f366540a;

    /* renamed from: b */
    private static volatile C63010eb f366541b;

    static {
        C134593k kVar = new C134593k();
        f366540a = kVar;
        C62942bv.registerDefaultInstance(C134593k.class, kVar);
    }

    private C134593k() {
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
                return newMessageInfo(f366540a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C134593k();
            case 4:
                return new C134592j();
            case 5:
                return f366540a;
            case 6:
                C63010eb ebVar = f366541b;
                if (ebVar == null) {
                    synchronized (C134593k.class) {
                        ebVar = f366541b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366540a);
                            f366541b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
