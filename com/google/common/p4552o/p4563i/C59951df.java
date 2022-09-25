package com.google.common.p4552o.p4563i;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.df */
/* compiled from: PG */
public final class C59951df extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C59951df f162026e;

    /* renamed from: f */
    private static volatile C63010eb f162027f;

    /* renamed from: a */
    public int f162028a;

    /* renamed from: b */
    public C59947db f162029b;

    /* renamed from: c */
    public C62971cq f162030c = emptyProtobufList();

    /* renamed from: d */
    public boolean f162031d;

    static {
        C59951df dfVar = new C59951df();
        f162026e = dfVar;
        C62942bv.registerDefaultInstance(C59951df.class, dfVar);
    }

    private C59951df() {
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
                return newMessageInfo(f162026e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a, C59949dd.class, "d"});
            case 3:
                return new C59951df();
            case 4:
                return new C59950de();
            case 5:
                return f162026e;
            case 6:
                C63010eb ebVar = f162027f;
                if (ebVar == null) {
                    synchronized (C59951df.class) {
                        ebVar = f162027f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162026e);
                            f162027f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
