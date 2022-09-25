package com.google.assistant.p3838ao.p3839a.p3845e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ao.a.e.dj */
/* compiled from: PG */
public final class C49607dj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49607dj f128013c;

    /* renamed from: e */
    private static volatile C63010eb f128014e;

    /* renamed from: a */
    public int f128015a;

    /* renamed from: b */
    public C62971cq f128016b = emptyProtobufList();

    /* renamed from: d */
    private int f128017d;

    static {
        C49607dj djVar = new C49607dj();
        f128013c = djVar;
        C62942bv.registerDefaultInstance(C49607dj.class, djVar);
    }

    private C49607dj() {
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
                return newMessageInfo(f128013c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"d", "a", C49586cp.f127958a, "b", C49606di.class});
            case 3:
                return new C49607dj();
            case 4:
                return new C49604dg();
            case 5:
                return f128013c;
            case 6:
                C63010eb ebVar = f128014e;
                if (ebVar == null) {
                    synchronized (C49607dj.class) {
                        ebVar = f128014e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128013c);
                            f128014e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
