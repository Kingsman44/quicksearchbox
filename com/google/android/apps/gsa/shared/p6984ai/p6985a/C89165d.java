package com.google.android.apps.gsa.shared.p6984ai.p6985a;

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

/* renamed from: com.google.android.apps.gsa.shared.ai.a.d */
/* compiled from: PG */
public final class C89165d extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C89165d f241737n;

    /* renamed from: o */
    private static volatile C63010eb f241738o;

    /* renamed from: a */
    public int f241739a;

    /* renamed from: b */
    public boolean f241740b;

    /* renamed from: c */
    public String f241741c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f241742d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f241743e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f241744f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C89173l f241745g;

    /* renamed from: h */
    public String f241746h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f241747i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f241748j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public String f241749k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public boolean f241750l;

    /* renamed from: m */
    public int f241751m;

    static {
        C89165d dVar = new C89165d();
        f241737n = dVar;
        C62942bv.registerDefaultInstance(C89165d.class, dVar);
    }

    private C89165d() {
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
                return newMessageInfo(f241737n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဉ\u0005\u0004ဇ\n\u0005ဌ\u000b\u0006ဈ\u0002\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဈ\u0003\fဈ\u0004", new Object[]{"a", "b", C45240c.f118157a, C30325g.f82003a, "l", "m", C89164c.m145044b(), "d", C19618h.f54585a, "i", "j", C19621k.f54601a, "e", C10662f.f35572a});
            case 3:
                return new C89165d();
            case 4:
                return new C89162a();
            case 5:
                return f241737n;
            case 6:
                C63010eb ebVar = f241738o;
                if (ebVar == null) {
                    synchronized (C89165d.class) {
                        ebVar = f241738o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f241737n);
                            f241738o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
