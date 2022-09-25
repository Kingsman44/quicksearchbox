package com.google.android.libraries.componentview.components.agsa.p1684a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.componentview.components.agsa.a.h */
/* compiled from: PG */
public final class C19849h extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C19849h f55497n;

    /* renamed from: o */
    public static final C62940bt f55498o;

    /* renamed from: p */
    private static volatile C63010eb f55499p;

    /* renamed from: a */
    public int f55500a;

    /* renamed from: b */
    public int f55501b;

    /* renamed from: c */
    public String f55502c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f55503d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f55504e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f55505f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f55506g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f55507h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f55508i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f55509j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public String f55510k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public String f55511l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public boolean f55512m;

    static {
        C19849h hVar = new C19849h();
        f55497n = hVar;
        C62942bv.registerDefaultInstance(C19849h.class, hVar);
        f55498o = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, hVar, hVar, (C62958ce) null, 122878598, C63066gd.MESSAGE, C19849h.class);
    }

    private C19849h() {
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
                return newMessageInfo(f55497n, "\u0001\f\u0000\u0001\u0001\u000f\f\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0006ဈ\u0003\u0007ဈ\u0004\bဈ\u0005\tဈ\u0006\nဈ\u0007\u000bဈ\b\fဈ\t\rဈ\n\u000fဇ\f", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m"});
            case 3:
                return new C19849h();
            case 4:
                return new C19848g();
            case 5:
                return f55497n;
            case 6:
                C63010eb ebVar = f55499p;
                if (ebVar == null) {
                    synchronized (C19849h.class) {
                        ebVar = f55499p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55497n);
                            f55499p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
