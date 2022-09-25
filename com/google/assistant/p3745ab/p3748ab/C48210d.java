package com.google.assistant.p3745ab.p3748ab;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.ab.d */
/* compiled from: PG */
public final class C48210d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48210d f124741a;

    /* renamed from: b */
    private static volatile C63010eb f124742b;

    static {
        C48210d dVar = new C48210d();
        f124741a = dVar;
        C62942bv.registerDefaultInstance(C48210d.class, dVar);
    }

    private C48210d() {
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
                return newMessageInfo(f124741a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48210d();
            case 4:
                return new C48209c();
            case 5:
                return f124741a;
            case 6:
                C63010eb ebVar = f124742b;
                if (ebVar == null) {
                    synchronized (C48210d.class) {
                        ebVar = f124742b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124741a);
                            f124742b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
