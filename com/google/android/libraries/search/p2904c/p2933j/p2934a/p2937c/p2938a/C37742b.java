package com.google.android.libraries.search.p2904c.p2933j.p2934a.p2937c.p2938a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.j.a.c.a.b */
/* compiled from: PG */
public final class C37742b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C37742b f100174a;

    /* renamed from: b */
    private static volatile C63010eb f100175b;

    static {
        C37742b bVar = new C37742b();
        f100174a = bVar;
        C62942bv.registerDefaultInstance(C37742b.class, bVar);
    }

    private C37742b() {
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
                return newMessageInfo(f100174a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C37742b();
            case 4:
                return new C37741a();
            case 5:
                return f100174a;
            case 6:
                C63010eb ebVar = f100175b;
                if (ebVar == null) {
                    synchronized (C37742b.class) {
                        ebVar = f100175b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100174a);
                            f100175b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
