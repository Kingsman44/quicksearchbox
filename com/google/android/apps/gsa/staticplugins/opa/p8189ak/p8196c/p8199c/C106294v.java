package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8199c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.c.c.v */
/* compiled from: PG */
public final class C106294v extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C106294v f296563a;

    /* renamed from: b */
    private static volatile C63010eb f296564b;

    static {
        C106294v vVar = new C106294v();
        f296563a = vVar;
        C62942bv.registerDefaultInstance(C106294v.class, vVar);
    }

    private C106294v() {
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
                return newMessageInfo(f296563a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C106294v();
            case 4:
                return new C106293u();
            case 5:
                return f296563a;
            case 6:
                C63010eb ebVar = f296564b;
                if (ebVar == null) {
                    synchronized (C106294v.class) {
                        ebVar = f296564b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f296563a);
                            f296564b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
