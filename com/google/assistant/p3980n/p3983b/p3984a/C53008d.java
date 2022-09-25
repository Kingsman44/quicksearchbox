package com.google.assistant.p3980n.p3983b.p3984a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.n.b.a.d */
/* compiled from: PG */
public final class C53008d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53008d f138949a;

    /* renamed from: b */
    private static volatile C63010eb f138950b;

    static {
        C53008d dVar = new C53008d();
        f138949a = dVar;
        C62942bv.registerDefaultInstance(C53008d.class, dVar);
    }

    private C53008d() {
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
                return newMessageInfo(f138949a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53008d();
            case 4:
                return new C53007c();
            case 5:
                return f138949a;
            case 6:
                C63010eb ebVar = f138950b;
                if (ebVar == null) {
                    synchronized (C53008d.class) {
                        ebVar = f138950b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138949a);
                            f138950b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
