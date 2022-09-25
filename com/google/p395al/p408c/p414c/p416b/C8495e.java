package com.google.p395al.p408c.p414c.p416b;

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
import com.google.p395al.p417d.C8600b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.al.c.c.b.e */
/* compiled from: PG */
public final class C8495e extends C62942bv implements C63001dt {

    /* renamed from: v */
    public static final C8495e f29464v;

    /* renamed from: x */
    private static volatile C63010eb f29465x;

    /* renamed from: a */
    public int f29466a;

    /* renamed from: b */
    public String f29467b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f29468c = 1;

    /* renamed from: d */
    public String f29469d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f29470e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f29471f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f29472g = -1;

    /* renamed from: h */
    public C62971cq f29473h = emptyProtobufList();

    /* renamed from: i */
    public String f29474i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f29475j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public C62971cq f29476k = emptyProtobufList();

    /* renamed from: l */
    public boolean f29477l;

    /* renamed from: m */
    public C62971cq f29478m = C62942bv.emptyProtobufList();

    /* renamed from: n */
    public String f29479n = BuildConfig.FLAVOR;

    /* renamed from: o */
    public int f29480o;

    /* renamed from: p */
    public int f29481p;

    /* renamed from: q */
    public String f29482q = BuildConfig.FLAVOR;

    /* renamed from: r */
    public String f29483r = BuildConfig.FLAVOR;

    /* renamed from: s */
    public String f29484s = BuildConfig.FLAVOR;

    /* renamed from: t */
    public String f29485t = BuildConfig.FLAVOR;

    /* renamed from: u */
    public boolean f29486u;

    /* renamed from: w */
    private byte f29487w = 2;

    static {
        C8495e eVar = new C8495e();
        f29464v = eVar;
        C62942bv.registerDefaultInstance(C8495e.class, eVar);
    }

    private C8495e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f29487w);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f29487w = b;
                return null;
            case 2:
                return newMessageInfo(f29464v, "\u0001\u0014\u0000\u0001\u0001\u001d\u0014\u0000\u0003\u0006\u0001ᔈ\u0000\u0002ᔈ\u0002\u0003ᔈ\u0003\u0004ᔈ\u0004\u0005Л\u0006ဈ\u0006\u0007ဈ\u0007\bЛ\u000bဇ\n\f\u001a\u000eဈ\f\u000fင\r\u0010င\u000e\u0012ဈ\u0010\u0013ဈ\u0011\u0014ဈ\u0012\u0015ဌ\u0005\u0016ဈ\u0013\u001aဇ\u0017\u001dဌ\u0001", new Object[]{"a", "b", "d", "e", C10662f.f35572a, C19618h.f54585a, C8497g.class, "i", "j", C19621k.f54601a, C8497g.class, "l", "m", C48004n.f124238a, C66412o.f180592a, "p", "q", C33259r.f88929b, C59002s.f156871a, C30325g.f82003a, C8600b.m23280b(), C42181t.f110467a, C147476u.f398081a, C45240c.f118157a, C8493c.f29463a});
            case 3:
                return new C8495e();
            case 4:
                return new C8484b();
            case 5:
                return f29464v;
            case 6:
                C63010eb ebVar = f29465x;
                if (ebVar == null) {
                    synchronized (C8495e.class) {
                        ebVar = f29465x;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29464v);
                            f29465x = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
