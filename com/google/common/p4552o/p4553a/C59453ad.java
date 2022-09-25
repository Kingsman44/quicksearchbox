package com.google.common.p4552o.p4553a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.ad */
/* compiled from: PG */
public final class C59453ad extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59453ad f157711c;

    /* renamed from: d */
    private static volatile C63010eb f157712d;

    /* renamed from: a */
    public C62971cq f157713a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f157714b = emptyProtobufList();

    static {
        C59453ad adVar = new C59453ad();
        f157711c = adVar;
        C62942bv.registerDefaultInstance(C59453ad.class, adVar);
    }

    private C59453ad() {
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
                return newMessageInfo(f157711c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", C59455af.class, "b", C59465ap.class});
            case 3:
                return new C59453ad();
            case 4:
                return new C59452ac();
            case 5:
                return f157711c;
            case 6:
                C63010eb ebVar = f157712d;
                if (ebVar == null) {
                    synchronized (C59453ad.class) {
                        ebVar = f157712d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157711c);
                            f157712d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
