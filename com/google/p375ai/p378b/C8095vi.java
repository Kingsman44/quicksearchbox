package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.vi */
/* compiled from: PG */
public final class C8095vi extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8095vi f28467b;

    /* renamed from: d */
    private static volatile C63010eb f28468d;

    /* renamed from: a */
    public long f28469a;

    /* renamed from: c */
    private int f28470c;

    static {
        C8095vi viVar = new C8095vi();
        f28467b = viVar;
        C62942bv.registerDefaultInstance(C8095vi.class, viVar);
    }

    private C8095vi() {
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
                return newMessageInfo(f28467b, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဃ\u0003", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C8095vi();
            case 4:
                return new C8094vh();
            case 5:
                return f28467b;
            case 6:
                C63010eb ebVar = f28468d;
                if (ebVar == null) {
                    synchronized (C8095vi.class) {
                        ebVar = f28468d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28467b);
                            f28468d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
