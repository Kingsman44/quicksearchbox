package com.google.android.libraries.search.p2904c.p2933j.p2934a.p2937c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.j.a.c.f */
/* compiled from: PG */
public final class C37763f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C37763f f100196a;

    /* renamed from: b */
    private static volatile C63010eb f100197b;

    static {
        C37763f fVar = new C37763f();
        f100196a = fVar;
        C62942bv.registerDefaultInstance(C37763f.class, fVar);
    }

    private C37763f() {
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
                return newMessageInfo(f100196a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C37763f();
            case 4:
                return new C37762e();
            case 5:
                return f100196a;
            case 6:
                C63010eb ebVar = f100197b;
                if (ebVar == null) {
                    synchronized (C37763f.class) {
                        ebVar = f100197b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100196a);
                            f100197b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
