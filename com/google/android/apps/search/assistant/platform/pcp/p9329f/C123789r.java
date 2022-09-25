package com.google.android.apps.search.assistant.platform.pcp.p9329f;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3803ag.p3804a.p3806b.C48833n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.r */
/* compiled from: PG */
public final class C123789r extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C123789r f341963n;

    /* renamed from: o */
    private static volatile C63010eb f341964o;

    /* renamed from: a */
    public int f341965a;

    /* renamed from: b */
    public String f341966b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f341967c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public long f341968d;

    /* renamed from: e */
    public C48833n f341969e;

    /* renamed from: f */
    public double f341970f;

    /* renamed from: g */
    public double f341971g;

    /* renamed from: h */
    public boolean f341972h;

    /* renamed from: i */
    public String f341973i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f341974j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public String f341975k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public String f341976l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public String f341977m = BuildConfig.FLAVOR;

    static {
        C123789r rVar = new C123789r();
        f341963n = rVar;
        C62942bv.registerDefaultInstance(C123789r.class, rVar);
    }

    private C123789r() {
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
                return newMessageInfo(f341963n, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဂ\u0002\u0005ဉ\u0003\u0006က\u0004\u0007က\u0005\bဇ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fဈ\n\rဈ\u000b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m"});
            case 3:
                return new C123789r();
            case 4:
                return new C123788q();
            case 5:
                return f341963n;
            case 6:
                C63010eb ebVar = f341964o;
                if (ebVar == null) {
                    synchronized (C123789r.class) {
                        ebVar = f341964o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341963n);
                            f341964o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
