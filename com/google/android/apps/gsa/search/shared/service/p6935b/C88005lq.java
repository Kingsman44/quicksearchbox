package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.libraries.gsa.monet.shared.p1894d.C23107j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.lq */
/* compiled from: PG */
public final class C88005lq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88005lq f237991c;

    /* renamed from: d */
    private static volatile C63010eb f237992d;

    /* renamed from: a */
    public int f237993a;

    /* renamed from: b */
    public C23107j f237994b;

    static {
        C88005lq lqVar = new C88005lq();
        f237991c = lqVar;
        C62942bv.registerDefaultInstance(C88005lq.class, lqVar);
    }

    private C88005lq() {
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
                return newMessageInfo(f237991c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C88005lq();
            case 4:
                return new C88004lp();
            case 5:
                return f237991c;
            case 6:
                C63010eb ebVar = f237992d;
                if (ebVar == null) {
                    synchronized (C88005lq.class) {
                        ebVar = f237992d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237991c);
                            f237992d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
