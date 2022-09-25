package com.google.android.apps.search.assistant.platform.pcp.p9329f;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3994s.p3995a.C53128ck;
import com.google.assistant.p3994s.p3995a.C53155dk;
import com.google.assistant.p3994s.p3995a.C53173eb;
import com.google.assistant.p3994s.p3995a.C53190es;
import com.google.assistant.p3994s.p3995a.C53199fa;
import com.google.assistant.p3994s.p3995a.C53204ff;
import com.google.assistant.p3994s.p3995a.C53212fn;
import com.google.assistant.p3994s.p3995a.C53218ft;
import com.google.assistant.p3994s.p3995a.C53227gb;
import com.google.assistant.p3994s.p3995a.C53245gt;
import com.google.assistant.p3994s.p3995a.C53247gv;
import com.google.assistant.p3994s.p3995a.C53249gx;
import com.google.assistant.p3994s.p3995a.C53426nl;
import com.google.assistant.p3994s.p3995a.C53430np;
import com.google.assistant.p3994s.p3995a.C53442oa;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.bk */
/* compiled from: PG */
public final class C123744bk extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C123744bk f341804l;

    /* renamed from: n */
    private static volatile C63010eb f341805n;

    /* renamed from: a */
    public int f341806a;

    /* renamed from: b */
    public int f341807b;

    /* renamed from: c */
    public int f341808c = 0;

    /* renamed from: d */
    public Object f341809d;

    /* renamed from: e */
    public int f341810e;

    /* renamed from: f */
    public String f341811f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f341812g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C53426nl f341813h;

    /* renamed from: i */
    public boolean f341814i;

    /* renamed from: j */
    public int f341815j;

    /* renamed from: k */
    public C123772cl f341816k;

    /* renamed from: m */
    private byte f341817m = 2;

    static {
        C123744bk bkVar = new C123744bk();
        f341804l = bkVar;
        C62942bv.registerDefaultInstance(C123744bk.class, bkVar);
    }

    private C123744bk() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f341817m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f341817m = b;
                return null;
            case 2:
                return newMessageInfo(f341804l, "\u0001$\u0001\u0002\u0001($\u0000\u0000\f\u0001င\u0000\u0002ᐼ\u0000\u0003ဈ\u0001\u0004ြ\u0000\u0005ᐼ\u0000\u0006ᐼ\u0000\u0007ဈ\u0002\bြ\u0000\tᐼ\u0000\nြ\u0000\u000bြ\u0000\fြ\u0000\rᐉ \u000eြ\u0000\u000fᐼ\u0000\u0010ဇ!\u0011ᐼ\u0000\u0012ဌ\"\u0013ᐉ#\u0016ြ\u0000\u0017ᐼ\u0000\u0018ᐼ\u0000\u001aြ\u0000\u001bြ\u0000\u001cြ\u0000\u001dᐼ\u0000\u001eြ\u0000\u001fြ\u0000 ြ\u0000\"ြ\u0000#ᐼ\u0000$ြ\u0000%ြ\u0000&ြ\u0000'ြ\u0000(ြ\u0000", new Object[]{"d", C45240c.f118157a, "a", "b", "e", C53442oa.class, C10662f.f35572a, C123770cj.class, C123730ax.class, C123742bi.class, C30325g.f82003a, C53173eb.class, C53199fa.class, C53190es.class, C53245gt.class, C53212fn.class, C19618h.f54585a, C123787p.class, C123710ad.class, "i", C53155dk.class, "j", C123773cm.f341912a, C19621k.f54601a, C53249gx.class, C53430np.class, C53430np.class, C123751br.class, C123759bz.class, C53204ff.class, C123753bt.class, C53227gb.class, C123757bx.class, C123779h.class, C53218ft.class, C53128ck.class, C123708ab.class, C123789r.class, C123712af.class, C123714ah.class, C53247gv.class});
            case 3:
                return new C123744bk();
            case 4:
                return new C123743bj();
            case 5:
                return f341804l;
            case 6:
                C63010eb ebVar = f341805n;
                if (ebVar == null) {
                    synchronized (C123744bk.class) {
                        ebVar = f341805n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341804l);
                            f341805n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
