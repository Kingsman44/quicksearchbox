package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
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
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bk */
/* compiled from: PG */
public final class C16750bk extends C62942bv implements C63001dt {

    /* renamed from: u */
    public static final C16750bk f48980u;

    /* renamed from: w */
    private static volatile C63010eb f48981w;

    /* renamed from: a */
    public int f48982a;

    /* renamed from: b */
    public int f48983b;

    /* renamed from: c */
    public int f48984c;

    /* renamed from: d */
    public C16746bg f48985d;

    /* renamed from: e */
    public int f48986e;

    /* renamed from: f */
    public C16718af f48987f;

    /* renamed from: g */
    public C16736ax f48988g;

    /* renamed from: h */
    public C16726an f48989h;

    /* renamed from: i */
    public C16772v f48990i;

    /* renamed from: j */
    public C16734av f48991j;

    /* renamed from: k */
    public C16662b f48992k;

    /* renamed from: l */
    public C16754d f48993l;

    /* renamed from: m */
    public C16768r f48994m;

    /* renamed from: n */
    public C16776z f48995n;

    /* renamed from: o */
    public C12991i f48996o;

    /* renamed from: p */
    public C16716ad f48997p;

    /* renamed from: q */
    public C16766p f48998q;

    /* renamed from: r */
    public C16756f f48999r;

    /* renamed from: s */
    public int f49000s;

    /* renamed from: t */
    public C16722aj f49001t;

    /* renamed from: v */
    private byte f49002v = 2;

    static {
        C16750bk bkVar = new C16750bk();
        f48980u = bkVar;
        C62942bv.registerDefaultInstance(C16750bk.class, bkVar);
    }

    private C16750bk() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f49002v);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f49002v = b;
                return null;
            case 2:
                return newMessageInfo(f48980u, "\u0001\u0013\u0000\u0001\u0001\u0014\u0013\u0000\u0000\u0003\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဉ\u0002\u0004ဌ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\tဉ\u0007\nဉ\b\u000bᐉ\t\fဉ\n\rဉ\u000b\u000eဉ\f\u000fᐉ\r\u0010ဉ\u000e\u0011ဉ\u000f\u0012ᐉ\u0010\u0013ဋ\u0011\u0014ဉ\u0012", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C16730ar.m33789b(), C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a, "p", "q", C33259r.f88929b, C59002s.f156871a, C42181t.f110467a});
            case 3:
                return new C16750bk();
            case 4:
                return new C16749bj();
            case 5:
                return f48980u;
            case 6:
                C63010eb ebVar = f48981w;
                if (ebVar == null) {
                    synchronized (C16750bk.class) {
                        ebVar = f48981w;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48980u);
                            f48981w = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
