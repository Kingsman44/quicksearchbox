package com.google.android.apps.auto.p450a.p452b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.auto.a.b.j */
/* compiled from: PG */
public final class C8944j extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C8944j f30994f;

    /* renamed from: h */
    private static volatile C63010eb f30995h;

    /* renamed from: a */
    public String f30996a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f30997b;

    /* renamed from: c */
    public int f30998c;

    /* renamed from: d */
    public int f30999d;

    /* renamed from: e */
    public C63042fg f31000e;

    /* renamed from: g */
    private int f31001g;

    static {
        C8944j jVar = new C8944j();
        f30994f = jVar;
        C62942bv.registerDefaultInstance(C8944j.class, jVar);
    }

    private C8944j() {
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
                return newMessageInfo(f30994f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003\u0005ဉ\u0004", new Object[]{C30325g.f82003a, "a", "b", C8942h.f30993a, C45240c.f118157a, "d", "e"});
            case 3:
                return new C8944j();
            case 4:
                return new C8941g();
            case 5:
                return f30994f;
            case 6:
                C63010eb ebVar = f30995h;
                if (ebVar == null) {
                    synchronized (C8944j.class) {
                        ebVar = f30995h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30994f);
                            f30995h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
