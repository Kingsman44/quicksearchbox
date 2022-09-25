package com.google.assistant.p3931f.p3939c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.f.c.ac */
/* compiled from: PG */
public final class C52813ac extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52813ac f138569c;

    /* renamed from: e */
    private static volatile C63010eb f138570e;

    /* renamed from: a */
    public int f138571a = 0;

    /* renamed from: b */
    public C52849z f138572b;

    /* renamed from: d */
    private Object f138573d;

    static {
        C52813ac acVar = new C52813ac();
        f138569c = acVar;
        C62942bv.registerDefaultInstance(C52813ac.class, acVar);
    }

    private C52813ac() {
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
                return newMessageInfo(f138569c, "\u0000\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001\t\u0003<\u0000\u0004<\u0000", new Object[]{"d", "a", "b", C52812ab.class, C52812ab.class});
            case 3:
                return new C52813ac();
            case 4:
                return new C52847x();
            case 5:
                return f138569c;
            case 6:
                C63010eb ebVar = f138570e;
                if (ebVar == null) {
                    synchronized (C52813ac.class) {
                        ebVar = f138570e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138569c);
                            f138570e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
