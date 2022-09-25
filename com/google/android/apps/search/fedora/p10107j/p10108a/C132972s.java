package com.google.android.apps.search.fedora.p10107j.p10108a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.fedora.j.a.s */
/* compiled from: PG */
public final class C132972s extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C132972s f362663a;

    /* renamed from: b */
    private static volatile C63010eb f362664b;

    static {
        C132972s sVar = new C132972s();
        f362663a = sVar;
        C62942bv.registerDefaultInstance(C132972s.class, sVar);
    }

    private C132972s() {
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
                return newMessageInfo(f362663a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C132972s();
            case 4:
                return new C132971r();
            case 5:
                return f362663a;
            case 6:
                C63010eb ebVar = f362664b;
                if (ebVar == null) {
                    synchronized (C132972s.class) {
                        ebVar = f362664b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362663a);
                            f362664b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
