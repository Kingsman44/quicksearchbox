package com.google.android.apps.p489g.p494d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p375ai.p378b.C7818lb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.apps.g.d.cj */
/* compiled from: PG */
public final class C9201cj extends C62942bv implements C63001dt {

    /* renamed from: u */
    public static final C9201cj f31773u;

    /* renamed from: w */
    private static volatile C63010eb f31774w;

    /* renamed from: a */
    public int f31775a;

    /* renamed from: b */
    public String f31776b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f31777c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f31778d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public C9141ad f31779e;

    /* renamed from: f */
    public C62971cq f31780f = emptyProtobufList();

    /* renamed from: g */
    public int f31781g;

    /* renamed from: h */
    public int f31782h;

    /* renamed from: i */
    public float f31783i;

    /* renamed from: j */
    public int f31784j;

    /* renamed from: k */
    public int f31785k;

    /* renamed from: l */
    public int f31786l;

    /* renamed from: m */
    public int f31787m;

    /* renamed from: n */
    public boolean f31788n;

    /* renamed from: o */
    public boolean f31789o = true;

    /* renamed from: p */
    public C62971cq f31790p = emptyProtobufList();

    /* renamed from: q */
    public C62971cq f31791q = emptyProtobufList();

    /* renamed from: r */
    public boolean f31792r;

    /* renamed from: s */
    public String f31793s = BuildConfig.FLAVOR;

    /* renamed from: t */
    public String f31794t = BuildConfig.FLAVOR;

    /* renamed from: v */
    private byte f31795v = 2;

    static {
        C9201cj cjVar = new C9201cj();
        f31773u = cjVar;
        C62942bv.registerDefaultInstance(C9201cj.class, cjVar);
    }

    private C9201cj() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f31795v);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f31795v = b;
                return null;
            case 2:
                return newMessageInfo(f31773u, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0002\u0001ဈ\u0000\u0002\u001a\u0003ᐉ\u0002\u0004Л\u0005င\u0003\u0006င\u0004\u0007ဇ\n\bဈ\r\tဈ\u000e\nခ\u0005\u000bင\u0006\fင\u0007\rင\b\u000eင\t\u000f\u001b\u0010ဈ\u0001\u0011\u001b\u0012ဇ\f\u0013ဇ\u000b", new Object[]{"a", "b", "d", "e", C10662f.f35572a, C9141ad.class, C30325g.f82003a, C19618h.f54585a, C48004n.f124238a, C59002s.f156871a, C42181t.f110467a, "i", "j", C19621k.f54601a, "l", "m", "p", C7818lb.class, C45240c.f118157a, "q", C7818lb.class, C33259r.f88929b, C66412o.f180592a});
            case 3:
                return new C9201cj();
            case 4:
                return new C9200ci();
            case 5:
                return f31773u;
            case 6:
                C63010eb ebVar = f31774w;
                if (ebVar == null) {
                    synchronized (C9201cj.class) {
                        ebVar = f31774w;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31773u);
                            f31774w = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
