package com.google.protos.p4985f.p5030q.p5032b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.b.bm */
/* compiled from: PG */
public final class C65055bm extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C65055bm f176168d;

    /* renamed from: e */
    private static volatile C63010eb f176169e;

    /* renamed from: a */
    public int f176170a;

    /* renamed from: b */
    public int f176171b;

    /* renamed from: c */
    public C62971cq f176172c = emptyProtobufList();

    static {
        C65055bm bmVar = new C65055bm();
        f176168d = bmVar;
        C62942bv.registerDefaultInstance(C65055bm.class, bmVar);
    }

    private C65055bm() {
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
                return newMessageInfo(f176168d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0003\u001c", new Object[]{"a", "b", C65054bl.f176167a, C45240c.f118157a});
            case 3:
                return new C65055bm();
            case 4:
                return new C65053bk();
            case 5:
                return f176168d;
            case 6:
                C63010eb ebVar = f176169e;
                if (ebVar == null) {
                    synchronized (C65055bm.class) {
                        ebVar = f176169e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176168d);
                            f176169e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
