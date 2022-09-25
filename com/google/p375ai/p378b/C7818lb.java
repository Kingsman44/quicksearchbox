package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.lb */
/* compiled from: PG */
public final class C7818lb extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C7818lb f27416n;

    /* renamed from: o */
    private static volatile C63010eb f27417o;

    /* renamed from: a */
    public int f27418a;

    /* renamed from: b */
    public C62971cq f27419b = emptyProtobufList();

    /* renamed from: c */
    public int f27420c;

    /* renamed from: d */
    public int f27421d;

    /* renamed from: e */
    public int f27422e;

    /* renamed from: f */
    public String f27423f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public boolean f27424g;

    /* renamed from: h */
    public C8150xj f27425h;

    /* renamed from: i */
    public int f27426i;

    /* renamed from: j */
    public int f27427j;

    /* renamed from: k */
    public boolean f27428k;

    /* renamed from: l */
    public boolean f27429l;

    /* renamed from: m */
    public C7822lf f27430m;

    static {
        C7818lb lbVar = new C7818lb();
        f27416n = lbVar;
        C62942bv.registerDefaultInstance(C7818lb.class, lbVar);
    }

    private C7818lb() {
    }

    /* renamed from: a */
    public final void mo16973a() {
        C62971cq cqVar = this.f27419b;
        if (!cqVar.mo58948c()) {
            this.f27419b = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f27416n, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0001\u0000\u0001\u001b\u0003ဌ\u0000\u0004င\u0001\u0005ဌ\u0002\u0006ဈ\u0003\u0007ဉ\u0005\bင\u0006\tဇ\b\nဇ\u0004\u000bဇ\t\fဉ\n\rင\u0007", new Object[]{"a", "b", C7811kv.class, C45240c.f118157a, C7817la.m22860b(), "d", "e", C7813kx.f27314a, C10662f.f35572a, C19618h.f54585a, "i", C19621k.f54601a, C30325g.f82003a, "l", "m", "j"});
            case 3:
                return new C7818lb();
            case 4:
                return new C7812kw();
            case 5:
                return f27416n;
            case 6:
                C63010eb ebVar = f27417o;
                if (ebVar == null) {
                    synchronized (C7818lb.class) {
                        ebVar = f27417o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27416n);
                            f27417o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
