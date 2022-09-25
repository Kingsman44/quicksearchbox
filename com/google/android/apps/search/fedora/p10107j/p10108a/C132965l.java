package com.google.android.apps.search.fedora.p10107j.p10108a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.fedora.j.a.l */
/* compiled from: PG */
public final class C132965l extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C132965l f362654a;

    /* renamed from: b */
    private static volatile C63010eb f362655b;

    static {
        C132965l lVar = new C132965l();
        f362654a = lVar;
        C62942bv.registerDefaultInstance(C132965l.class, lVar);
    }

    private C132965l() {
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
                return newMessageInfo(f362654a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C132965l();
            case 4:
                return new C132964k();
            case 5:
                return f362654a;
            case 6:
                C63010eb ebVar = f362655b;
                if (ebVar == null) {
                    synchronized (C132965l.class) {
                        ebVar = f362655b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362654a);
                            f362655b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
