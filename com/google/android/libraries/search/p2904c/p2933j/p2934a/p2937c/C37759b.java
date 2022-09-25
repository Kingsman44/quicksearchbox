package com.google.android.libraries.search.p2904c.p2933j.p2934a.p2937c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.j.a.c.b */
/* compiled from: PG */
public final class C37759b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C37759b f100192a;

    /* renamed from: b */
    private static volatile C63010eb f100193b;

    static {
        C37759b bVar = new C37759b();
        f100192a = bVar;
        C62942bv.registerDefaultInstance(C37759b.class, bVar);
    }

    private C37759b() {
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
                return newMessageInfo(f100192a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C37759b();
            case 4:
                return new C37740a();
            case 5:
                return f100192a;
            case 6:
                C63010eb ebVar = f100193b;
                if (ebVar == null) {
                    synchronized (C37759b.class) {
                        ebVar = f100193b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100192a);
                            f100193b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
