package com.google.p3562ao.p3563a.p3568d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ao.a.d.az */
/* compiled from: PG */
public final class C45555az extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C45555az f119055a;

    /* renamed from: b */
    private static volatile C63010eb f119056b;

    static {
        C45555az azVar = new C45555az();
        f119055a = azVar;
        C62942bv.registerDefaultInstance(C45555az.class, azVar);
    }

    private C45555az() {
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
                return newMessageInfo(f119055a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C45555az();
            case 4:
                return new C45554ay();
            case 5:
                return f119055a;
            case 6:
                C63010eb ebVar = f119056b;
                if (ebVar == null) {
                    synchronized (C45555az.class) {
                        ebVar = f119056b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f119055a);
                            f119056b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
