package com.google.android.libraries.search.p2904c.p2933j.p2934a.p2936b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.j.a.b.b */
/* compiled from: PG */
public final class C37733b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C37733b f100166a;

    /* renamed from: b */
    private static volatile C63010eb f100167b;

    static {
        C37733b bVar = new C37733b();
        f100166a = bVar;
        C62942bv.registerDefaultInstance(C37733b.class, bVar);
    }

    private C37733b() {
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
                return newMessageInfo(f100166a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C37733b();
            case 4:
                return new C37732a();
            case 5:
                return f100166a;
            case 6:
                C63010eb ebVar = f100167b;
                if (ebVar == null) {
                    synchronized (C37733b.class) {
                        ebVar = f100167b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100166a);
                            f100167b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
