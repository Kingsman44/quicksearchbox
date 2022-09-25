package com.google.assistant.p3825an.p3830c.p3831a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.c.a.e */
/* compiled from: PG */
public final class C49328e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49328e f127484c;

    /* renamed from: d */
    private static volatile C63010eb f127485d;

    /* renamed from: a */
    public int f127486a;

    /* renamed from: b */
    public C49285bd f127487b;

    static {
        C49328e eVar = new C49328e();
        f127484c = eVar;
        C62942bv.registerDefaultInstance(C49328e.class, eVar);
    }

    private C49328e() {
        emptyProtobufList();
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
                return newMessageInfo(f127484c, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဉ\u0003", new Object[]{"a", "b"});
            case 3:
                return new C49328e();
            case 4:
                return new C49327d();
            case 5:
                return f127484c;
            case 6:
                C63010eb ebVar = f127485d;
                if (ebVar == null) {
                    synchronized (C49328e.class) {
                        ebVar = f127485d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127484c);
                            f127485d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
