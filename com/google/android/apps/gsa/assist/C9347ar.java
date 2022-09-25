package com.google.android.apps.gsa.assist;

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
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.apps.gsa.assist.ar */
/* compiled from: PG */
public final class C9347ar extends C62937bq implements C62938br {

    /* renamed from: A */
    public static final C9347ar f32439A;

    /* renamed from: C */
    private static volatile C63010eb f32440C;

    /* renamed from: B */
    private byte f32441B = 2;

    /* renamed from: a */
    public int f32442a;

    /* renamed from: b */
    public C62971cq f32443b = emptyProtobufList();

    /* renamed from: c */
    public int f32444c;

    /* renamed from: d */
    public int f32445d;

    /* renamed from: e */
    public int f32446e;

    /* renamed from: f */
    public int f32447f;

    /* renamed from: g */
    public int f32448g;

    /* renamed from: h */
    public int f32449h;

    /* renamed from: i */
    public int f32450i;

    /* renamed from: j */
    public C9339aj f32451j;

    /* renamed from: k */
    public String f32452k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public String f32453l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public String f32454m = BuildConfig.FLAVOR;

    /* renamed from: n */
    public C9341al f32455n;

    /* renamed from: o */
    public String f32456o = BuildConfig.FLAVOR;

    /* renamed from: p */
    public C9343an f32457p;

    /* renamed from: q */
    public C62960cg f32458q = emptyFloatList();

    /* renamed from: r */
    public float f32459r;

    /* renamed from: s */
    public float f32460s;

    /* renamed from: t */
    public C9346aq f32461t;

    /* renamed from: u */
    public C62961ch f32462u = emptyIntList();

    /* renamed from: v */
    public C62961ch f32463v = emptyIntList();

    /* renamed from: w */
    public String f32464w = BuildConfig.FLAVOR;

    /* renamed from: x */
    public String f32465x = BuildConfig.FLAVOR;

    /* renamed from: y */
    public String f32466y = BuildConfig.FLAVOR;

    /* renamed from: z */
    public C9337ah f32467z;

    static {
        C9347ar arVar = new C9347ar();
        f32439A = arVar;
        C62942bv.registerDefaultInstance(C9347ar.class, arVar);
    }

    private C9347ar() {
    }

    /* renamed from: a */
    public final void mo17544a() {
        C62971cq cqVar = this.f32443b;
        if (!cqVar.mo58948c()) {
            this.f32443b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f32441B);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f32441B = b;
                return null;
            case 2:
                return newMessageInfo(f32439A, "\u0001\u0019\u0000\u0001\u0001\u001a\u0019\u0000\u0004\u0001\u0001Л\u0002င\u0000\u0003င\u0001\u0004င\u0002\u0005င\u0003\u0006င\u0004\u0007င\u0005\bဌ\u0006\tဉ\u0007\nဈ\b\fဈ\n\rဈ\u000b\u000eဉ\f\u000fဈ\r\u0010ဉ\u000e\u0011\u0013\u0012ခ\u000f\u0013ခ\u0010\u0014ဉ\u0011\u0015\u0016\u0016\u0016\u0017ဈ\u0012\u0018ဈ\u0013\u0019ဈ\u0014\u001aဉ\u0015", new Object[]{"a", "b", C9347ar.class, C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", C9344ao.f32430a, "j", C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a, "p", "q", C33259r.f88929b, C59002s.f156871a, C42181t.f110467a, C147476u.f398081a, "v", "w", "x", "y", "z"});
            case 3:
                return new C9347ar();
            case 4:
                return new C9333ad();
            case 5:
                return f32439A;
            case 6:
                C63010eb ebVar = f32440C;
                if (ebVar == null) {
                    synchronized (C9347ar.class) {
                        ebVar = f32440C;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32439A);
                            f32440C = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
