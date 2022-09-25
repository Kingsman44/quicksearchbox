package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.gr */
/* compiled from: PG */
public final class C37639gr extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37639gr f100004c;

    /* renamed from: d */
    private static volatile C63010eb f100005d;

    /* renamed from: a */
    public int f100006a;

    /* renamed from: b */
    public int f100007b;

    static {
        C37639gr grVar = new C37639gr();
        f100004c = grVar;
        C62942bv.registerDefaultInstance(C37639gr.class, grVar);
    }

    private C37639gr() {
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
                return newMessageInfo(f100004c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C37639gr();
            case 4:
                return new C37638gq();
            case 5:
                return f100004c;
            case 6:
                C63010eb ebVar = f100005d;
                if (ebVar == null) {
                    synchronized (C37639gr.class) {
                        ebVar = f100005d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100004c);
                            f100005d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
