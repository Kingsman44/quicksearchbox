package com.google.android.apps.search.fedora.p10107j.p10108a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.fedora.j.a.h */
/* compiled from: PG */
public final class C132961h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C132961h f362650a;

    /* renamed from: b */
    private static volatile C63010eb f362651b;

    static {
        C132961h hVar = new C132961h();
        f362650a = hVar;
        C62942bv.registerDefaultInstance(C132961h.class, hVar);
    }

    private C132961h() {
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
                return newMessageInfo(f362650a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C132961h();
            case 4:
                return new C132960g();
            case 5:
                return f362650a;
            case 6:
                C63010eb ebVar = f362651b;
                if (ebVar == null) {
                    synchronized (C132961h.class) {
                        ebVar = f362651b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362650a);
                            f362651b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
