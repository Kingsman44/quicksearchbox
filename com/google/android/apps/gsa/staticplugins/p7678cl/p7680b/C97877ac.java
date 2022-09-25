package com.google.android.apps.gsa.staticplugins.p7678cl.p7680b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.cl.b.ac */
/* compiled from: PG */
public final class C97877ac extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C97877ac f273291a;

    /* renamed from: b */
    private static volatile C63010eb f273292b;

    static {
        C97877ac acVar = new C97877ac();
        f273291a = acVar;
        C62942bv.registerDefaultInstance(C97877ac.class, acVar);
    }

    private C97877ac() {
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
                return newMessageInfo(f273291a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C97877ac();
            case 4:
                return new C97876ab();
            case 5:
                return f273291a;
            case 6:
                C63010eb ebVar = f273292b;
                if (ebVar == null) {
                    synchronized (C97877ac.class) {
                        ebVar = f273292b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f273291a);
                            f273292b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
