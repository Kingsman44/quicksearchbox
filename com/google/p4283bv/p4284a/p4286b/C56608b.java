package com.google.p4283bv.p4284a.p4286b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p337aa.C6619f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.a.b.b */
/* compiled from: PG */
public final class C56608b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56608b f151135d;

    /* renamed from: e */
    private static volatile C63010eb f151136e;

    /* renamed from: a */
    public int f151137a;

    /* renamed from: b */
    public long f151138b;

    /* renamed from: c */
    public C62971cq f151139c = emptyProtobufList();

    static {
        C56608b bVar = new C56608b();
        f151135d = bVar;
        C62942bv.registerDefaultInstance(C56608b.class, bVar);
    }

    private C56608b() {
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
                return newMessageInfo(f151135d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b", new Object[]{"a", "b", C45240c.f118157a, C6619f.class});
            case 3:
                return new C56608b();
            case 4:
                return new C56607a();
            case 5:
                return f151135d;
            case 6:
                C63010eb ebVar = f151136e;
                if (ebVar == null) {
                    synchronized (C56608b.class) {
                        ebVar = f151136e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151135d);
                            f151136e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
