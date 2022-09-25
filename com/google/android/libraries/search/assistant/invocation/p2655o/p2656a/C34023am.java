package com.google.android.libraries.search.assistant.invocation.p2655o.p2656a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.a.am */
/* compiled from: PG */
public final class C34023am extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62962ci f90675b = new C34021ak();

    /* renamed from: d */
    public static final C34023am f90676d;

    /* renamed from: e */
    private static volatile C63010eb f90677e;

    /* renamed from: a */
    public C62961ch f90678a = emptyIntList();

    /* renamed from: c */
    public C62971cq f90679c = emptyProtobufList();

    static {
        C34023am amVar = new C34023am();
        f90676d = amVar;
        C62942bv.registerDefaultInstance(C34023am.class, amVar);
    }

    private C34023am() {
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
                return newMessageInfo(f90676d, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001e\u0002\u001b", new Object[]{"a", C34043bf.m62693b(), C45240c.f118157a, C34029as.class});
            case 3:
                return new C34023am();
            case 4:
                return new C34022al();
            case 5:
                return f90676d;
            case 6:
                C63010eb ebVar = f90677e;
                if (ebVar == null) {
                    synchronized (C34023am.class) {
                        ebVar = f90677e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90676d);
                            f90677e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
