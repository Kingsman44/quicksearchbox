package com.google.android.libraries.search.p2904c.p2967t.p2971c;

import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.t.c.d */
/* compiled from: PG */
public final class C38080d extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C38080d f100899f;

    /* renamed from: g */
    private static volatile C63010eb f100900g;

    /* renamed from: a */
    public int f100901a;

    /* renamed from: b */
    public int f100902b = 0;

    /* renamed from: c */
    public Object f100903c;

    /* renamed from: d */
    public int f100904d;

    /* renamed from: e */
    public int f100905e = -1;

    static {
        C38080d dVar = new C38080d();
        f100899f = dVar;
        C62942bv.registerDefaultInstance(C38080d.class, dVar);
    }

    private C38080d() {
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
                return newMessageInfo(f100899f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004င\u0003", new Object[]{C45240c.f118157a, "b", "a", "d", C38086j.m67234b(), C37561eb.class, C37514du.class, "e"});
            case 3:
                return new C38080d();
            case 4:
                return new C38078c();
            case 5:
                return f100899f;
            case 6:
                C63010eb ebVar = f100900g;
                if (ebVar == null) {
                    synchronized (C38080d.class) {
                        ebVar = f100900g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100899f);
                            f100900g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
