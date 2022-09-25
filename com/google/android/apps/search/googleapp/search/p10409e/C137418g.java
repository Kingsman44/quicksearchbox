package com.google.android.apps.search.googleapp.search.p10409e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;
import p5535j.p5536a.p5545c.p5548c.p5550b.C71142b;

/* renamed from: com.google.android.apps.search.googleapp.search.e.g */
/* compiled from: PG */
public final class C137418g extends C62942bv implements C63001dt {

    /* renamed from: r */
    public static final C137418g f373767r;

    /* renamed from: t */
    private static volatile C63010eb f373768t;

    /* renamed from: a */
    public int f373769a;

    /* renamed from: b */
    public String f373770b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f373771c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public long f373772d;

    /* renamed from: e */
    public C62995dn f373773e = C62995dn.f170057a;

    /* renamed from: f */
    public int f373774f;

    /* renamed from: g */
    public String f373775g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public boolean f373776h;

    /* renamed from: i */
    public boolean f373777i = true;

    /* renamed from: j */
    public String f373778j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public int f373779k;

    /* renamed from: l */
    public C71142b f373780l;

    /* renamed from: m */
    public String f373781m = BuildConfig.FLAVOR;

    /* renamed from: n */
    public long f373782n;

    /* renamed from: o */
    public String f373783o = BuildConfig.FLAVOR;

    /* renamed from: p */
    public boolean f373784p;

    /* renamed from: q */
    public C137421j f373785q;

    /* renamed from: s */
    private byte f373786s = 2;

    static {
        C137418g gVar = new C137418g();
        f373767r = gVar;
        C62942bv.registerDefaultInstance(C137418g.class, gVar);
    }

    private C137418g() {
    }

    /* renamed from: a */
    public final C62995dn mo113715a() {
        C62995dn dnVar = this.f373773e;
        if (!dnVar.f170058b) {
            this.f373773e = dnVar.mo58980a();
        }
        return this.f373773e;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f373786s);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f373786s = b;
                return null;
            case 2:
                return newMessageInfo(f373767r, "\u0001\u0010\u0000\u0001\u0001\u0011\u0010\u0001\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u00042\u0005ဌ\u0003\u0006ဈ\u0004\u0007ဇ\u0005\tဇ\u0007\nဈ\b\u000bဌ\t\fᐉ\n\rဈ\u000b\u000eဂ\f\u000fဈ\r\u0010ဇ\u000e\u0011ဉ\u000f", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C137417f.f373766a, C10662f.f35572a, C137414c.f373765a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, C137412a.f373764a, "l", "m", C48004n.f124238a, C66412o.f180592a, "p", "q"});
            case 3:
                return new C137418g();
            case 4:
                return new C137416e();
            case 5:
                return f373767r;
            case 6:
                C63010eb ebVar = f373768t;
                if (ebVar == null) {
                    synchronized (C137418g.class) {
                        ebVar = f373768t;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f373767r);
                            f373768t = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
