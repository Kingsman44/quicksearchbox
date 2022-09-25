package com.google.speech.p5218j;

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
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62960cg;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;
import com.google.speech.p5218j.p5220b.p5221a.C66802f;

/* renamed from: com.google.speech.j.hf */
/* compiled from: PG */
public final class C66997hf extends C62937bq implements C62938br {

    /* renamed from: C */
    private static volatile C63010eb f182098C;

    /* renamed from: z */
    public static final C66997hf f182099z;

    /* renamed from: A */
    private C66990gz f182100A;

    /* renamed from: B */
    private byte f182101B = 2;

    /* renamed from: a */
    public int f182102a;

    /* renamed from: b */
    public int f182103b;

    /* renamed from: c */
    public int f182104c;

    /* renamed from: d */
    public int f182105d = 250;

    /* renamed from: e */
    public boolean f182106e;

    /* renamed from: f */
    public C66802f f182107f;

    /* renamed from: g */
    public C67135mi f182108g;

    /* renamed from: h */
    public C67133mg f182109h;

    /* renamed from: i */
    public boolean f182110i = true;

    /* renamed from: j */
    public boolean f182111j;

    /* renamed from: k */
    public boolean f182112k;

    /* renamed from: l */
    public C62960cg f182113l = emptyFloatList();

    /* renamed from: m */
    public C62960cg f182114m = emptyFloatList();

    /* renamed from: n */
    public String f182115n = BuildConfig.FLAVOR;

    /* renamed from: o */
    public boolean f182116o;

    /* renamed from: p */
    public boolean f182117p;

    /* renamed from: q */
    public boolean f182118q = true;

    /* renamed from: r */
    public int f182119r;

    /* renamed from: s */
    public boolean f182120s;

    /* renamed from: t */
    public int f182121t;

    /* renamed from: u */
    public boolean f182122u;

    /* renamed from: v */
    public C66971gg f182123v;

    /* renamed from: w */
    public String f182124w = BuildConfig.FLAVOR;

    /* renamed from: x */
    public boolean f182125x;

    /* renamed from: y */
    public boolean f182126y;

    static {
        C66997hf hfVar = new C66997hf();
        f182099z = hfVar;
        C62942bv.registerDefaultInstance(C66997hf.class, hfVar);
    }

    private C66997hf() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f182101B);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f182101B = b;
                return null;
            case 2:
                return newMessageInfo(f182099z, "\u0001\u0018\u0000\u0002\u0001ϧ\u0018\u0000\u0002\u0001\u0001ဌ\u0000\u0006င\u0005\u0007ဉ\u0007\tဉ\b\nဇ\n\u000bဇ\u000b\rဈ\u000f\u000fဇ\u0010\u0010ဇ\u0011\u0011ဇ\u0012\u0012ဌ\u0014\u0014ဇ\u0018\u0016ᐉ\u001e\u0017ဉ\t\u0018ဈ\u001f\u0019ဇ \u001aဇ\u001a\u001bဉ\u0016\u001fဌ\u0019!ဇ\u0006$ဇ\r($)$ϧဇ%", new Object[]{"a", "b", C45240c.f118157a, C66992ha.f182092a, "d", C10662f.f35572a, C30325g.f82003a, "i", "j", C48004n.f124238a, C66412o.f180592a, "p", "q", C33259r.f88929b, C66964g.m97397b(), C59002s.f156871a, "v", C19618h.f54585a, "w", "x", C147476u.f398081a, "A", C42181t.f110467a, C66996he.m97405b(), "e", C19621k.f54601a, "l", "m", "y"});
            case 3:
                return new C66997hf();
            case 4:
                return new C66994hc();
            case 5:
                return f182099z;
            case 6:
                C63010eb ebVar = f182098C;
                if (ebVar == null) {
                    synchronized (C66997hf.class) {
                        ebVar = f182098C;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182099z);
                            f182098C = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
