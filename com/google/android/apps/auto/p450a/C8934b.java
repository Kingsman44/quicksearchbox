package com.google.android.apps.auto.p450a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.auto.a.b */
/* compiled from: PG */
public final class C8934b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8934b f30977a;

    /* renamed from: b */
    private static volatile C63010eb f30978b;

    static {
        C8934b bVar = new C8934b();
        f30977a = bVar;
        C62942bv.registerDefaultInstance(C8934b.class, bVar);
    }

    private C8934b() {
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
                return newMessageInfo(f30977a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C8934b();
            case 4:
                return new C8854a();
            case 5:
                return f30977a;
            case 6:
                C63010eb ebVar = f30978b;
                if (ebVar == null) {
                    synchronized (C8934b.class) {
                        ebVar = f30978b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30977a);
                            f30978b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
