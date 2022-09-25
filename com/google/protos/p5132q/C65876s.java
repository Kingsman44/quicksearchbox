package com.google.protos.p5132q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.q.s */
/* compiled from: PG */
public final class C65876s extends C62937bq implements C62938br {

    /* renamed from: b */
    public static final C65876s f179093b;

    /* renamed from: d */
    private static volatile C63010eb f179094d;

    /* renamed from: a */
    public C62971cq f179095a = emptyProtobufList();

    /* renamed from: c */
    private byte f179096c = 2;

    static {
        C65876s sVar = new C65876s();
        f179093b = sVar;
        C62942bv.registerDefaultInstance(C65876s.class, sVar);
    }

    private C65876s() {
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179096c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f179096c = b;
                return null;
            case 2:
                return newMessageInfo(f179093b, "\u0001\u0001\u0000\u0000\u0007\u0007\u0001\u0000\u0001\u0001\u0007Л", new Object[]{"a", C65874q.class});
            case 3:
                return new C65876s();
            case 4:
                return new C65875r();
            case 5:
                return f179093b;
            case 6:
                C63010eb ebVar = f179094d;
                if (ebVar == null) {
                    synchronized (C65876s.class) {
                        ebVar = f179094d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179093b);
                            f179094d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
