package com.google.android.apps.search.fedora.p10107j.p10108a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.fedora.j.a.d */
/* compiled from: PG */
public final class C132957d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C132957d f362646a;

    /* renamed from: b */
    private static volatile C63010eb f362647b;

    static {
        C132957d dVar = new C132957d();
        f362646a = dVar;
        C62942bv.registerDefaultInstance(C132957d.class, dVar);
    }

    private C132957d() {
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
                return newMessageInfo(f362646a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C132957d();
            case 4:
                return new C132956c();
            case 5:
                return f362646a;
            case 6:
                C63010eb ebVar = f362647b;
                if (ebVar == null) {
                    synchronized (C132957d.class) {
                        ebVar = f362647b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362646a);
                            f362647b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
