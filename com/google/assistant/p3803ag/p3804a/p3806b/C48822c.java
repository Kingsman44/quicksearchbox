package com.google.assistant.p3803ag.p3804a.p3806b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4479cg.C58072d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.a.b.c */
/* compiled from: PG */
public final class C48822c extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C48822c f126316e;

    /* renamed from: f */
    private static volatile C63010eb f126317f;

    /* renamed from: a */
    public int f126318a;

    /* renamed from: b */
    public C58072d f126319b;

    /* renamed from: c */
    public int f126320c;

    /* renamed from: d */
    public C62971cq f126321d = emptyProtobufList();

    static {
        C48822c cVar = new C48822c();
        f126316e = cVar;
        C62942bv.registerDefaultInstance(C48822c.class, cVar);
    }

    private C48822c() {
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
                return newMessageInfo(f126316e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002င\u0001\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", C48832m.class});
            case 3:
                return new C48822c();
            case 4:
                return new C48821b();
            case 5:
                return f126316e;
            case 6:
                C63010eb ebVar = f126317f;
                if (ebVar == null) {
                    synchronized (C48822c.class) {
                        ebVar = f126317f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126316e);
                            f126317f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
