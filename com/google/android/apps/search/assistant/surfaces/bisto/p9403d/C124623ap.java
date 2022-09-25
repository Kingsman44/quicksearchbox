package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

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
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.ap */
/* compiled from: PG */
public final class C124623ap extends C62942bv implements C63001dt {

    /* renamed from: w */
    public static final C124623ap f343769w;

    /* renamed from: x */
    private static volatile C63010eb f343770x;

    /* renamed from: a */
    public int f343771a;

    /* renamed from: b */
    public int f343772b;

    /* renamed from: c */
    public int f343773c;

    /* renamed from: d */
    public long f343774d;

    /* renamed from: e */
    public int f343775e;

    /* renamed from: f */
    public C124629av f343776f;

    /* renamed from: g */
    public int f343777g;

    /* renamed from: h */
    public C124717o f343778h;

    /* renamed from: i */
    public C62995dn f343779i = C62995dn.f170057a;

    /* renamed from: j */
    public long f343780j;

    /* renamed from: k */
    public boolean f343781k;

    /* renamed from: l */
    public long f343782l;

    /* renamed from: m */
    public int f343783m;

    /* renamed from: n */
    public int f343784n;

    /* renamed from: o */
    public long f343785o;

    /* renamed from: p */
    public boolean f343786p;

    /* renamed from: q */
    public boolean f343787q;

    /* renamed from: r */
    public boolean f343788r;

    /* renamed from: s */
    public String f343789s = BuildConfig.FLAVOR;

    /* renamed from: t */
    public C62995dn f343790t = C62995dn.f170057a;

    /* renamed from: u */
    public boolean f343791u;

    /* renamed from: v */
    public boolean f343792v;

    static {
        C124623ap apVar = new C124623ap();
        f343769w = apVar;
        C62942bv.registerDefaultInstance(C124623ap.class, apVar);
    }

    private C124623ap() {
    }

    /* renamed from: a */
    public final C62995dn mo106562a() {
        C62995dn dnVar = this.f343779i;
        if (!dnVar.f170058b) {
            this.f343779i = dnVar.mo58980a();
        }
        return this.f343779i;
    }

    /* renamed from: b */
    public final boolean mo106563b(String str) {
        str.getClass();
        return this.f343790t.containsKey(str);
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
                return newMessageInfo(f343769w, "\u0001\u0015\u0000\u0001\u0001!\u0015\u0002\u0000\u0000\u0001ဌ\u0000\u0003င\u0001\u0004ဂ\u0002\u0007ဌ\u0003\bဉ\u0004\u000bင\u0005\rဉ\u0006\u000f2\u0010ဂ\b\u0011ဇ\t\u0012ဂ\n\u0014ဌ\u000b\u0015င\f\u0016ဂ\r\u0017ဇ\u000e\u0019ဇ\u000f\u001cဇ\u0010\u001dဈ\u0011\u001e2\u001fဇ\u0012!ဇ\u0013", new Object[]{"a", "b", C124633az.m204300b(), C45240c.f118157a, "d", "e", C124724v.f344117a, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", C124622ao.f343768a, "j", C19621k.f54601a, "l", "m", C124615ah.m204286b(), C48004n.f124238a, C66412o.f180592a, "p", "q", C33259r.f88929b, C59002s.f156871a, C42181t.f110467a, C124618ak.f343760a, C147476u.f398081a, "v"});
            case 3:
                return new C124623ap();
            case 4:
                return new C124621an();
            case 5:
                return f343769w;
            case 6:
                C63010eb ebVar = f343770x;
                if (ebVar == null) {
                    synchronized (C124623ap.class) {
                        ebVar = f343770x;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f343769w);
                            f343770x = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
