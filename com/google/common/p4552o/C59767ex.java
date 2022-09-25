package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ex */
/* compiled from: PG */
public final class C59767ex extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59767ex f161487d;

    /* renamed from: f */
    private static volatile C63010eb f161488f;

    /* renamed from: a */
    public long f161489a;

    /* renamed from: b */
    public long f161490b;

    /* renamed from: c */
    public C59769ez f161491c;

    /* renamed from: e */
    private int f161492e;

    static {
        C59767ex exVar = new C59767ex();
        f161487d = exVar;
        C62942bv.registerDefaultInstance(C59767ex.class, exVar);
    }

    private C59767ex() {
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
                return newMessageInfo(f161487d, "\u0001\u0003\u0000\u0001\u0006\b\u0003\u0000\u0000\u0000\u0006ဉ\u0002\u0007ဂ\u0000\bဂ\u0001", new Object[]{"e", C45240c.f118157a, "a", "b"});
            case 3:
                return new C59767ex();
            case 4:
                return new C59766ew();
            case 5:
                return f161487d;
            case 6:
                C63010eb ebVar = f161488f;
                if (ebVar == null) {
                    synchronized (C59767ex.class) {
                        ebVar = f161488f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161487d);
                            f161488f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
