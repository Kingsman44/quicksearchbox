package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.f.a.a.b */
/* compiled from: PG */
public final class C57583b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C57583b f153841e;

    /* renamed from: g */
    private static volatile C63010eb f153842g;

    /* renamed from: a */
    public C57601br f153843a;

    /* renamed from: b */
    public C57566aj f153844b;

    /* renamed from: c */
    public C62971cq f153845c = emptyProtobufList();

    /* renamed from: d */
    public int f153846d;

    /* renamed from: f */
    private byte f153847f = 2;

    static {
        C57583b bVar = new C57583b();
        f153841e = bVar;
        C62942bv.registerDefaultInstance(C57583b.class, bVar);
    }

    private C57583b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153847f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153847f = b;
                return null;
            case 2:
                return newMessageInfo(f153841e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0001\u0001\t\u0002\t\u0003Л\u0004\f", new Object[]{"a", "b", C45240c.f118157a, C57569am.class, "d"});
            case 3:
                return new C57583b();
            case 4:
                return new C57531a();
            case 5:
                return f153841e;
            case 6:
                C63010eb ebVar = f153842g;
                if (ebVar == null) {
                    synchronized (C57583b.class) {
                        ebVar = f153842g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153841e);
                            f153842g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
