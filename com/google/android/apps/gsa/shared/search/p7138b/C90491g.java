package com.google.android.apps.gsa.shared.search.p7138b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p10983ae.p10984a.C147476u;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p4152bb.p4153a.C55349pb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.apps.gsa.shared.search.b.g */
/* compiled from: PG */
public final class C90491g extends C62942bv implements C63001dt {

    /* renamed from: B */
    private static volatile C63010eb f252883B;

    /* renamed from: z */
    public static final C90491g f252884z;

    /* renamed from: A */
    private byte f252885A = 2;

    /* renamed from: a */
    public int f252886a;

    /* renamed from: b */
    public C63088z f252887b = C63088z.f170246b;

    /* renamed from: c */
    public String f252888c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f252889d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f252890e;

    /* renamed from: f */
    public boolean f252891f = true;

    /* renamed from: g */
    public String f252892g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public boolean f252893h;

    /* renamed from: i */
    public String f252894i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f252895j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public String f252896k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public String f252897l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public String f252898m = BuildConfig.FLAVOR;

    /* renamed from: n */
    public String f252899n = BuildConfig.FLAVOR;

    /* renamed from: o */
    public int f252900o;

    /* renamed from: p */
    public C55349pb f252901p;

    /* renamed from: q */
    public boolean f252902q;

    /* renamed from: r */
    public String f252903r = BuildConfig.FLAVOR;

    /* renamed from: s */
    public boolean f252904s;

    /* renamed from: t */
    public boolean f252905t;

    /* renamed from: u */
    public String f252906u = BuildConfig.FLAVOR;

    /* renamed from: v */
    public boolean f252907v;

    /* renamed from: w */
    public C90486b f252908w;

    /* renamed from: x */
    public String f252909x = BuildConfig.FLAVOR;

    /* renamed from: y */
    public C62995dn f252910y = C62995dn.f170057a;

    static {
        C90491g gVar = new C90491g();
        f252884z = gVar;
        C62942bv.registerDefaultInstance(C90491g.class, gVar);
    }

    private C90491g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f252885A);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f252885A = b;
                return null;
            case 2:
                return newMessageInfo(f252884z, "\u0001\u0018\u0000\u0001\u0001\u0019\u0018\u0001\u0000\u0002\u0001ည\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0006ဇ\u0005\u0007ဈ\u0006\bဇ\u0007\tဈ\b\nဈ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fင\u000e\u0010ᐉ\u000f\u0011ဇ\u0010\u0012ဈ\u0011\u0013ဇ\u0012\u0014ဇ\u0013\u0015ဈ\u0014\u0016ဇ\u0015\u0017ᐉ\u0016\u0018ဈ\u0017\u00192", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a, "p", "q", C33259r.f88929b, C59002s.f156871a, C42181t.f110467a, C147476u.f398081a, "v", "w", "x", "y", C90490f.f252882a});
            case 3:
                return new C90491g();
            case 4:
                return new C90489e();
            case 5:
                return f252884z;
            case 6:
                C63010eb ebVar = f252883B;
                if (ebVar == null) {
                    synchronized (C90491g.class) {
                        ebVar = f252883B;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f252884z);
                            f252883B = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
