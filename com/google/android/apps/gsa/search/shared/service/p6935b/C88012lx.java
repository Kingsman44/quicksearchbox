package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.lx */
/* compiled from: PG */
public final class C88012lx extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C88012lx f238010e;

    /* renamed from: f */
    private static volatile C63010eb f238011f;

    /* renamed from: a */
    public int f238012a;

    /* renamed from: b */
    public int f238013b = 0;

    /* renamed from: c */
    public Object f238014c;

    /* renamed from: d */
    public String f238015d = BuildConfig.FLAVOR;

    static {
        C88012lx lxVar = new C88012lx();
        f238010e = lxVar;
        C62942bv.registerDefaultInstance(C88012lx.class, lxVar);
    }

    private C88012lx() {
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
                return newMessageInfo(f238010e, "\u0001\n\u0001\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ဈ\t\u0006ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\u000bြ\u0000", new Object[]{C45240c.f118157a, "b", "a", C88001lm.class, C87993le.class, C88007ls.class, C88005lq.class, "d", C87999lk.class, C88011lw.class, C87990lb.class, C88003lo.class, C88009lu.class});
            case 3:
                return new C88012lx();
            case 4:
                return new C87991lc();
            case 5:
                return f238010e;
            case 6:
                C63010eb ebVar = f238011f;
                if (ebVar == null) {
                    synchronized (C88012lx.class) {
                        ebVar = f238011f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238010e);
                            f238011f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
