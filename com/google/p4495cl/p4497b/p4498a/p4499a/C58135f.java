package com.google.p4495cl.p4497b.p4498a.p4499a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.cl.b.a.a.f */
/* compiled from: PG */
public final class C58135f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C58135f f155417f;

    /* renamed from: g */
    private static volatile C63010eb f155418g;

    /* renamed from: a */
    public int f155419a;

    /* renamed from: b */
    public int f155420b;

    /* renamed from: c */
    public int f155421c;

    /* renamed from: d */
    public int f155422d;

    /* renamed from: e */
    public C62971cq f155423e = C62942bv.emptyProtobufList();

    static {
        C58135f fVar = new C58135f();
        f155417f = fVar;
        C62942bv.registerDefaultInstance(C58135f.class, fVar);
    }

    private C58135f() {
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
                return newMessageInfo(f155417f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004\u001a", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C58135f();
            case 4:
                return new C58134e();
            case 5:
                return f155417f;
            case 6:
                C63010eb ebVar = f155418g;
                if (ebVar == null) {
                    synchronized (C58135f.class) {
                        ebVar = f155418g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155417f);
                            f155418g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
