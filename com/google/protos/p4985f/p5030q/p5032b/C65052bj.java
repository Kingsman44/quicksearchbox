package com.google.protos.p4985f.p5030q.p5032b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.b.bj */
/* compiled from: PG */
public final class C65052bj extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C65052bj f176162d;

    /* renamed from: e */
    private static volatile C63010eb f176163e;

    /* renamed from: a */
    public int f176164a;

    /* renamed from: b */
    public C62971cq f176165b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public long f176166c;

    static {
        C65052bj bjVar = new C65052bj();
        f176162d = bjVar;
        C62942bv.registerDefaultInstance(C65052bj.class, bjVar);
    }

    private C65052bj() {
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
                return newMessageInfo(f176162d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဂ\u0000", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C65052bj();
            case 4:
                return new C65051bi();
            case 5:
                return f176162d;
            case 6:
                C63010eb ebVar = f176163e;
                if (ebVar == null) {
                    synchronized (C65052bj.class) {
                        ebVar = f176163e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176162d);
                            f176163e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
