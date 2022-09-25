package com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a.p2800a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.t.c.a.a.t */
/* compiled from: PG */
public final class C36548t extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C36548t f95333a;

    /* renamed from: b */
    private static volatile C63010eb f95334b;

    static {
        C36548t tVar = new C36548t();
        f95333a = tVar;
        C62942bv.registerDefaultInstance(C36548t.class, tVar);
    }

    private C36548t() {
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
                return newMessageInfo(f95333a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C36548t();
            case 4:
                return new C36547s();
            case 5:
                return f95333a;
            case 6:
                C63010eb ebVar = f95334b;
                if (ebVar == null) {
                    synchronized (C36548t.class) {
                        ebVar = f95334b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f95333a);
                            f95334b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
