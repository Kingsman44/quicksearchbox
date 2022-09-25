package com.google.android.p10712d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.gl */
/* compiled from: PG */
public final class C142468gl extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C142468gl f386620l;

    /* renamed from: m */
    private static volatile C63010eb f386621m;

    /* renamed from: a */
    public int f386622a;

    /* renamed from: b */
    public int f386623b;

    /* renamed from: c */
    public String f386624c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f386625d;

    /* renamed from: e */
    public int f386626e;

    /* renamed from: f */
    public String f386627f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f386628g;

    /* renamed from: h */
    public String f386629h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f386630i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f386631j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public String f386632k = BuildConfig.FLAVOR;

    static {
        C142468gl glVar = new C142468gl();
        f386620l = glVar;
        C62942bv.registerDefaultInstance(C142468gl.class, glVar);
    }

    private C142468gl() {
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
                return newMessageInfo(f386620l, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003\u0005ဈ\u0004\u0007ဌ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဈ\n", new Object[]{"a", "b", C142467gk.m231090b(), C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C142465gi.m231088b(), C19618h.f54585a, "i", "j", C19621k.f54601a});
            case 3:
                return new C142468gl();
            case 4:
                return new C142463gg();
            case 5:
                return f386620l;
            case 6:
                C63010eb ebVar = f386621m;
                if (ebVar == null) {
                    synchronized (C142468gl.class) {
                        ebVar = f386621m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386620l);
                            f386621m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
