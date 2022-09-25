package com.google.android.apps.gsa.nga.engine.gestureclassifier;

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
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.apps.gsa.nga.engine.gestureclassifier.f */
/* compiled from: PG */
public final class C76116f extends C62942bv implements C63001dt {

    /* renamed from: v */
    public static final C76116f f211019v;

    /* renamed from: w */
    private static volatile C63010eb f211020w;

    /* renamed from: a */
    public int f211021a;

    /* renamed from: b */
    public float f211022b;

    /* renamed from: c */
    public float f211023c;

    /* renamed from: d */
    public float f211024d;

    /* renamed from: e */
    public float f211025e;

    /* renamed from: f */
    public float f211026f;

    /* renamed from: g */
    public float f211027g;

    /* renamed from: h */
    public float f211028h;

    /* renamed from: i */
    public float f211029i;

    /* renamed from: j */
    public float f211030j;

    /* renamed from: k */
    public float f211031k;

    /* renamed from: l */
    public float f211032l;

    /* renamed from: m */
    public float f211033m;

    /* renamed from: n */
    public float f211034n;

    /* renamed from: o */
    public float f211035o;

    /* renamed from: p */
    public float f211036p;

    /* renamed from: q */
    public float f211037q;

    /* renamed from: r */
    public float f211038r;

    /* renamed from: s */
    public float f211039s;

    /* renamed from: t */
    public float f211040t;

    /* renamed from: u */
    public float f211041u;

    static {
        C76116f fVar = new C76116f();
        f211019v = fVar;
        C62942bv.registerDefaultInstance(C76116f.class, fVar);
    }

    private C76116f() {
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
                return newMessageInfo(f211019v, "\u0001\u0014\u0000\u0001\u0001\u0014\u0014\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tခ\b\nခ\t\u000bခ\n\fခ\u000b\rခ\f\u000eခ\r\u000fခ\u000e\u0010ခ\u000f\u0011ခ\u0010\u0012ခ\u0011\u0013ခ\u0012\u0014ခ\u0013", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a, "p", "q", C33259r.f88929b, C59002s.f156871a, C42181t.f110467a, C147476u.f398081a});
            case 3:
                return new C76116f();
            case 4:
                return new C76115e();
            case 5:
                return f211019v;
            case 6:
                C63010eb ebVar = f211020w;
                if (ebVar == null) {
                    synchronized (C76116f.class) {
                        ebVar = f211020w;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f211019v);
                            f211020w = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
