package com.google.android.libraries.search.p2904c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.hw */
/* compiled from: PG */
public final class C37676hw extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C37676hw f100061e;

    /* renamed from: f */
    private static volatile C63010eb f100062f;

    /* renamed from: a */
    public int f100063a;

    /* renamed from: b */
    public int f100064b = 0;

    /* renamed from: c */
    public Object f100065c;

    /* renamed from: d */
    public int f100066d;

    static {
        C37676hw hwVar = new C37676hw();
        f100061e = hwVar;
        C62942bv.registerDefaultInstance(C37676hw.class, hwVar);
    }

    private C37676hw() {
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
                return newMessageInfo(f100061e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဿ\u0000\u0003ဿ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C37673ht.f100060a, C37563ed.m66572b(), C37516dw.m66522b()});
            case 3:
                return new C37676hw();
            case 4:
                return new C37675hv();
            case 5:
                return f100061e;
            case 6:
                C63010eb ebVar = f100062f;
                if (ebVar == null) {
                    synchronized (C37676hw.class) {
                        ebVar = f100062f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100061e);
                            f100062f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
