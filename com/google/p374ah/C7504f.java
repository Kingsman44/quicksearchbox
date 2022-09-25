package com.google.p374ah;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ah.f */
/* compiled from: PG */
public final class C7504f extends C62937bq implements C62938br {

    /* renamed from: b */
    public static final C7504f f24723b;

    /* renamed from: d */
    private static volatile C63010eb f24724d;

    /* renamed from: a */
    public C62971cq f24725a = emptyProtobufList();

    /* renamed from: c */
    private byte f24726c = 2;

    static {
        C7504f fVar = new C7504f();
        f24723b = fVar;
        C62942bv.registerDefaultInstance(C7504f.class, fVar);
    }

    private C7504f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f24726c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f24726c = b;
                return null;
            case 2:
                return newMessageInfo(f24723b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"a", C7502d.class});
            case 3:
                return new C7504f();
            case 4:
                return new C7503e();
            case 5:
                return f24723b;
            case 6:
                C63010eb ebVar = f24724d;
                if (ebVar == null) {
                    synchronized (C7504f.class) {
                        ebVar = f24724d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f24723b);
                            f24724d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
