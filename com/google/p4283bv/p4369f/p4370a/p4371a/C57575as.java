package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.bv.f.a.a.as */
/* compiled from: PG */
public final class C57575as extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57575as f153817b;

    /* renamed from: d */
    private static volatile C63010eb f153818d;

    /* renamed from: a */
    public C62971cq f153819a = emptyProtobufList();

    /* renamed from: c */
    private byte f153820c = 2;

    static {
        C57575as asVar = new C57575as();
        f153817b = asVar;
        C62942bv.registerDefaultInstance(C57575as.class, asVar);
    }

    private C57575as() {
        C63088z zVar = C63088z.f170246b;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153820c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153820c = b;
                return null;
            case 2:
                return newMessageInfo(f153817b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C57578av.class});
            case 3:
                return new C57575as();
            case 4:
                return new C57574ar();
            case 5:
                return f153817b;
            case 6:
                C63010eb ebVar = f153818d;
                if (ebVar == null) {
                    synchronized (C57575as.class) {
                        ebVar = f153818d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153817b);
                            f153818d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
