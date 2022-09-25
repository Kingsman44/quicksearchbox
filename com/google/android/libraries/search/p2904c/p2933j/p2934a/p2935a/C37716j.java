package com.google.android.libraries.search.p2904c.p2933j.p2934a.p2935a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.j.a.a.j */
/* compiled from: PG */
public final class C37716j extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C37716j f100144a;

    /* renamed from: b */
    private static volatile C63010eb f100145b;

    static {
        C37716j jVar = new C37716j();
        f100144a = jVar;
        C62942bv.registerDefaultInstance(C37716j.class, jVar);
    }

    private C37716j() {
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
                return newMessageInfo(f100144a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C37716j();
            case 4:
                return new C37715i();
            case 5:
                return f100144a;
            case 6:
                C63010eb ebVar = f100145b;
                if (ebVar == null) {
                    synchronized (C37716j.class) {
                        ebVar = f100145b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100144a);
                            f100145b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
