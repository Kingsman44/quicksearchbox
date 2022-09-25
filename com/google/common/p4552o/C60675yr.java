package com.google.common.p4552o;

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
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.common.o.yr */
/* compiled from: PG */
public final class C60675yr extends C62942bv implements C63001dt {

    /* renamed from: v */
    public static final C60675yr f164595v;

    /* renamed from: w */
    private static volatile C63010eb f164596w;

    /* renamed from: a */
    public int f164597a;

    /* renamed from: b */
    public long f164598b;

    /* renamed from: c */
    public long f164599c;

    /* renamed from: d */
    public long f164600d;

    /* renamed from: e */
    public long f164601e;

    /* renamed from: f */
    public long f164602f;

    /* renamed from: g */
    public long f164603g;

    /* renamed from: h */
    public long f164604h;

    /* renamed from: i */
    public long f164605i;

    /* renamed from: j */
    public long f164606j;

    /* renamed from: k */
    public long f164607k;

    /* renamed from: l */
    public C62971cq f164608l = emptyProtobufList();

    /* renamed from: m */
    public long f164609m;

    /* renamed from: n */
    public C60683yz f164610n;

    /* renamed from: o */
    public C60686zb f164611o;

    /* renamed from: p */
    public C60679yv f164612p;

    /* renamed from: q */
    public String f164613q = BuildConfig.FLAVOR;

    /* renamed from: r */
    public int f164614r;

    /* renamed from: s */
    public C60681yx f164615s;

    /* renamed from: t */
    public C60677yt f164616t;

    /* renamed from: u */
    public double f164617u;

    static {
        C60675yr yrVar = new C60675yr();
        f164595v = yrVar;
        C62942bv.registerDefaultInstance(C60675yr.class, yrVar);
    }

    private C60675yr() {
    }

    /* renamed from: a */
    public final void mo57120a() {
        C62971cq cqVar = this.f164608l;
        if (!cqVar.mo58948c()) {
            this.f164608l = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f164595v, "\u0001\u0014\u0000\u0001\u0001\u0016\u0014\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b\u001b\fဂ\n\rဉ\u000b\u000eဉ\f\u000fဉ\r\u0011ဈ\u000f\u0012ဌ\u0010\u0013ဉ\u0011\u0014ဉ\u0012\u0016က\u0013", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", C60672yo.class, "m", C48004n.f124238a, C66412o.f180592a, "p", "q", C33259r.f88929b, C60674yq.f164594a, C59002s.f156871a, C42181t.f110467a, C147476u.f398081a});
            case 3:
                return new C60675yr();
            case 4:
                return new C60673yp();
            case 5:
                return f164595v;
            case 6:
                C63010eb ebVar = f164596w;
                if (ebVar == null) {
                    synchronized (C60675yr.class) {
                        ebVar = f164596w;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164595v);
                            f164596w = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
