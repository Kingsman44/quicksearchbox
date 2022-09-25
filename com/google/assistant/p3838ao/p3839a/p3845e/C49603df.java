package com.google.assistant.p3838ao.p3839a.p3845e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ao.a.e.df */
/* compiled from: PG */
public final class C49603df extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49603df f128003c;

    /* renamed from: d */
    private static volatile C63010eb f128004d;

    /* renamed from: a */
    public C62971cq f128005a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public boolean f128006b;

    static {
        C49603df dfVar = new C49603df();
        f128003c = dfVar;
        C62942bv.registerDefaultInstance(C49603df.class, dfVar);
    }

    private C49603df() {
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
                return newMessageInfo(f128003c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002\u0007", new Object[]{"a", "b"});
            case 3:
                return new C49603df();
            case 4:
                return new C49602de();
            case 5:
                return f128003c;
            case 6:
                C63010eb ebVar = f128004d;
                if (ebVar == null) {
                    synchronized (C49603df.class) {
                        ebVar = f128004d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128003c);
                            f128004d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
