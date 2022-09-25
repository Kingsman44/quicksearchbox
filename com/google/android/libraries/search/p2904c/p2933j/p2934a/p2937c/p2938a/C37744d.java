package com.google.android.libraries.search.p2904c.p2933j.p2934a.p2937c.p2938a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.j.a.c.a.d */
/* compiled from: PG */
public final class C37744d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C37744d f100176a;

    /* renamed from: b */
    private static volatile C63010eb f100177b;

    static {
        C37744d dVar = new C37744d();
        f100176a = dVar;
        C62942bv.registerDefaultInstance(C37744d.class, dVar);
    }

    private C37744d() {
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
                return newMessageInfo(f100176a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C37744d();
            case 4:
                return new C37743c();
            case 5:
                return f100176a;
            case 6:
                C63010eb ebVar = f100177b;
                if (ebVar == null) {
                    synchronized (C37744d.class) {
                        ebVar = f100177b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100176a);
                            f100177b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
