package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.qy */
/* compiled from: PG */
public final class C88148qy extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C88148qy f238276d;

    /* renamed from: e */
    private static volatile C63010eb f238277e;

    /* renamed from: a */
    public int f238278a;

    /* renamed from: b */
    public int f238279b;

    /* renamed from: c */
    public C62971cq f238280c = emptyProtobufList();

    static {
        C88148qy qyVar = new C88148qy();
        f238276d = qyVar;
        C62942bv.registerDefaultInstance(C88148qy.class, qyVar);
    }

    private C88148qy() {
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
                return newMessageInfo(f238276d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဋ\u0000\u0002\u001b", new Object[]{"a", "b", C45240c.f118157a, C88151ra.class});
            case 3:
                return new C88148qy();
            case 4:
                return new C88147qx();
            case 5:
                return f238276d;
            case 6:
                C63010eb ebVar = f238277e;
                if (ebVar == null) {
                    synchronized (C88148qy.class) {
                        ebVar = f238277e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238276d);
                            f238277e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
