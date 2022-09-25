package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.apx */
/* compiled from: PG */
public final class apx extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final apx f159707d;

    /* renamed from: e */
    private static volatile C63010eb f159708e;

    /* renamed from: a */
    public int f159709a;

    /* renamed from: b */
    public int f159710b;

    /* renamed from: c */
    public C62971cq f159711c = C62942bv.emptyProtobufList();

    static {
        apx apx = new apx();
        f159707d = apx;
        C62942bv.registerDefaultInstance(apx.class, apx);
    }

    private apx() {
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
                return newMessageInfo(f159707d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001င\u0000\u0003\u001a", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new apx();
            case 4:
                return new apw();
            case 5:
                return f159707d;
            case 6:
                C63010eb ebVar = f159708e;
                if (ebVar == null) {
                    synchronized (apx.class) {
                        ebVar = f159708e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159707d);
                            f159708e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
