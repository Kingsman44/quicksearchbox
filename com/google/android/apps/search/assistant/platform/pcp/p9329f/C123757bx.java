package com.google.android.apps.search.assistant.platform.pcp.p9329f;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3717aq.p3718a.p3719a.C47876j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.bx */
/* compiled from: PG */
public final class C123757bx extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C123757bx f341854l;

    /* renamed from: m */
    private static volatile C63010eb f341855m;

    /* renamed from: a */
    public int f341856a;

    /* renamed from: b */
    public String f341857b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f341858c;

    /* renamed from: d */
    public String f341859d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f341860e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f341861f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f341862g;

    /* renamed from: h */
    public long f341863h;

    /* renamed from: i */
    public String f341864i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f341865j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public long f341866k;

    static {
        C123757bx bxVar = new C123757bx();
        f341854l = bxVar;
        C62942bv.registerDefaultInstance(C123757bx.class, bxVar);
    }

    private C123757bx() {
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
                return newMessageInfo(f341854l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဌ\u0005\u0007ဂ\u0006\bဈ\u0007\tဈ\b\nဂ\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C47876j.f123954a, C19618h.f54585a, "i", "j", C19621k.f54601a});
            case 3:
                return new C123757bx();
            case 4:
                return new C123756bw();
            case 5:
                return f341854l;
            case 6:
                C63010eb ebVar = f341855m;
                if (ebVar == null) {
                    synchronized (C123757bx.class) {
                        ebVar = f341855m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341854l);
                            f341855m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
