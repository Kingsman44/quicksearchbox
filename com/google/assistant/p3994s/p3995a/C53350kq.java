package com.google.assistant.p3994s.p3995a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4816ai.p4818b.C63204j;

/* renamed from: com.google.assistant.s.a.kq */
/* compiled from: PG */
public final class C53350kq extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C53350kq f139991e;

    /* renamed from: g */
    private static volatile C63010eb f139992g;

    /* renamed from: a */
    public int f139993a;

    /* renamed from: b */
    public C62971cq f139994b = emptyProtobufList();

    /* renamed from: c */
    public C53118ca f139995c;

    /* renamed from: d */
    public C63204j f139996d;

    /* renamed from: f */
    private byte f139997f = 2;

    static {
        C53350kq kqVar = new C53350kq();
        f139991e = kqVar;
        C62942bv.registerDefaultInstance(C53350kq.class, kqVar);
    }

    private C53350kq() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139997f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f139997f = b;
                return null;
            case 2:
                return newMessageInfo(f139991e, "\u0001\u0003\u0000\u0001\u0001\u0011\u0003\u0000\u0001\u0003\u0001Л\u0002ᐉ\u0000\u0011ᐉ\u0001", new Object[]{"a", "b", C53354ku.class, C45240c.f118157a, "d"});
            case 3:
                return new C53350kq();
            case 4:
                return new C53349kp();
            case 5:
                return f139991e;
            case 6:
                C63010eb ebVar = f139992g;
                if (ebVar == null) {
                    synchronized (C53350kq.class) {
                        ebVar = f139992g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139991e);
                            f139992g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
