package com.google.assistant.p3860as;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.as.bx */
/* compiled from: PG */
public final class C49788bx extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C49788bx f128567a;

    /* renamed from: e */
    private static volatile C63010eb f128568e;

    /* renamed from: b */
    private int f128569b;

    /* renamed from: c */
    private C49786bv f128570c;

    /* renamed from: d */
    private byte f128571d = 2;

    static {
        C49788bx bxVar = new C49788bx();
        f128567a = bxVar;
        C62942bv.registerDefaultInstance(C49788bx.class, bxVar);
    }

    private C49788bx() {
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f128571d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f128571d = b;
                return null;
            case 2:
                return newMessageInfo(f128567a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0001", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C49788bx();
            case 4:
                return new C49787bw();
            case 5:
                return f128567a;
            case 6:
                C63010eb ebVar = f128568e;
                if (ebVar == null) {
                    synchronized (C49788bx.class) {
                        ebVar = f128568e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128567a);
                            f128568e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
