package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.assistant.e.j.bm */
/* compiled from: PG */
public final class C51715bm extends C62942bv implements C63001dt {

    /* renamed from: t */
    public static final C51715bm f135662t;

    /* renamed from: v */
    private static volatile C63010eb f135663v;

    /* renamed from: a */
    public int f135664a;

    /* renamed from: b */
    public C52428rj f135665b;

    /* renamed from: c */
    public String f135666c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public amf f135667d;

    /* renamed from: e */
    public C51705bc f135668e;

    /* renamed from: f */
    public C51703ba f135669f;

    /* renamed from: g */
    public C51766cs f135670g;

    /* renamed from: h */
    public C51772cy f135671h;

    /* renamed from: i */
    public C51754cg f135672i;

    /* renamed from: j */
    public C51725bw f135673j;

    /* renamed from: k */
    public int f135674k;

    /* renamed from: l */
    public C51798dn f135675l;

    /* renamed from: m */
    public C51723bu f135676m;

    /* renamed from: n */
    public int f135677n;

    /* renamed from: o */
    public boolean f135678o;

    /* renamed from: p */
    public C62971cq f135679p = C62942bv.emptyProtobufList();

    /* renamed from: q */
    public C51709bg f135680q;

    /* renamed from: r */
    public C51689aq f135681r;

    /* renamed from: s */
    public int f135682s;

    /* renamed from: u */
    private byte f135683u = 2;

    static {
        C51715bm bmVar = new C51715bm();
        f135662t = bmVar;
        C62942bv.registerDefaultInstance(C51715bm.class, bmVar);
    }

    private C51715bm() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f135683u);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f135683u = b;
                return null;
            case 2:
                return newMessageInfo(f135662t, "\u0001\u0012\u0000\u0001\u0001\u001f\u0012\u0000\u0001\u0001\u0001ဉ\u0000\u0002ဉ\u0003\u0003ဉ\u0004\u0004ဉ\u0005\u0006ᐉ\u0007\u0007ဉ\b\bဉ\t\tဈ\u0001\rဌ\r\u000eဉ\u0002\u000fဉ\u0010\u0010ဌ\u0011\u0011ဉ\u000e\u0012ဇ\u0012\u0013\u001a\u0017ဉ\u0015\u001dဉ\u001b\u001fဌ\u001c", new Object[]{"a", "b", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C45240c.f118157a, C19621k.f54601a, C51727by.m86370b(), "d", "m", C48004n.f124238a, C51759cl.f135797a, "l", C66412o.f180592a, "p", "q", C33259r.f88929b, C59002s.f156871a, C51716bn.f135684a});
            case 3:
                return new C51715bm();
            case 4:
                return new C51714bl();
            case 5:
                return f135662t;
            case 6:
                C63010eb ebVar = f135663v;
                if (ebVar == null) {
                    synchronized (C51715bm.class) {
                        ebVar = f135663v;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135662t);
                            f135663v = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
