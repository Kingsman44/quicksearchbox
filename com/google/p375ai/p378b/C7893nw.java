package com.google.p375ai.p378b;

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
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.ai.b.nw */
/* compiled from: PG */
public final class C7893nw extends C62942bv implements C63001dt {

    /* renamed from: q */
    public static final C7893nw f27731q;

    /* renamed from: r */
    private static volatile C63010eb f27732r;

    /* renamed from: a */
    public int f27733a;

    /* renamed from: b */
    public int f27734b;

    /* renamed from: c */
    public int f27735c;

    /* renamed from: d */
    public int f27736d;

    /* renamed from: e */
    public int f27737e;

    /* renamed from: f */
    public int f27738f;

    /* renamed from: g */
    public int f27739g;

    /* renamed from: h */
    public int f27740h;

    /* renamed from: i */
    public int f27741i;

    /* renamed from: j */
    public float f27742j;

    /* renamed from: k */
    public String f27743k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public String f27744l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public String f27745m = BuildConfig.FLAVOR;

    /* renamed from: n */
    public String f27746n = BuildConfig.FLAVOR;

    /* renamed from: o */
    public C7526an f27747o;

    /* renamed from: p */
    public C8150xj f27748p;

    static {
        C7893nw nwVar = new C7893nw();
        f27731q = nwVar;
        C62942bv.registerDefaultInstance(C7893nw.class, nwVar);
    }

    private C7893nw() {
        emptyProtobufList();
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
                return newMessageInfo(f27731q, "\u0001\u000f\u0000\u0001\u0001\u0016\u000f\u0000\u0000\u0000\u0001ဈ\t\u0002င\u0000\u0003င\u0001\nဉ\u000f\u000bဉ\u0010\rဈ\n\u000eင\u0002\u000fင\u0003\u0010ခ\b\u0011င\u0004\u0012င\u0005\u0013င\u0006\u0014င\u0007\u0015ဈ\u000b\u0016ဈ\f", new Object[]{"a", C19621k.f54601a, "b", C45240c.f118157a, C66412o.f180592a, "p", "l", "d", "e", "j", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "m", C48004n.f124238a});
            case 3:
                return new C7893nw();
            case 4:
                return new C7892nv();
            case 5:
                return f27731q;
            case 6:
                C63010eb ebVar = f27732r;
                if (ebVar == null) {
                    synchronized (C7893nw.class) {
                        ebVar = f27732r;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27731q);
                            f27732r = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
