package com.google.android.libraries.gsa.p1880l;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p10983ae.p10984a.C147476u;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4570p.C60356al;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57590bg;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5146w.p5147a.p5148a.C65930h;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.libraries.gsa.l.d */
/* compiled from: PG */
public final class C22876d extends C62942bv implements C63001dt {

    /* renamed from: x */
    public static final C22876d f62944x;

    /* renamed from: z */
    private static volatile C63010eb f62945z;

    /* renamed from: a */
    public int f62946a;

    /* renamed from: b */
    public boolean f62947b;

    /* renamed from: c */
    public String f62948c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f62949d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C65930h f62950e;

    /* renamed from: f */
    public int f62951f;

    /* renamed from: g */
    public String f62952g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public int f62953h;

    /* renamed from: i */
    public int f62954i;

    /* renamed from: j */
    public boolean f62955j = true;

    /* renamed from: k */
    public String f62956k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public String f62957l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public String f62958m = BuildConfig.FLAVOR;

    /* renamed from: n */
    public C57590bg f62959n;

    /* renamed from: o */
    public String f62960o = BuildConfig.FLAVOR;

    /* renamed from: p */
    public String f62961p = BuildConfig.FLAVOR;

    /* renamed from: q */
    public boolean f62962q;

    /* renamed from: r */
    public C22880h f62963r;

    /* renamed from: s */
    public boolean f62964s;

    /* renamed from: t */
    public boolean f62965t;

    /* renamed from: u */
    public boolean f62966u;

    /* renamed from: v */
    public boolean f62967v;

    /* renamed from: w */
    public long f62968w;

    /* renamed from: y */
    private byte f62969y = 2;

    static {
        C22876d dVar = new C22876d();
        f62944x = dVar;
        C62942bv.registerDefaultInstance(C22876d.class, dVar);
    }

    private C22876d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f62969y);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f62969y = b;
                return null;
            case 2:
                return newMessageInfo(f62944x, "\u0001\u0016\u0000\u0001\u0001\u0019\u0016\u0000\u0000\u0003\u0001ဇ\u0000\u0002ဈ\u0001\u0003ᐉ\u0003\u0004ဌ\u0004\u0005ဈ\u000b\bဈ\u0007\tင\b\nဌ\t\u000bဇ\n\rဈ\u0002\u000eဈ\f\u000fဈ\r\u0010ᐉ\u0012\u0011ᐉ\u000e\u0012ဈ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဇ\u0013\u0016ဇ\u0014\u0017ဇ\u0015\u0018ဇ\u0016\u0019ဂ\u0017", new Object[]{"a", "b", C45240c.f118157a, "e", C10662f.f35572a, C22875c.m42746b(), C19621k.f54601a, C30325g.f82003a, C19618h.f54585a, "i", C60356al.f163359a, "j", "d", "l", "m", C33259r.f88929b, C48004n.f124238a, C66412o.f180592a, "p", "q", C59002s.f156871a, C42181t.f110467a, C147476u.f398081a, "v", "w"});
            case 3:
                return new C22876d();
            case 4:
                return new C22873a();
            case 5:
                return f62944x;
            case 6:
                C63010eb ebVar = f62945z;
                if (ebVar == null) {
                    synchronized (C22876d.class) {
                        ebVar = f62945z;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f62944x);
                            f62945z = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
