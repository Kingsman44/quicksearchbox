package com.google.android.libraries.search.p2904c.p2933j.p2934a.p2937c;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.j.a.c.n */
/* compiled from: PG */
public final class C37771n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37771n f100204c;

    /* renamed from: d */
    private static volatile C63010eb f100205d;

    /* renamed from: a */
    public int f100206a;

    /* renamed from: b */
    public String f100207b = BuildConfig.FLAVOR;

    static {
        C37771n nVar = new C37771n();
        f100204c = nVar;
        C62942bv.registerDefaultInstance(C37771n.class, nVar);
    }

    private C37771n() {
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
                return newMessageInfo(f100204c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C37771n();
            case 4:
                return new C37770m();
            case 5:
                return f100204c;
            case 6:
                C63010eb ebVar = f100205d;
                if (ebVar == null) {
                    synchronized (C37771n.class) {
                        ebVar = f100205d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100204c);
                            f100205d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
