package com.google.android.libraries.search.p2904c.p2952o.p2957d;

import com.google.android.libraries.search.p2904c.C37673ht;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.o.d.c */
/* compiled from: PG */
public final class C37930c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C37930c f100537d;

    /* renamed from: e */
    private static volatile C63010eb f100538e;

    /* renamed from: a */
    public int f100539a;

    /* renamed from: b */
    public int f100540b;

    /* renamed from: c */
    public int f100541c;

    static {
        C37930c cVar = new C37930c();
        f100537d = cVar;
        C62942bv.registerDefaultInstance(C37930c.class, cVar);
    }

    private C37930c() {
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
                return newMessageInfo(f100537d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003င\u0001", new Object[]{"a", "b", C37673ht.f100060a, C45240c.f118157a});
            case 3:
                return new C37930c();
            case 4:
                return new C37929b();
            case 5:
                return f100537d;
            case 6:
                C63010eb ebVar = f100538e;
                if (ebVar == null) {
                    synchronized (C37930c.class) {
                        ebVar = f100538e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100537d);
                            f100538e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
