package com.google.android.libraries.search.p2904c.p2967t.p2971c;

import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.t.c.b */
/* compiled from: PG */
public final class C38072b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C38072b f100882e;

    /* renamed from: f */
    private static volatile C63010eb f100883f;

    /* renamed from: a */
    public int f100884a;

    /* renamed from: b */
    public int f100885b;

    /* renamed from: c */
    public C37561eb f100886c;

    /* renamed from: d */
    public int f100887d = -1;

    static {
        C38072b bVar = new C38072b();
        f100882e = bVar;
        C62942bv.registerDefaultInstance(C38072b.class, bVar);
    }

    private C38072b() {
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
                return newMessageInfo(f100882e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002", new Object[]{"a", "b", C38086j.m67234b(), C45240c.f118157a, "d"});
            case 3:
                return new C38072b();
            case 4:
                return new C38057a();
            case 5:
                return f100882e;
            case 6:
                C63010eb ebVar = f100883f;
                if (ebVar == null) {
                    synchronized (C38072b.class) {
                        ebVar = f100883f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100882e);
                            f100883f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
