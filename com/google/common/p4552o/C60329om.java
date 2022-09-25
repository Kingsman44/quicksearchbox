package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.om */
/* compiled from: PG */
public final class C60329om extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C60329om f163263e;

    /* renamed from: f */
    private static volatile C63010eb f163264f;

    /* renamed from: a */
    public C62971cq f163265a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f163266b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f163267c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f163268d = emptyProtobufList();

    static {
        C60329om omVar = new C60329om();
        f163263e = omVar;
        C62942bv.registerDefaultInstance(C60329om.class, omVar);
    }

    private C60329om() {
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
                return newMessageInfo(f163263e, "\u0001\u0004\u0000\u0000\u0002\t\u0004\u0000\u0004\u0000\u0002\u001b\u0003\u001b\u0004\u001b\t\u001b", new Object[]{"a", C60333oq.class, "b", C60337ou.class, C45240c.f118157a, C60327ok.class, "d", C60339ow.class});
            case 3:
                return new C60329om();
            case 4:
                return new C60328ol();
            case 5:
                return f163263e;
            case 6:
                C63010eb ebVar = f163264f;
                if (ebVar == null) {
                    synchronized (C60329om.class) {
                        ebVar = f163264f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163263e);
                            f163264f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
