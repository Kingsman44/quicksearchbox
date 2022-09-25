package com.google.android.apps.search.assistant.platform.pcp.p9329f;

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

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.h */
/* compiled from: PG */
public final class C123779h extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C123779h f341925m;

    /* renamed from: n */
    private static volatile C63010eb f341926n;

    /* renamed from: a */
    public int f341927a;

    /* renamed from: b */
    public String f341928b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f341929c;

    /* renamed from: d */
    public String f341930d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f341931e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f341932f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f341933g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f341934h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f341935i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f341936j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public double f341937k;

    /* renamed from: l */
    public double f341938l;

    static {
        C123779h hVar = new C123779h();
        f341925m = hVar;
        C62942bv.registerDefaultInstance(C123779h.class, hVar);
    }

    private C123779h() {
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
                return newMessageInfo(f341925m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nက\t\u000bက\n", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l"});
            case 3:
                return new C123779h();
            case 4:
                return new C123778g();
            case 5:
                return f341925m;
            case 6:
                C63010eb ebVar = f341926n;
                if (ebVar == null) {
                    synchronized (C123779h.class) {
                        ebVar = f341926n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341925m);
                            f341926n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
