package com.google.assistant.p3957l.p3967d.p3968a.p3969a;

import com.google.assistant.p3957l.p3967d.p3968a.p3970b.C52980b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.l.d.a.a.d */
/* compiled from: PG */
public final class C52978d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52978d f138884c;

    /* renamed from: d */
    private static volatile C63010eb f138885d;

    /* renamed from: a */
    public int f138886a = 0;

    /* renamed from: b */
    public Object f138887b;

    static {
        C52978d dVar = new C52978d();
        f138884c = dVar;
        C62942bv.registerDefaultInstance(C52978d.class, dVar);
    }

    private C52978d() {
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
                return newMessageInfo(f138884c, "\u0001\u0002\u0001\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", C52977c.class, C52980b.class});
            case 3:
                return new C52978d();
            case 4:
                return new C52975a();
            case 5:
                return f138884c;
            case 6:
                C63010eb ebVar = f138885d;
                if (ebVar == null) {
                    synchronized (C52978d.class) {
                        ebVar = f138885d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138884c);
                            f138885d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
