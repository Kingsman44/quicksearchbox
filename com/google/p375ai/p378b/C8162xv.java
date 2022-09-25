package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.xv */
/* compiled from: PG */
public final class C8162xv extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8162xv f28684c;

    /* renamed from: d */
    private static volatile C63010eb f28685d;

    /* renamed from: a */
    public int f28686a;

    /* renamed from: b */
    public C8166xz f28687b;

    static {
        C8162xv xvVar = new C8162xv();
        f28684c = xvVar;
        C62942bv.registerDefaultInstance(C8162xv.class, xvVar);
    }

    private C8162xv() {
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
                return newMessageInfo(f28684c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C8162xv();
            case 4:
                return new C8161xu();
            case 5:
                return f28684c;
            case 6:
                C63010eb ebVar = f28685d;
                if (ebVar == null) {
                    synchronized (C8162xv.class) {
                        ebVar = f28685d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28684c);
                            f28685d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
