package com.google.android.apps.search.fedora.p10107j.p10108a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.fedora.j.a.j */
/* compiled from: PG */
public final class C132963j extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C132963j f362652a;

    /* renamed from: b */
    private static volatile C63010eb f362653b;

    static {
        C132963j jVar = new C132963j();
        f362652a = jVar;
        C62942bv.registerDefaultInstance(C132963j.class, jVar);
    }

    private C132963j() {
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
                return newMessageInfo(f362652a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C132963j();
            case 4:
                return new C132962i();
            case 5:
                return f362652a;
            case 6:
                C63010eb ebVar = f362653b;
                if (ebVar == null) {
                    synchronized (C132963j.class) {
                        ebVar = f362653b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362652a);
                            f362653b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
