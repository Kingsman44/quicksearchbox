package com.google.assistant.p3803ag.p3807b.p3808a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.b.a.j */
/* compiled from: PG */
public final class C48908j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48908j f126561c;

    /* renamed from: d */
    private static volatile C63010eb f126562d;

    /* renamed from: a */
    public int f126563a;

    /* renamed from: b */
    public int f126564b = 1;

    static {
        C48908j jVar = new C48908j();
        f126561c = jVar;
        C62942bv.registerDefaultInstance(C48908j.class, jVar);
    }

    private C48908j() {
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
                return newMessageInfo(f126561c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C48906h.m85304b()});
            case 3:
                return new C48908j();
            case 4:
                return new C48907i();
            case 5:
                return f126561c;
            case 6:
                C63010eb ebVar = f126562d;
                if (ebVar == null) {
                    synchronized (C48908j.class) {
                        ebVar = f126562d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126561c);
                            f126562d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
