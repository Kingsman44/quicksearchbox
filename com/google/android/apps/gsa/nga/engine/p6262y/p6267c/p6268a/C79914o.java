package com.google.android.apps.gsa.nga.engine.p6262y.p6267c.p6268a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.c.a.o */
/* compiled from: PG */
public final class C79914o extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C79914o f219046b;

    /* renamed from: c */
    private static volatile C63010eb f219047c;

    /* renamed from: a */
    public C62971cq f219048a = emptyProtobufList();

    static {
        C79914o oVar = new C79914o();
        f219046b = oVar;
        C62942bv.registerDefaultInstance(C79914o.class, oVar);
    }

    private C79914o() {
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
                return newMessageInfo(f219046b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C79918s.class});
            case 3:
                return new C79914o();
            case 4:
                return new C79913n();
            case 5:
                return f219046b;
            case 6:
                C63010eb ebVar = f219047c;
                if (ebVar == null) {
                    synchronized (C79914o.class) {
                        ebVar = f219047c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219046b);
                            f219047c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
