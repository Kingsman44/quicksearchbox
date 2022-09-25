package com.google.protos.p5146w.p5149b.p5157c;

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

/* renamed from: com.google.protos.w.b.c.l */
/* compiled from: PG */
public final class C65962l extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C65962l f179417l;

    /* renamed from: m */
    private static volatile C63010eb f179418m;

    /* renamed from: a */
    public int f179419a;

    /* renamed from: b */
    public String f179420b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f179421c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f179422d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public long f179423e;

    /* renamed from: f */
    public long f179424f;

    /* renamed from: g */
    public String f179425g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f179426h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public long f179427i;

    /* renamed from: j */
    public long f179428j;

    /* renamed from: k */
    public boolean f179429k;

    static {
        C65962l lVar = new C65962l();
        f179417l = lVar;
        C62942bv.registerDefaultInstance(C65962l.class, lVar);
    }

    private C65962l() {
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
                return newMessageInfo(f179417l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\tဂ\b\nဇ\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a});
            case 3:
                return new C65962l();
            case 4:
                return new C65961k();
            case 5:
                return f179417l;
            case 6:
                C63010eb ebVar = f179418m;
                if (ebVar == null) {
                    synchronized (C65962l.class) {
                        ebVar = f179418m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179417l);
                            f179418m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
