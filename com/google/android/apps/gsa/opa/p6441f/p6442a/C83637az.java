package com.google.android.apps.gsa.opa.p6441f.p6442a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.f.a.az */
/* compiled from: PG */
public final class C83637az extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C83637az f228001a;

    /* renamed from: b */
    private static volatile C63010eb f228002b;

    static {
        C83637az azVar = new C83637az();
        f228001a = azVar;
        C62942bv.registerDefaultInstance(C83637az.class, azVar);
    }

    private C83637az() {
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
                return newMessageInfo(f228001a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C83637az();
            case 4:
                return new C83636ay();
            case 5:
                return f228001a;
            case 6:
                C63010eb ebVar = f228002b;
                if (ebVar == null) {
                    synchronized (C83637az.class) {
                        ebVar = f228002b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228001a);
                            f228002b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
