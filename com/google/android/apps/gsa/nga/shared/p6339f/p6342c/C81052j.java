package com.google.android.apps.gsa.nga.shared.p6339f.p6342c;

import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5208h.C66626cx;

/* renamed from: com.google.android.apps.gsa.nga.shared.f.c.j */
/* compiled from: PG */
public final class C81052j extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C81052j f222154f;

    /* renamed from: g */
    private static volatile C63010eb f222155g;

    /* renamed from: a */
    public int f222156a;

    /* renamed from: b */
    public C37360ay f222157b;

    /* renamed from: c */
    public boolean f222158c = true;

    /* renamed from: d */
    public long f222159d;

    /* renamed from: e */
    public int f222160e;

    static {
        C81052j jVar = new C81052j();
        f222154f = jVar;
        C62942bv.registerDefaultInstance(C81052j.class, jVar);
    }

    private C81052j() {
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
                return newMessageInfo(f222154f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဇ\u0002\u0004ဂ\u0003\u0006ဌ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C66626cx.m97269b()});
            case 3:
                return new C81052j();
            case 4:
                return new C81051i();
            case 5:
                return f222154f;
            case 6:
                C63010eb ebVar = f222155g;
                if (ebVar == null) {
                    synchronized (C81052j.class) {
                        ebVar = f222155g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222154f);
                            f222155g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
