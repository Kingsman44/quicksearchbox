package com.google.protos.p4985f.p5030q.p5032b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.b.j */
/* compiled from: PG */
public final class C65063j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C65063j f176192d;

    /* renamed from: e */
    private static volatile C63010eb f176193e;

    /* renamed from: a */
    public int f176194a;

    /* renamed from: b */
    public C62971cq f176195b = emptyProtobufList();

    /* renamed from: c */
    public C65027al f176196c;

    static {
        C65063j jVar = new C65063j();
        f176192d = jVar;
        C62942bv.registerDefaultInstance(C65063j.class, jVar);
    }

    private C65063j() {
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
                return newMessageInfo(f176192d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", C65061h.class, C45240c.f118157a});
            case 3:
                return new C65063j();
            case 4:
                return new C65062i();
            case 5:
                return f176192d;
            case 6:
                C63010eb ebVar = f176193e;
                if (ebVar == null) {
                    synchronized (C65063j.class) {
                        ebVar = f176193e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176192d);
                            f176193e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
