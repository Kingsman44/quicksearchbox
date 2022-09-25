package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.tb */
/* compiled from: PG */
public final class C8034tb extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C8034tb f28222f;

    /* renamed from: g */
    private static volatile C63010eb f28223g;

    /* renamed from: a */
    public int f28224a;

    /* renamed from: b */
    public int f28225b;

    /* renamed from: c */
    public int f28226c;

    /* renamed from: d */
    public int f28227d;

    /* renamed from: e */
    public int f28228e;

    static {
        C8034tb tbVar = new C8034tb();
        f28222f = tbVar;
        C62942bv.registerDefaultInstance(C8034tb.class, tbVar);
    }

    private C8034tb() {
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
                return newMessageInfo(f28222f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C8034tb();
            case 4:
                return new C8033ta();
            case 5:
                return f28222f;
            case 6:
                C63010eb ebVar = f28223g;
                if (ebVar == null) {
                    synchronized (C8034tb.class) {
                        ebVar = f28223g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28222f);
                            f28223g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
