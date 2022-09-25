package com.google.android.apps.gsa.staticplugins.p7678cl.p7680b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.cl.b.y */
/* compiled from: PG */
public final class C97935y extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C97935y f273474a;

    /* renamed from: b */
    private static volatile C63010eb f273475b;

    static {
        C97935y yVar = new C97935y();
        f273474a = yVar;
        C62942bv.registerDefaultInstance(C97935y.class, yVar);
    }

    private C97935y() {
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
                return newMessageInfo(f273474a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C97935y();
            case 4:
                return new C97934x();
            case 5:
                return f273474a;
            case 6:
                C63010eb ebVar = f273475b;
                if (ebVar == null) {
                    synchronized (C97935y.class) {
                        ebVar = f273475b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f273474a);
                            f273475b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
