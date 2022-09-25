package com.google.protos.youtube.elements.p5166b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.b.ad */
/* compiled from: PG */
public final class C66070ad extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66070ad f179668b;

    /* renamed from: c */
    private static volatile C63010eb f179669c;

    /* renamed from: a */
    public C62971cq f179670a = emptyProtobufList();

    static {
        C66070ad adVar = new C66070ad();
        f179668b = adVar;
        C62942bv.registerDefaultInstance(C66070ad.class, adVar);
    }

    private C66070ad() {
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
                return newMessageInfo(f179668b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C66101f.class});
            case 3:
                return new C66070ad();
            case 4:
                return new C66069ac();
            case 5:
                return f179668b;
            case 6:
                C63010eb ebVar = f179669c;
                if (ebVar == null) {
                    synchronized (C66070ad.class) {
                        ebVar = f179669c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179668b);
                            f179669c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
