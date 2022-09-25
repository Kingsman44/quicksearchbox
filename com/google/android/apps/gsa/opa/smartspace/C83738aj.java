package com.google.android.apps.gsa.opa.smartspace;

import com.google.android.apps.gsa.opa.smartspace.p6455d.C83778u;
import com.google.android.apps.gsa.shared.p7041h.C89776h;
import com.google.android.apps.gsa.smartspace.C92109e;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123751br;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123757bx;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123759bz;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123779h;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123787p;
import com.google.assistant.p3886c.C50853y;
import com.google.assistant.p3994s.p3995a.C53165du;
import com.google.assistant.p3994s.p3995a.C53190es;
import com.google.assistant.p3994s.p3995a.C53245gt;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.aj */
/* compiled from: PG */
public final class C83738aj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C83738aj f228226c;

    /* renamed from: d */
    private static volatile C63010eb f228227d;

    /* renamed from: a */
    public int f228228a = 0;

    /* renamed from: b */
    public Object f228229b;

    static {
        C83738aj ajVar = new C83738aj();
        f228226c = ajVar;
        C62942bv.registerDefaultInstance(C83738aj.class, ajVar);
    }

    private C83738aj() {
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
                return newMessageInfo(f228226c, "\u0001\f\u0001\u0000\u0001\u0013\f\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\u0012ြ\u0000\u0013ြ\u0000", new Object[]{"b", "a", C89776h.class, C92109e.class, C53245gt.class, C53190es.class, C53165du.class, C123787p.class, C123759bz.class, C123751br.class, C83778u.class, C50853y.class, C123779h.class, C123757bx.class});
            case 3:
                return new C83738aj();
            case 4:
                return new C83737ai();
            case 5:
                return f228226c;
            case 6:
                C63010eb ebVar = f228227d;
                if (ebVar == null) {
                    synchronized (C83738aj.class) {
                        ebVar = f228227d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228226c);
                            f228227d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
