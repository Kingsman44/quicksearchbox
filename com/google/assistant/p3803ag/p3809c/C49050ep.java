package com.google.assistant.p3803ag.p3809c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.ep */
/* compiled from: PG */
public final class C49050ep extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49050ep f126859d;

    /* renamed from: f */
    private static volatile C63010eb f126860f;

    /* renamed from: a */
    public int f126861a;

    /* renamed from: b */
    public C49046el f126862b;

    /* renamed from: c */
    public C62971cq f126863c = emptyProtobufList();

    /* renamed from: e */
    private int f126864e;

    static {
        C49050ep epVar = new C49050ep();
        f126859d = epVar;
        C62942bv.registerDefaultInstance(C49050ep.class, epVar);
    }

    private C49050ep() {
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
                return newMessageInfo(f126859d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"e", "a", "b", C45240c.f118157a, C49049eo.class});
            case 3:
                return new C49050ep();
            case 4:
                return new C49047em();
            case 5:
                return f126859d;
            case 6:
                C63010eb ebVar = f126860f;
                if (ebVar == null) {
                    synchronized (C49050ep.class) {
                        ebVar = f126860f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126859d);
                            f126860f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
