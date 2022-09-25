package com.google.android.libraries.search.p2904c.p2967t.p2971c.p2973b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.libraries.search.p2904c.p2967t.p2971c.C38086j;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.t.c.b.b */
/* compiled from: PG */
public final class C38074b extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C38074b f100888g;

    /* renamed from: h */
    private static volatile C63010eb f100889h;

    /* renamed from: a */
    public int f100890a;

    /* renamed from: b */
    public int f100891b = 0;

    /* renamed from: c */
    public Object f100892c;

    /* renamed from: d */
    public int f100893d;

    /* renamed from: e */
    public String f100894e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f100895f = -1;

    static {
        C38074b bVar = new C38074b();
        f100888g = bVar;
        C62942bv.registerDefaultInstance(C38074b.class, bVar);
    }

    private C38074b() {
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
                return newMessageInfo(f100888g, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ဈ\u0003\u0005င\u0004", new Object[]{C45240c.f118157a, "b", "a", "d", C38086j.m67234b(), C37561eb.class, C37514du.class, "e", C10662f.f35572a});
            case 3:
                return new C38074b();
            case 4:
                return new C38073a();
            case 5:
                return f100888g;
            case 6:
                C63010eb ebVar = f100889h;
                if (ebVar == null) {
                    synchronized (C38074b.class) {
                        ebVar = f100889h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100888g);
                            f100889h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
