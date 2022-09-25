package com.google.p335a.p336a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.a.a.h */
/* compiled from: PG */
public final class C6586h extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C6586h f19580e;

    /* renamed from: f */
    private static volatile C63010eb f19581f;

    /* renamed from: a */
    public C62971cq f19582a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f19583b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f19584c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f19585d = emptyProtobufList();

    static {
        C6586h hVar = new C6586h();
        f19580e = hVar;
        C62942bv.registerDefaultInstance(C6586h.class, hVar);
    }

    private C6586h() {
        emptyProtobufList();
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
                return newMessageInfo(f19580e, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{"a", C6594p.class, "b", C6582d.class, C45240c.f118157a, C6588j.class, "d", C6592n.class});
            case 3:
                return new C6586h();
            case 4:
                return new C6583e();
            case 5:
                return f19580e;
            case 6:
                C63010eb ebVar = f19581f;
                if (ebVar == null) {
                    synchronized (C6586h.class) {
                        ebVar = f19581f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f19580e);
                            f19581f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
