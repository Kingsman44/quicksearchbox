package com.google.android.apps.gsa.staticplugins.p7678cl.p7680b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.cl.b.ae */
/* compiled from: PG */
public final class C97879ae extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C97879ae f273293a;

    /* renamed from: b */
    private static volatile C63010eb f273294b;

    static {
        C97879ae aeVar = new C97879ae();
        f273293a = aeVar;
        C62942bv.registerDefaultInstance(C97879ae.class, aeVar);
    }

    private C97879ae() {
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
                return newMessageInfo(f273293a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C97879ae();
            case 4:
                return new C97878ad();
            case 5:
                return f273293a;
            case 6:
                C63010eb ebVar = f273294b;
                if (ebVar == null) {
                    synchronized (C97879ae.class) {
                        ebVar = f273294b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f273293a);
                            f273294b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
