package com.google.android.apps.gsa.search.core.p6519al.p6694dd;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.core.al.dd.d */
/* compiled from: PG */
public final class C85335d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C85335d f231112d;

    /* renamed from: e */
    private static volatile C63010eb f231113e;

    /* renamed from: a */
    public int f231114a;

    /* renamed from: b */
    public C62971cq f231115b = emptyProtobufList();

    /* renamed from: c */
    public boolean f231116c;

    static {
        C85335d dVar = new C85335d();
        f231112d = dVar;
        C62942bv.registerDefaultInstance(C85335d.class, dVar);
    }

    private C85335d() {
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
                return newMessageInfo(f231112d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000", new Object[]{"a", "b", C62910ar.class, C45240c.f118157a});
            case 3:
                return new C85335d();
            case 4:
                return new C85334c();
            case 5:
                return f231112d;
            case 6:
                C63010eb ebVar = f231113e;
                if (ebVar == null) {
                    synchronized (C85335d.class) {
                        ebVar = f231113e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f231112d);
                            f231113e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
