package com.google.android.libraries.search.p2904c.p2933j.p2934a.p2937c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.j.a.c.j */
/* compiled from: PG */
public final class C37767j extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C37767j f100200a;

    /* renamed from: b */
    private static volatile C63010eb f100201b;

    static {
        C37767j jVar = new C37767j();
        f100200a = jVar;
        C62942bv.registerDefaultInstance(C37767j.class, jVar);
    }

    private C37767j() {
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
                return newMessageInfo(f100200a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C37767j();
            case 4:
                return new C37766i();
            case 5:
                return f100200a;
            case 6:
                C63010eb ebVar = f100201b;
                if (ebVar == null) {
                    synchronized (C37767j.class) {
                        ebVar = f100201b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100200a);
                            f100201b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
