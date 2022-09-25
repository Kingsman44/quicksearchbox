package com.google.android.apps.search.googleapp.discover.p10204p.p10209c;

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

/* renamed from: com.google.android.apps.search.googleapp.discover.p.c.p */
/* compiled from: PG */
public final class C134510p extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C134510p f366308k;

    /* renamed from: l */
    private static volatile C63010eb f366309l;

    /* renamed from: a */
    public int f366310a;

    /* renamed from: b */
    public int f366311b = 0;

    /* renamed from: c */
    public Object f366312c;

    /* renamed from: d */
    public String f366313d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f366314e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C134502h f366315f;

    /* renamed from: g */
    public String f366316g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f366317h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f366318i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public C134504j f366319j;

    static {
        C134510p pVar = new C134510p();
        f366308k = pVar;
        C62942bv.registerDefaultInstance(C134510p.class, pVar);
    }

    private C134510p() {
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
                return newMessageInfo(f366308k, "\u0001\b\u0001\u0001\u0001\n\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005\bြ\u0000\nဉ\u0007", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", C134506l.class, "j"});
            case 3:
                return new C134510p();
            case 4:
                return new C134509o();
            case 5:
                return f366308k;
            case 6:
                C63010eb ebVar = f366309l;
                if (ebVar == null) {
                    synchronized (C134510p.class) {
                        ebVar = f366309l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366308k);
                            f366309l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
