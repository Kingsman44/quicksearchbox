package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ej */
/* compiled from: PG */
public final class C59753ej extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C59753ej f161449e;

    /* renamed from: f */
    private static volatile C63010eb f161450f;

    /* renamed from: a */
    public int f161451a;

    /* renamed from: b */
    public int f161452b;

    /* renamed from: c */
    public C62971cq f161453c = emptyProtobufList();

    /* renamed from: d */
    public boolean f161454d;

    static {
        C59753ej ejVar = new C59753ej();
        f161449e = ejVar;
        C62942bv.registerDefaultInstance(C59753ej.class, ejVar);
    }

    private C59753ej() {
    }

    /* renamed from: a */
    public final void mo57054a() {
        C62971cq cqVar = this.f161453c;
        if (!cqVar.mo58948c()) {
            this.f161453c = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f161449e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a, C59755el.class, "d"});
            case 3:
                return new C59753ej();
            case 4:
                return new C59752ei();
            case 5:
                return f161449e;
            case 6:
                C63010eb ebVar = f161450f;
                if (ebVar == null) {
                    synchronized (C59753ej.class) {
                        ebVar = f161450f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161449e);
                            f161450f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
