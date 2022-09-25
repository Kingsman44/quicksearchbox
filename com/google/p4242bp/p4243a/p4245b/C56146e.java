package com.google.p4242bp.p4243a.p4245b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p10983ae.p10984a.C147476u;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52431rm;
import com.google.knowledge.p4671b.C61818k;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p4152bb.p4153a.C55421x;
import com.google.p4242bp.p4243a.C56141b;
import com.google.p440an.C8844b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4958bd.C64438d;
import com.google.research.xeno.effect.C66412o;
import com.google.speech.grammar.pumpkin.C66525q;

/* renamed from: com.google.bp.a.b.e */
/* compiled from: PG */
public final class C56146e extends C62942bv implements C63001dt {

    /* renamed from: v */
    public static final C56146e f149581v;

    /* renamed from: y */
    private static volatile C63010eb f149582y;

    /* renamed from: a */
    public int f149583a;

    /* renamed from: b */
    public String f149584b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f149585c;

    /* renamed from: d */
    public String f149586d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f149587e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f149588f;

    /* renamed from: g */
    public String f149589g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C61818k f149590h;

    /* renamed from: i */
    public C62971cq f149591i = emptyProtobufList();

    /* renamed from: j */
    public int f149592j;

    /* renamed from: k */
    public boolean f149593k;

    /* renamed from: l */
    public String f149594l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public C62961ch f149595m = emptyIntList();

    /* renamed from: n */
    public C62971cq f149596n = C62942bv.emptyProtobufList();

    /* renamed from: o */
    public C62961ch f149597o = emptyIntList();

    /* renamed from: p */
    public String f149598p = BuildConfig.FLAVOR;

    /* renamed from: q */
    public String f149599q = BuildConfig.FLAVOR;

    /* renamed from: r */
    public int f149600r;

    /* renamed from: s */
    public boolean f149601s;

    /* renamed from: t */
    public int f149602t;

    /* renamed from: u */
    public boolean f149603u;

    /* renamed from: w */
    private C56141b f149604w;

    /* renamed from: x */
    private byte f149605x = 2;

    static {
        C56146e eVar = new C56146e();
        f149581v = eVar;
        C62942bv.registerDefaultInstance(C56146e.class, eVar);
    }

    private C56146e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f149605x);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f149605x = b;
                return null;
            case 2:
                return newMessageInfo(f149581v, "\u0001\u0015\u0000\u0001\u0001\u001d\u0015\u0000\u0004\u0003\u0001ဈ\u0000\u0002ဌ\u0001\u0006Л\u0007ဈ\u0005\bဈ\u0006\nဌ\b\rဈ\n\u000eᐉ\u000b\u000fᐉ\f\u0011င\u000e\u0012ဇ\u000f\u0013ဈ\u0010\u0014\u001e\u0015\u001a\u0016\u0016\u0018ဈ\u0011\u0019ဈ\u0012\u001aဌ\u0013\u001bဇ\u0014\u001cဌ\u0015\u001dဇ\u0016", new Object[]{"a", "b", C45240c.f118157a, C8844b.m23486b(), "i", C66525q.class, "d", "e", C10662f.f35572a, C64438d.m96406b(), C30325g.f82003a, C19618h.f54585a, "w", "j", C19621k.f54601a, "l", "m", C55421x.m87687b(), C48004n.f124238a, C66412o.f180592a, "p", "q", C33259r.f88929b, C52431rm.m86629c(), C59002s.f156871a, C42181t.f110467a, C56145d.f149580a, C147476u.f398081a});
            case 3:
                return new C56146e();
            case 4:
                return new C56144c();
            case 5:
                return f149581v;
            case 6:
                C63010eb ebVar = f149582y;
                if (ebVar == null) {
                    synchronized (C56146e.class) {
                        ebVar = f149582y;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149581v);
                            f149582y = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
