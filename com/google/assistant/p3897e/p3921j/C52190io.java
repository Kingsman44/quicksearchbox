package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.io */
/* compiled from: PG */
public final class C52190io extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52190io f136978d;

    /* renamed from: e */
    private static volatile C63010eb f136979e;

    /* renamed from: a */
    public int f136980a;

    /* renamed from: b */
    public C52159hk f136981b;

    /* renamed from: c */
    public long f136982c;

    static {
        C52190io ioVar = new C52190io();
        f136978d = ioVar;
        C62942bv.registerDefaultInstance(C52190io.class, ioVar);
    }

    private C52190io() {
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
                return newMessageInfo(f136978d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဂ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C52190io();
            case 4:
                return new C52189in();
            case 5:
                return f136978d;
            case 6:
                C63010eb ebVar = f136979e;
                if (ebVar == null) {
                    synchronized (C52190io.class) {
                        ebVar = f136979e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136978d);
                            f136979e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
