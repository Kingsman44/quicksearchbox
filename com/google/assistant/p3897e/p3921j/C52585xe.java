package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.assistant.e.j.xe */
/* compiled from: PG */
public final class C52585xe extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52585xe f138079d;

    /* renamed from: e */
    private static volatile C63010eb f138080e;

    /* renamed from: a */
    public int f138081a;

    /* renamed from: b */
    public C52589xi f138082b;

    /* renamed from: c */
    public C52587xg f138083c;

    static {
        C52585xe xeVar = new C52585xe();
        f138079d = xeVar;
        C62942bv.registerDefaultInstance(C52585xe.class, xeVar);
    }

    private C52585xe() {
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
                return newMessageInfo(f138079d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C52585xe();
            case 4:
                return new C52584xd();
            case 5:
                return f138079d;
            case 6:
                C63010eb ebVar = f138080e;
                if (ebVar == null) {
                    synchronized (C52585xe.class) {
                        ebVar = f138080e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138079d);
                            f138080e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
