package com.google.p375ai.p378b;

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

/* renamed from: com.google.ai.b.rt */
/* compiled from: PG */
public final class C7998rt extends C62942bv implements C63001dt {

    /* renamed from: v */
    public static final C7998rt f28087v;

    /* renamed from: x */
    private static volatile C63010eb f28088x;

    /* renamed from: a */
    public int f28089a;

    /* renamed from: b */
    public int f28090b;

    /* renamed from: c */
    public int f28091c;

    /* renamed from: d */
    public boolean f28092d;

    /* renamed from: e */
    public int f28093e;

    /* renamed from: f */
    public int f28094f;

    /* renamed from: g */
    public int f28095g;

    /* renamed from: h */
    public int f28096h;

    /* renamed from: i */
    public int f28097i;

    /* renamed from: j */
    public int f28098j;

    /* renamed from: k */
    public boolean f28099k;

    /* renamed from: l */
    public int f28100l;

    /* renamed from: m */
    public int f28101m;

    /* renamed from: n */
    public int f28102n;

    /* renamed from: o */
    public C8178yk f28103o;

    /* renamed from: p */
    public boolean f28104p;

    /* renamed from: q */
    public boolean f28105q;

    /* renamed from: r */
    public boolean f28106r;

    /* renamed from: s */
    public int f28107s;

    /* renamed from: t */
    public boolean f28108t;

    /* renamed from: u */
    public int f28109u = 1;

    /* renamed from: w */
    private byte f28110w = 2;

    static {
        C7998rt rtVar = new C7998rt();
        f28087v = rtVar;
        C62942bv.registerDefaultInstance(C7998rt.class, rtVar);
    }

    private C7998rt() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28110w);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28110w = b;
                return null;
            case 2:
                return newMessageInfo(f28087v, "\u0001\u0014\u0000\u0001\u0001\u0015\u0014\u0000\u0000\u0001\u0001င\u0000\u0002င\u0001\u0003ဇ\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0006\u0007င\u0007\bင\b\tဇ\t\nင\n\u000bင\u000b\fင\u0005\rင\f\u000eᐉ\r\u000fဇ\u000e\u0010ဇ\u000f\u0011ဇ\u0010\u0012ဌ\u0011\u0013ဇ\u0012\u0015ဌ\u0013", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C30325g.f82003a, C48004n.f124238a, C66412o.f180592a, "p", "q", C33259r.f88929b, C59002s.f156871a, C7692gk.f26860a, C42181t.f110467a, C147476u.f398081a, C7996rr.f28086a});
            case 3:
                return new C7998rt();
            case 4:
                return new C7995rq();
            case 5:
                return f28087v;
            case 6:
                C63010eb ebVar = f28088x;
                if (ebVar == null) {
                    synchronized (C7998rt.class) {
                        ebVar = f28088x;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28087v);
                            f28088x = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
