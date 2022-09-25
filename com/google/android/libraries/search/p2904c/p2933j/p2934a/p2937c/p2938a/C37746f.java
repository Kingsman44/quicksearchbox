package com.google.android.libraries.search.p2904c.p2933j.p2934a.p2937c.p2938a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.j.a.c.a.f */
/* compiled from: PG */
public final class C37746f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C37746f f100178a;

    /* renamed from: b */
    private static volatile C63010eb f100179b;

    static {
        C37746f fVar = new C37746f();
        f100178a = fVar;
        C62942bv.registerDefaultInstance(C37746f.class, fVar);
    }

    private C37746f() {
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
                return newMessageInfo(f100178a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C37746f();
            case 4:
                return new C37745e();
            case 5:
                return f100178a;
            case 6:
                C63010eb ebVar = f100179b;
                if (ebVar == null) {
                    synchronized (C37746f.class) {
                        ebVar = f100179b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100178a);
                            f100179b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
