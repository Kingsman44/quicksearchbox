package com.google.android.libraries.search.p2904c.p2933j.p2934a.p2936b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.j.a.b.f */
/* compiled from: PG */
public final class C37737f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C37737f f100170a;

    /* renamed from: b */
    private static volatile C63010eb f100171b;

    static {
        C37737f fVar = new C37737f();
        f100170a = fVar;
        C62942bv.registerDefaultInstance(C37737f.class, fVar);
    }

    private C37737f() {
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
                return newMessageInfo(f100170a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C37737f();
            case 4:
                return new C37736e();
            case 5:
                return f100170a;
            case 6:
                C63010eb ebVar = f100171b;
                if (ebVar == null) {
                    synchronized (C37737f.class) {
                        ebVar = f100171b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100170a);
                            f100171b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
