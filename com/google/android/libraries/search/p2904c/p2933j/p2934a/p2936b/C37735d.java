package com.google.android.libraries.search.p2904c.p2933j.p2934a.p2936b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.j.a.b.d */
/* compiled from: PG */
public final class C37735d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C37735d f100168a;

    /* renamed from: b */
    private static volatile C63010eb f100169b;

    static {
        C37735d dVar = new C37735d();
        f100168a = dVar;
        C62942bv.registerDefaultInstance(C37735d.class, dVar);
    }

    private C37735d() {
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
                return newMessageInfo(f100168a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C37735d();
            case 4:
                return new C37734c();
            case 5:
                return f100168a;
            case 6:
                C63010eb ebVar = f100169b;
                if (ebVar == null) {
                    synchronized (C37735d.class) {
                        ebVar = f100169b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100168a);
                            f100169b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
