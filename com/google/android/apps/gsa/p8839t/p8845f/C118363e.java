package com.google.android.apps.gsa.p8839t.p8845f;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123710ad;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123730ax;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123742bi;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123751br;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123759bz;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123770cj;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123787p;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.assistant.p3994s.p3995a.C53155dk;
import com.google.assistant.p3994s.p3995a.C53173eb;
import com.google.assistant.p3994s.p3995a.C53190es;
import com.google.assistant.p3994s.p3995a.C53199fa;
import com.google.assistant.p3994s.p3995a.C53212fn;
import com.google.assistant.p3994s.p3995a.C53245gt;
import com.google.assistant.p3994s.p3995a.C53249gx;
import com.google.assistant.p3994s.p3995a.C53426nl;
import com.google.assistant.p3994s.p3995a.C53430np;
import com.google.assistant.p3994s.p3995a.C53442oa;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.t.f.e */
/* compiled from: PG */
public final class C118363e extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C118363e f328532h;

    /* renamed from: j */
    private static volatile C63010eb f328533j;

    /* renamed from: a */
    public int f328534a;

    /* renamed from: b */
    public int f328535b = 0;

    /* renamed from: c */
    public Object f328536c;

    /* renamed from: d */
    public int f328537d;

    /* renamed from: e */
    public String f328538e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62971cq f328539f = emptyProtobufList();

    /* renamed from: g */
    public C48952az f328540g;

    /* renamed from: i */
    private byte f328541i = 2;

    static {
        C118363e eVar = new C118363e();
        f328532h = eVar;
        C62942bv.registerDefaultInstance(C118363e.class, eVar);
    }

    private C118363e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f328541i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f328541i = b;
                return null;
            case 2:
                return newMessageInfo(f328532h, "\u0001\u0015\u0001\u0001\u0001\u001b\u0015\u0000\u0001\t\u0001င\u0000\u0002ᐼ\u0000\u0003ဈ\u0001\u0004ြ\u0000\u0005ᐼ\u0000\u0006ᐼ\u0000\bြ\u0000\tᐼ\u0000\nြ\u0000\u000bြ\u0000\fြ\u0000\rЛ\u000eြ\u0000\u000fᐼ\u0000\u0011ᐼ\u0000\u0016ြ\u0000\u0017ᐼ\u0000\u0018ᐼ\u0000\u0019ဉ\u0014\u001aြ\u0000\u001bြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C53442oa.class, "e", C123770cj.class, C123730ax.class, C123742bi.class, C53173eb.class, C53199fa.class, C53190es.class, C53245gt.class, C53212fn.class, C10662f.f35572a, C53426nl.class, C123787p.class, C123710ad.class, C53155dk.class, C53249gx.class, C53430np.class, C53430np.class, C30325g.f82003a, C123759bz.class, C123751br.class});
            case 3:
                return new C118363e();
            case 4:
                return new C118362d();
            case 5:
                return f328532h;
            case 6:
                C63010eb ebVar = f328533j;
                if (ebVar == null) {
                    synchronized (C118363e.class) {
                        ebVar = f328533j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f328532h);
                            f328533j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
