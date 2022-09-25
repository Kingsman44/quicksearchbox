package com.google.assistant.p3861at;

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

/* renamed from: com.google.assistant.at.ahz */
/* compiled from: PG */
public final class ahz extends C62942bv implements C63001dt {

    /* renamed from: w */
    public static final ahz f129355w;

    /* renamed from: y */
    private static volatile C63010eb f129356y;

    /* renamed from: a */
    public int f129357a;

    /* renamed from: b */
    public String f129358b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f129359c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f129360d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f129361e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f129362f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C62971cq f129363g = C62942bv.emptyProtobufList();

    /* renamed from: h */
    public C62971cq f129364h;

    /* renamed from: i */
    public C50208oo f129365i;

    /* renamed from: j */
    public C50202oi f129366j;

    /* renamed from: k */
    public C50212os f129367k;

    /* renamed from: l */
    public ahl f129368l;

    /* renamed from: m */
    public C50212os f129369m;

    /* renamed from: n */
    public C50200og f129370n;

    /* renamed from: o */
    public ahj f129371o;

    /* renamed from: p */
    public C50204ok f129372p;

    /* renamed from: q */
    public String f129373q;

    /* renamed from: r */
    public C62971cq f129374r;

    /* renamed from: s */
    public ahq f129375s;

    /* renamed from: t */
    public C50214ou f129376t;

    /* renamed from: u */
    public boolean f129377u;

    /* renamed from: v */
    public ahu f129378v;

    /* renamed from: x */
    private byte f129379x = 2;

    static {
        ahz ahz = new ahz();
        f129355w = ahz;
        C62942bv.registerDefaultInstance(ahz.class, ahz);
    }

    private ahz() {
        C62942bv.emptyProtobufList();
        this.f129364h = emptyProtobufList();
        emptyProtobufList();
        this.f129373q = BuildConfig.FLAVOR;
        this.f129374r = C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f129379x);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f129379x = b;
                return null;
            case 2:
                return newMessageInfo(f129355w, "\u0001\u0015\u0000\u0001\u0001\u001b\u0015\u0000\u0003\u0001\u0001ဈ\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007\u001a\u000bဉ\b\fဉ\t\rဉ\n\u000eဉ\u000f\u000fဈ\u0010\u0010\u001a\u0011ဉ\u0011\u0012ဉ\r\u0014\u001b\u0016ဉ\u0013\u0017ဉ\u0015\u0018ဉ\f\u0019ᐉ\u000e\u001aဉ\u000b\u001bဇ\u0014", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, "i", "j", C19621k.f54601a, "p", "q", C33259r.f88929b, C59002s.f156871a, C48004n.f124238a, C19618h.f54585a, ahw.class, C42181t.f110467a, "v", "m", C66412o.f180592a, "l", C147476u.f398081a});
            case 3:
                return new ahz();
            case 4:
                return new ahm();
            case 5:
                return f129355w;
            case 6:
                C63010eb ebVar = f129356y;
                if (ebVar == null) {
                    synchronized (ahz.class) {
                        ebVar = f129356y;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129355w);
                            f129356y = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
