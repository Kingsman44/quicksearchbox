package com.google.android.apps.search.podcasts.p10585m.p10587b;

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
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.apps.search.podcasts.m.b.b */
/* compiled from: PG */
public final class C140646b extends C62942bv implements C63001dt {

    /* renamed from: r */
    public static final C140646b f381993r;

    /* renamed from: s */
    private static volatile C63010eb f381994s;

    /* renamed from: a */
    public String f381995a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f381996b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f381997c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f381998d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f381999e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f382000f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f382001g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f382002h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f382003i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public boolean f382004j;

    /* renamed from: k */
    public boolean f382005k;

    /* renamed from: l */
    public String f382006l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public boolean f382007m;

    /* renamed from: n */
    public boolean f382008n;

    /* renamed from: o */
    public boolean f382009o;

    /* renamed from: p */
    public int f382010p;

    /* renamed from: q */
    public C63042fg f382011q;

    static {
        C140646b bVar = new C140646b();
        f381993r = bVar;
        C62942bv.registerDefaultInstance(C140646b.class, bVar);
    }

    private C140646b() {
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
                return newMessageInfo(f381993r, "\u0000\u0011\u0000\u0000\u0002\u0012\u0011\u0000\u0000\u0000\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0007\tȈ\nȈ\u000bȈ\f\u0007\r\u0007\u000e\u0007\u000f\u0007\u0010Ȉ\u0011\f\u0012\t", new Object[]{"b", C45240c.f118157a, "d", "e", C10662f.f35572a, C19618h.f54585a, "m", "i", C30325g.f82003a, "a", "j", C48004n.f124238a, C66412o.f180592a, C19621k.f54601a, "l", "p", "q"});
            case 3:
                return new C140646b();
            case 4:
                return new C140645a();
            case 5:
                return f381993r;
            case 6:
                C63010eb ebVar = f381994s;
                if (ebVar == null) {
                    synchronized (C140646b.class) {
                        ebVar = f381994s;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f381993r);
                            f381994s = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
