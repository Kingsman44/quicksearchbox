package com.google.android.apps.gsa.staticplugins.p7678cl.p7680b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.cl.b.w */
/* compiled from: PG */
public final class C97933w extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C97933w f273472a;

    /* renamed from: b */
    private static volatile C63010eb f273473b;

    static {
        C97933w wVar = new C97933w();
        f273472a = wVar;
        C62942bv.registerDefaultInstance(C97933w.class, wVar);
    }

    private C97933w() {
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
                return newMessageInfo(f273472a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C97933w();
            case 4:
                return new C97932v();
            case 5:
                return f273472a;
            case 6:
                C63010eb ebVar = f273473b;
                if (ebVar == null) {
                    synchronized (C97933w.class) {
                        ebVar = f273473b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f273472a);
                            f273473b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
