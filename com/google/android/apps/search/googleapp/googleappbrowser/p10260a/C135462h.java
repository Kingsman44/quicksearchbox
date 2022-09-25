package com.google.android.apps.search.googleapp.googleappbrowser.p10260a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.urlhandler.p10529b.p10530a.C139789b;
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

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.a.h */
/* compiled from: PG */
public final class C135462h extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C135462h f369059n;

    /* renamed from: o */
    private static volatile C63010eb f369060o;

    /* renamed from: a */
    public int f369061a;

    /* renamed from: b */
    public String f369062b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f369063c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f369064d;

    /* renamed from: e */
    public String f369065e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C139789b f369066f;

    /* renamed from: g */
    public boolean f369067g;

    /* renamed from: h */
    public String f369068h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public boolean f369069i;

    /* renamed from: j */
    public boolean f369070j;

    /* renamed from: k */
    public boolean f369071k = true;

    /* renamed from: l */
    public boolean f369072l;

    /* renamed from: m */
    public boolean f369073m;

    static {
        C135462h hVar = new C135462h();
        f369059n = hVar;
        C62942bv.registerDefaultInstance(C135462h.class, hVar);
    }

    private C135462h() {
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
                return newMessageInfo(f369059n, "\u0001\f\u0000\u0001\u0001\u000f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0001\u0004ဌ\u0002\u0005ဈ\u0003\u0006ဉ\u0004\u0007ဇ\u0005\bဈ\u0006\tဇ\u0007\fဇ\b\rဇ\t\u000eဇ\n\u000fဇ\u000b", new Object[]{"a", "b", C45240c.f118157a, "d", C135461g.m219651b(), "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m"});
            case 3:
                return new C135462h();
            case 4:
                return new C135459e();
            case 5:
                return f369059n;
            case 6:
                C63010eb ebVar = f369060o;
                if (ebVar == null) {
                    synchronized (C135462h.class) {
                        ebVar = f369060o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f369059n);
                            f369060o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
