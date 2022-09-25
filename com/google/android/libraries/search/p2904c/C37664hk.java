package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.hk */
/* compiled from: PG */
public final class C37664hk extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37664hk f100038c;

    /* renamed from: d */
    private static volatile C63010eb f100039d;

    /* renamed from: a */
    public int f100040a;

    /* renamed from: b */
    public C37561eb f100041b;

    static {
        C37664hk hkVar = new C37664hk();
        f100038c = hkVar;
        C62942bv.registerDefaultInstance(C37664hk.class, hkVar);
    }

    private C37664hk() {
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
                return newMessageInfo(f100038c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C37664hk();
            case 4:
                return new C37663hj();
            case 5:
                return f100038c;
            case 6:
                C63010eb ebVar = f100039d;
                if (ebVar == null) {
                    synchronized (C37664hk.class) {
                        ebVar = f100039d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100038c);
                            f100039d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
