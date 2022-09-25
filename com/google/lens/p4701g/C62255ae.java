package com.google.lens.p4701g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4963bf.p4964a.p4965a.C64603h;

/* renamed from: com.google.lens.g.ae */
/* compiled from: PG */
public final class C62255ae extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62255ae f168077e;

    /* renamed from: g */
    private static volatile C63010eb f168078g;

    /* renamed from: a */
    public int f168079a;

    /* renamed from: b */
    public C62971cq f168080b = emptyProtobufList();

    /* renamed from: c */
    public int f168081c;

    /* renamed from: d */
    public int f168082d;

    /* renamed from: f */
    private byte f168083f = 2;

    static {
        C62255ae aeVar = new C62255ae();
        f168077e = aeVar;
        C62942bv.registerDefaultInstance(C62255ae.class, aeVar);
    }

    private C62255ae() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168083f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f168083f = b;
                return null;
            case 2:
                return newMessageInfo(f168077e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001Л\u0003ဌ\u0000\u0004င\u0001", new Object[]{"a", "b", C62263am.class, C45240c.f118157a, C64603h.f175154a, "d"});
            case 3:
                return new C62255ae();
            case 4:
                return new C62254ad();
            case 5:
                return f168077e;
            case 6:
                C63010eb ebVar = f168078g;
                if (ebVar == null) {
                    synchronized (C62255ae.class) {
                        ebVar = f168078g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168077e);
                            f168078g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
