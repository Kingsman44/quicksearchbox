package com.google.assistant.p3803ag.p3809c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4479cg.C58079k;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.bu */
/* compiled from: PG */
public final class C48974bu extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48974bu f126695d;

    /* renamed from: e */
    private static volatile C63010eb f126696e;

    /* renamed from: a */
    public int f126697a;

    /* renamed from: b */
    public C58079k f126698b;

    /* renamed from: c */
    public long f126699c = 50;

    static {
        C48974bu buVar = new C48974bu();
        f126695d = buVar;
        C62942bv.registerDefaultInstance(C48974bu.class, buVar);
    }

    private C48974bu() {
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
                return newMessageInfo(f126695d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C48974bu();
            case 4:
                return new C48973bt();
            case 5:
                return f126695d;
            case 6:
                C63010eb ebVar = f126696e;
                if (ebVar == null) {
                    synchronized (C48974bu.class) {
                        ebVar = f126696e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126695d);
                            f126696e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
