package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.qr */
/* compiled from: PG */
public final class C7969qr extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C7969qr f27993b;

    /* renamed from: d */
    private static volatile C63010eb f27994d;

    /* renamed from: a */
    public C62971cq f27995a = emptyProtobufList();

    /* renamed from: c */
    private byte f27996c = 2;

    static {
        C7969qr qrVar = new C7969qr();
        f27993b = qrVar;
        C62942bv.registerDefaultInstance(C7969qr.class, qrVar);
    }

    private C7969qr() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27996c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f27996c = b;
                return null;
            case 2:
                return newMessageInfo(f27993b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C7965qn.class});
            case 3:
                return new C7969qr();
            case 4:
                return new C7968qq();
            case 5:
                return f27993b;
            case 6:
                C63010eb ebVar = f27994d;
                if (ebVar == null) {
                    synchronized (C7969qr.class) {
                        ebVar = f27994d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27993b);
                            f27994d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
