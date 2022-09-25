package com.google.p375ai.p378b;

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
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.ai.b.tt */
/* compiled from: PG */
public final class C8052tt extends C62942bv implements C63001dt {

    /* renamed from: B */
    public static final C8052tt f28314B;

    /* renamed from: D */
    private static volatile C63010eb f28315D;

    /* renamed from: A */
    public int f28316A;

    /* renamed from: C */
    private byte f28317C = 2;

    /* renamed from: a */
    public int f28318a;

    /* renamed from: b */
    public int f28319b = 0;

    /* renamed from: c */
    public Object f28320c;

    /* renamed from: d */
    public int f28321d = 0;

    /* renamed from: e */
    public Object f28322e;

    /* renamed from: f */
    public int f28323f = 1;

    /* renamed from: g */
    public C62971cq f28324g = emptyProtobufList();

    /* renamed from: h */
    public C62971cq f28325h = emptyProtobufList();

    /* renamed from: i */
    public C7818lb f28326i;

    /* renamed from: j */
    public boolean f28327j;

    /* renamed from: k */
    public boolean f28328k;

    /* renamed from: l */
    public C7838lv f28329l;

    /* renamed from: m */
    public C62971cq f28330m = emptyProtobufList();

    /* renamed from: n */
    public int f28331n;

    /* renamed from: o */
    public boolean f28332o;

    /* renamed from: p */
    public boolean f28333p = true;

    /* renamed from: q */
    public C62971cq f28334q = emptyProtobufList();

    /* renamed from: r */
    public C62971cq f28335r = emptyProtobufList();

    /* renamed from: s */
    public boolean f28336s;

    /* renamed from: t */
    public String f28337t = BuildConfig.FLAVOR;

    /* renamed from: u */
    public int f28338u;

    /* renamed from: v */
    public boolean f28339v;

    /* renamed from: w */
    public int f28340w;

    /* renamed from: x */
    public int f28341x;

    /* renamed from: y */
    public C7790ka f28342y;

    /* renamed from: z */
    public C8000rv f28343z;

    static {
        C8052tt ttVar = new C8052tt();
        f28314B = ttVar;
        C62942bv.registerDefaultInstance(C8052tt.class, ttVar);
    }

    private C8052tt() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28317C);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28317C = b;
                return null;
            case 2:
                return newMessageInfo(f28314B, "\u0001\u001b\u0002\u0001\u0001\u001c\u001b\u0000\u0005\u0001\u0001ဌ\u0000\u0002\u001b\u0003ြ\u0000\u0004\u001b\u0005ဉ\u0005\u0006ဇ\u0006\u0007ဇ\u0007\bဿ\u0000\tဿ\u0001\nျ\u0001\u000bဉ\n\f\u001b\rဌ\u000b\u000fဇ\f\u0010ဈ\u000f\u0011င\u0010\u0012ြ\u0000\u0013ဇ\u0011\u0014င\u0012\u0015င\u0013\u0016ဉ\u0014\u0017ᐉ\u0015\u0018\u001b\u0019\u001b\u001aဇ\u000e\u001bဇ\r\u001cဆ\u0016", new Object[]{C45240c.f118157a, "b", "e", "d", "a", C10662f.f35572a, C8051ts.m22929b(), C30325g.f82003a, C7818lb.class, C7893nw.class, C19618h.f54585a, C7818lb.class, "i", "j", C19621k.f54601a, C7989rk.f28068a, C7510a.f24744a, "l", "m", C7818lb.class, C48004n.f124238a, C8048tp.f28265a, C66412o.f180592a, C42181t.f110467a, C147476u.f398081a, C7838lv.class, "v", "w", "x", "y", "z", "q", C7818lb.class, C33259r.f88929b, C7818lb.class, C59002s.f156871a, "p", "A"});
            case 3:
                return new C8052tt();
            case 4:
                return new C8047to();
            case 5:
                return f28314B;
            case 6:
                C63010eb ebVar = f28315D;
                if (ebVar == null) {
                    synchronized (C8052tt.class) {
                        ebVar = f28315D;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28314B);
                            f28315D = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
