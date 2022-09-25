package com.google.android.apps.p489g.p494d;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p10983ae.p10984a.C147476u;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p375ai.p378b.C7786jx;
import com.google.p375ai.p378b.C7818lb;
import com.google.p375ai.p378b.C8000rv;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.apps.g.d.bx */
/* compiled from: PG */
public final class C9188bx extends C62942bv implements C63001dt {

    /* renamed from: x */
    public static final C9188bx f31714x;

    /* renamed from: z */
    private static volatile C63010eb f31715z;

    /* renamed from: a */
    public int f31716a;

    /* renamed from: b */
    public C62971cq f31717b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f31718c = emptyProtobufList();

    /* renamed from: d */
    public C9164b f31719d;

    /* renamed from: e */
    public C62971cq f31720e = emptyProtobufList();

    /* renamed from: f */
    public C9201cj f31721f;

    /* renamed from: g */
    public int f31722g;

    /* renamed from: h */
    public C9164b f31723h;

    /* renamed from: i */
    public int f31724i;

    /* renamed from: j */
    public int f31725j;

    /* renamed from: k */
    public boolean f31726k;

    /* renamed from: l */
    public boolean f31727l;

    /* renamed from: m */
    public C7818lb f31728m;

    /* renamed from: n */
    public C9164b f31729n;

    /* renamed from: o */
    public boolean f31730o;

    /* renamed from: p */
    public int f31731p;

    /* renamed from: q */
    public int f31732q;

    /* renamed from: r */
    public int f31733r;

    /* renamed from: s */
    public int f31734s;

    /* renamed from: t */
    public int f31735t;

    /* renamed from: u */
    public C9174bj f31736u;

    /* renamed from: v */
    public C8000rv f31737v;

    /* renamed from: w */
    public int f31738w;

    /* renamed from: y */
    private byte f31739y = 2;

    static {
        C9188bx bxVar = new C9188bx();
        f31714x = bxVar;
        C62942bv.registerDefaultInstance(C9188bx.class, bxVar);
    }

    private C9188bx() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f31739y);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f31739y = b;
                return null;
            case 2:
                return newMessageInfo(f31714x, "\u0001\u0016\u0000\u0001\u0001\u0018\u0016\u0000\u0003\u0002\u0001\u001b\u0002\u001b\u0003\u001b\u0004ᐉ\u0001\u0005ဇ\u0007\u0007ဉ\b\bဉ\t\tင\u0002\nဇ\n\u000bင\u000b\fဌ\u0004\u000eဌ\r\u000fင\f\u0010ဌ\u0005\u0011ဇ\u0006\u0012ဉ\u0003\u0013င\u000e\u0014င\u000f\u0015ဉ\u0000\u0016ဉ\u0010\u0017ᐉ\u0011\u0018င\u0012", new Object[]{"a", "b", C7818lb.class, C45240c.f118157a, C7818lb.class, "e", C7818lb.class, C10662f.f35572a, "l", "m", C48004n.f124238a, C30325g.f82003a, C66412o.f180592a, "p", "i", C9184bt.f31712a, C33259r.f88929b, C9186bv.f31713a, "q", "j", C7786jx.f27250a, C19621k.f54601a, C19618h.f54585a, C59002s.f156871a, C42181t.f110467a, "d", C147476u.f398081a, "v", "w"});
            case 3:
                return new C9188bx();
            case 4:
                return new C9183bs();
            case 5:
                return f31714x;
            case 6:
                C63010eb ebVar = f31715z;
                if (ebVar == null) {
                    synchronized (C9188bx.class) {
                        ebVar = f31715z;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31714x);
                            f31715z = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
