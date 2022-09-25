package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4567m.C60255b;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.common.o.aov */
/* compiled from: PG */
public final class aov extends C62942bv implements C63001dt {

    /* renamed from: u */
    public static final aov f159510u;

    /* renamed from: v */
    private static volatile C63010eb f159511v;

    /* renamed from: a */
    public int f159512a;

    /* renamed from: b */
    public int f159513b = -1;

    /* renamed from: c */
    public int f159514c;

    /* renamed from: d */
    public C62961ch f159515d = emptyIntList();

    /* renamed from: e */
    public int f159516e;

    /* renamed from: f */
    public int f159517f;

    /* renamed from: g */
    public int f159518g;

    /* renamed from: h */
    public C62971cq f159519h = emptyProtobufList();

    /* renamed from: i */
    public int f159520i;

    /* renamed from: j */
    public anj f159521j;

    /* renamed from: k */
    public aoj f159522k;

    /* renamed from: l */
    public int f159523l;

    /* renamed from: m */
    public int f159524m;

    /* renamed from: n */
    public String f159525n = BuildConfig.FLAVOR;

    /* renamed from: o */
    public int f159526o;

    /* renamed from: p */
    public anh f159527p;

    /* renamed from: q */
    public String f159528q = BuildConfig.FLAVOR;

    /* renamed from: r */
    public String f159529r = BuildConfig.FLAVOR;

    /* renamed from: s */
    public int f159530s;

    /* renamed from: t */
    public anv f159531t;

    static {
        aov aov = new aov();
        f159510u = aov;
        C62942bv.registerDefaultInstance(aov.class, aov);
    }

    private aov() {
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
                return newMessageInfo(f159510u, "\u0001\u0013\u0000\u0001\u0001\u0014\u0013\u0000\u0002\u0000\u0001င\u0000\u0002ဋ\u0001\u0003\u001d\u0004င\u0002\u0005ဌ\u0003\u0007င\u0005\b\u001b\tဌ\u0006\nဉ\u0007\u000bဉ\b\fဋ\t\rဈ\u000b\u000eင\r\u000fဉ\u000e\u0010ဈ\u000f\u0011ဈ\u0010\u0012ဋ\u0011\u0013ဋ\n\u0014ဉ\u0012", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, aot.f159509a, C30325g.f82003a, C19618h.f54585a, C60255b.class, "i", aoq.f159508a, "j", C19621k.f54601a, "l", C48004n.f124238a, C66412o.f180592a, "p", "q", C33259r.f88929b, C59002s.f156871a, "m", C42181t.f110467a});
            case 3:
                return new aov();
            case 4:
                return new aos();
            case 5:
                return f159510u;
            case 6:
                C63010eb ebVar = f159511v;
                if (ebVar == null) {
                    synchronized (aov.class) {
                        ebVar = f159511v;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159510u);
                            f159511v = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
