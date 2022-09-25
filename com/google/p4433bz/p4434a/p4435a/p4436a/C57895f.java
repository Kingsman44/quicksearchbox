package com.google.p4433bz.p4434a.p4435a.p4436a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bz.a.a.a.f */
/* compiled from: PG */
public final class C57895f extends C62937bq implements C62938br {

    /* renamed from: b */
    public static final C57895f f154863b;

    /* renamed from: d */
    private static volatile C63010eb f154864d;

    /* renamed from: a */
    public C62971cq f154865a = emptyProtobufList();

    /* renamed from: c */
    private byte f154866c = 2;

    static {
        C57895f fVar = new C57895f();
        f154863b = fVar;
        C62942bv.registerDefaultInstance(C57895f.class, fVar);
    }

    private C57895f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f154866c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f154866c = b;
                return null;
            case 2:
                return newMessageInfo(f154863b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C57893d.class});
            case 3:
                return new C57895f();
            case 4:
                return new C57894e();
            case 5:
                return f154863b;
            case 6:
                C63010eb ebVar = f154864d;
                if (ebVar == null) {
                    synchronized (C57895f.class) {
                        ebVar = f154864d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154863b);
                            f154864d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
