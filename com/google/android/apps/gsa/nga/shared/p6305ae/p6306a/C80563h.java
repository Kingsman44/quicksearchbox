package com.google.android.apps.gsa.nga.shared.p6305ae.p6306a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6288j.C80471b;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.apps.gsa.nga.shared.ae.a.h */
/* compiled from: PG */
public final class C80563h extends C62942bv implements C63001dt {

    /* renamed from: r */
    public static final C80563h f221128r;

    /* renamed from: s */
    private static volatile C63010eb f221129s;

    /* renamed from: a */
    public int f221130a;

    /* renamed from: b */
    public String f221131b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f221132c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f221133d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f221134e;

    /* renamed from: f */
    public int f221135f;

    /* renamed from: g */
    public int f221136g;

    /* renamed from: h */
    public int f221137h;

    /* renamed from: i */
    public int f221138i;

    /* renamed from: j */
    public int f221139j;

    /* renamed from: k */
    public int f221140k;

    /* renamed from: l */
    public int f221141l;

    /* renamed from: m */
    public int f221142m;

    /* renamed from: n */
    public float f221143n;

    /* renamed from: o */
    public float f221144o;

    /* renamed from: p */
    public boolean f221145p;

    /* renamed from: q */
    public boolean f221146q;

    static {
        C80563h hVar = new C80563h();
        f221128r = hVar;
        C62942bv.registerDefaultInstance(C80563h.class, hVar);
    }

    private C80563h() {
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
                return newMessageInfo(f221128r, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bင\n\fင\u000b\rခ\f\u000eခ\r\u000fဇ\u000e\u0010ဇ\u000f", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C80471b.m128171b(), C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a, "p", "q"});
            case 3:
                return new C80563h();
            case 4:
                return new C80562g();
            case 5:
                return f221128r;
            case 6:
                C63010eb ebVar = f221129s;
                if (ebVar == null) {
                    synchronized (C80563h.class) {
                        ebVar = f221129s;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221128r);
                            f221129s = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
