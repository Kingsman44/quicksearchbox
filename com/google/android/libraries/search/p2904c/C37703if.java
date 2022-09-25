package com.google.android.libraries.search.p2904c;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.if */
/* compiled from: PG */
public final class C37703if extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37703if f100132c;

    /* renamed from: d */
    private static volatile C63010eb f100133d;

    /* renamed from: a */
    public int f100134a;

    /* renamed from: b */
    public String f100135b = BuildConfig.FLAVOR;

    static {
        C37703if ifVar = new C37703if();
        f100132c = ifVar;
        C62942bv.registerDefaultInstance(C37703if.class, ifVar);
    }

    private C37703if() {
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
                return newMessageInfo(f100132c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C37703if();
            case 4:
                return new C37702ie();
            case 5:
                return f100132c;
            case 6:
                C63010eb ebVar = f100133d;
                if (ebVar == null) {
                    synchronized (C37703if.class) {
                        ebVar = f100133d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100132c);
                            f100133d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
