package com.google.p4129b.p4130a.p4131a.p4132a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.a.a.a.bp */
/* compiled from: PG */
public final class C54699bp extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54699bp f143576d;

    /* renamed from: e */
    private static volatile C63010eb f143577e;

    /* renamed from: a */
    public int f143578a = 0;

    /* renamed from: b */
    public Object f143579b;

    /* renamed from: c */
    public int f143580c;

    static {
        C54699bp bpVar = new C54699bp();
        f143576d = bpVar;
        C62942bv.registerDefaultInstance(C54699bp.class, bpVar);
    }

    private C54699bp() {
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
                return newMessageInfo(f143576d, "\u0000\u0004\u0001\u0000\u0001\u0006\u0004\u0000\u0000\u0000\u0001\f\u0004?\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"b", "a", C45240c.f118157a, C54740z.class, C54683b.class});
            case 3:
                return new C54699bp();
            case 4:
                return new C54698bo();
            case 5:
                return f143576d;
            case 6:
                C63010eb ebVar = f143577e;
                if (ebVar == null) {
                    synchronized (C54699bp.class) {
                        ebVar = f143577e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143576d);
                            f143577e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
