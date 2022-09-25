package com.google.p427am.p438d.p439a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.d.a.dt */
/* compiled from: PG */
public final class C8800dt extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8800dt f30177b;

    /* renamed from: c */
    private static volatile C63010eb f30178c;

    /* renamed from: a */
    public C62971cq f30179a = emptyProtobufList();

    static {
        C8800dt dtVar = new C8800dt();
        f30177b = dtVar;
        C62942bv.registerDefaultInstance(C8800dt.class, dtVar);
    }

    private C8800dt() {
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
                return newMessageInfo(f30177b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C8775cv.class});
            case 3:
                return new C8800dt();
            case 4:
                return new C8799ds();
            case 5:
                return f30177b;
            case 6:
                C63010eb ebVar = f30178c;
                if (ebVar == null) {
                    synchronized (C8800dt.class) {
                        ebVar = f30178c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30177b);
                            f30178c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
