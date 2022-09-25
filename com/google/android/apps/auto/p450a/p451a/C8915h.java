package com.google.android.apps.auto.p450a.p451a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.auto.a.a.h */
/* compiled from: PG */
public final class C8915h extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C8915h f30929i;

    /* renamed from: k */
    private static volatile C63010eb f30930k;

    /* renamed from: a */
    public int f30931a = 0;

    /* renamed from: b */
    public Object f30932b;

    /* renamed from: c */
    public int f30933c;

    /* renamed from: d */
    public int f30934d;

    /* renamed from: e */
    public String f30935e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f30936f;

    /* renamed from: g */
    public C63042fg f30937g;

    /* renamed from: h */
    public String f30938h = BuildConfig.FLAVOR;

    /* renamed from: j */
    private int f30939j;

    static {
        C8915h hVar = new C8915h();
        f30929i = hVar;
        C62942bv.registerDefaultInstance(C8915h.class, hVar);
    }

    private C8915h() {
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
                return newMessageInfo(f30929i, "\u0001\u000b\u0001\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဉ\u0004\u0006ဈ\u0005\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\u000bြ\u0000", new Object[]{"b", "a", "j", C45240c.f118157a, C8918k.f30941a, "d", C8916i.f30940a, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C8913f.class, C8923p.class, C8927t.class, C8921n.class, C8925r.class});
            case 3:
                return new C8915h();
            case 4:
                return new C8914g();
            case 5:
                return f30929i;
            case 6:
                C63010eb ebVar = f30930k;
                if (ebVar == null) {
                    synchronized (C8915h.class) {
                        ebVar = f30930k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30929i);
                            f30930k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
