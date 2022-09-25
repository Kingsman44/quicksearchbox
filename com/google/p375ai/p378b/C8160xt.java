package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.xt */
/* compiled from: PG */
public final class C8160xt extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C8160xt f28679a;

    /* renamed from: e */
    private static volatile C63010eb f28680e;

    /* renamed from: b */
    private int f28681b;

    /* renamed from: c */
    private C7744ii f28682c;

    /* renamed from: d */
    private byte f28683d = 2;

    static {
        C8160xt xtVar = new C8160xt();
        f28679a = xtVar;
        C62942bv.registerDefaultInstance(C8160xt.class, xtVar);
    }

    private C8160xt() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28683d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28683d = b;
                return null;
            case 2:
                return newMessageInfo(f28679a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C8160xt();
            case 4:
                return new C8159xs();
            case 5:
                return f28679a;
            case 6:
                C63010eb ebVar = f28680e;
                if (ebVar == null) {
                    synchronized (C8160xt.class) {
                        ebVar = f28680e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28679a);
                            f28680e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
