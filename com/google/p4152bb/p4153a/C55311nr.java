package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.nr */
/* compiled from: PG */
public final class C55311nr extends C62937bq implements C62938br {

    /* renamed from: b */
    public static final C55311nr f145714b;

    /* renamed from: d */
    private static volatile C63010eb f145715d;

    /* renamed from: a */
    public C62971cq f145716a = emptyProtobufList();

    /* renamed from: c */
    private byte f145717c = 2;

    static {
        C55311nr nrVar = new C55311nr();
        f145714b = nrVar;
        C62942bv.registerDefaultInstance(C55311nr.class, nrVar);
    }

    private C55311nr() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145717c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145717c = b;
                return null;
            case 2:
                return newMessageInfo(f145714b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C55365pr.class});
            case 3:
                return new C55311nr();
            case 4:
                return new C55310nq();
            case 5:
                return f145714b;
            case 6:
                C63010eb ebVar = f145715d;
                if (ebVar == null) {
                    synchronized (C55311nr.class) {
                        ebVar = f145715d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145714b);
                            f145715d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
