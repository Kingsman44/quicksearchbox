package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.hs */
/* compiled from: PG */
public final class C37672hs extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37672hs f100056c;

    /* renamed from: d */
    private static volatile C63010eb f100057d;

    /* renamed from: a */
    public int f100058a;

    /* renamed from: b */
    public int f100059b;

    static {
        C37672hs hsVar = new C37672hs();
        f100056c = hsVar;
        C62942bv.registerDefaultInstance(C37672hs.class, hsVar);
    }

    private C37672hs() {
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
                return newMessageInfo(f100056c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C37672hs();
            case 4:
                return new C37671hr();
            case 5:
                return f100056c;
            case 6:
                C63010eb ebVar = f100057d;
                if (ebVar == null) {
                    synchronized (C37672hs.class) {
                        ebVar = f100057d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100056c);
                            f100057d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
