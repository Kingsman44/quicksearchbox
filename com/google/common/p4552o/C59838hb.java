package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.hb */
/* compiled from: PG */
public final class C59838hb extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59838hb f161707d;

    /* renamed from: e */
    private static volatile C63010eb f161708e;

    /* renamed from: a */
    public C62971cq f161709a = emptyProtobufList();

    /* renamed from: b */
    public C62961ch f161710b = emptyIntList();

    /* renamed from: c */
    public C62961ch f161711c = emptyIntList();

    static {
        C59838hb hbVar = new C59838hb();
        f161707d = hbVar;
        C62942bv.registerDefaultInstance(C59838hb.class, hbVar);
    }

    private C59838hb() {
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
                return newMessageInfo(f161707d, "\u0001\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0003\u0000\u0001\u001b\u0003\u0016\u0004\u0016", new Object[]{"a", C59829gv.class, "b", C45240c.f118157a});
            case 3:
                return new C59838hb();
            case 4:
                return new C59837ha();
            case 5:
                return f161707d;
            case 6:
                C63010eb ebVar = f161708e;
                if (ebVar == null) {
                    synchronized (C59838hb.class) {
                        ebVar = f161708e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161707d);
                            f161708e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
