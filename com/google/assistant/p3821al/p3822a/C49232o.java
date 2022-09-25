package com.google.assistant.p3821al.p3822a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.al.a.o */
/* compiled from: PG */
public final class C49232o extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C49232o f127283a;

    /* renamed from: b */
    private static volatile C63010eb f127284b;

    static {
        C49232o oVar = new C49232o();
        f127283a = oVar;
        C62942bv.registerDefaultInstance(C49232o.class, oVar);
    }

    private C49232o() {
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
                return newMessageInfo(f127283a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C49232o();
            case 4:
                return new C49231n();
            case 5:
                return f127283a;
            case 6:
                C63010eb ebVar = f127284b;
                if (ebVar == null) {
                    synchronized (C49232o.class) {
                        ebVar = f127284b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127283a);
                            f127284b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
