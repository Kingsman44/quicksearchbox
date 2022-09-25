package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.bq */
/* compiled from: PG */
public final class C53107bq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53107bq f139172c;

    /* renamed from: d */
    private static volatile C63010eb f139173d;

    /* renamed from: a */
    public int f139174a = 0;

    /* renamed from: b */
    public Object f139175b;

    static {
        C53107bq bqVar = new C53107bq();
        f139172c = bqVar;
        C62942bv.registerDefaultInstance(C53107bq.class, bqVar);
    }

    private C53107bq() {
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
                return newMessageInfo(f139172c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"b", "a", C53106bp.class});
            case 3:
                return new C53107bq();
            case 4:
                return new C53098bh();
            case 5:
                return f139172c;
            case 6:
                C63010eb ebVar = f139173d;
                if (ebVar == null) {
                    synchronized (C53107bq.class) {
                        ebVar = f139173d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139172c);
                            f139173d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
