package com.google.android.apps.search.googleapp.urlhandler;

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

/* renamed from: com.google.android.apps.search.googleapp.urlhandler.j */
/* compiled from: PG */
public final class C139823j extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C139823j f380066m;

    /* renamed from: n */
    private static volatile C63010eb f380067n;

    /* renamed from: a */
    public int f380068a;

    /* renamed from: b */
    public int f380069b;

    /* renamed from: c */
    public long f380070c;

    /* renamed from: d */
    public long f380071d;

    /* renamed from: e */
    public String f380072e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f380073f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f380074g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f380075h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public boolean f380076i;

    /* renamed from: j */
    public String f380077j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public boolean f380078k;

    /* renamed from: l */
    public boolean f380079l;

    static {
        C139823j jVar = new C139823j();
        f380066m = jVar;
        C62942bv.registerDefaultInstance(C139823j.class, jVar);
    }

    private C139823j() {
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
                return newMessageInfo(f380066m, "\u0001\u000b\u0000\u0001\u0002\f\u000b\u0000\u0000\u0000\u0002ဌ\u0000\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0006\u0007ဂ\u0001\bဇ\u0007\tဈ\u0005\nဈ\b\u000bဇ\t\fဇ\n", new Object[]{"a", "b", C139851q.m227397b(), "d", "e", C10662f.f35572a, C19618h.f54585a, C45240c.f118157a, "i", C30325g.f82003a, "j", C19621k.f54601a, "l"});
            case 3:
                return new C139823j();
            case 4:
                return new C139798i();
            case 5:
                return f380066m;
            case 6:
                C63010eb ebVar = f380067n;
                if (ebVar == null) {
                    synchronized (C139823j.class) {
                        ebVar = f380067n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f380066m);
                            f380067n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
