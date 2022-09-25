package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8216c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.c.b */
/* compiled from: PG */
public final class C106525b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C106525b f297058a;

    /* renamed from: b */
    private static volatile C63010eb f297059b;

    static {
        C106525b bVar = new C106525b();
        f297058a = bVar;
        C62942bv.registerDefaultInstance(C106525b.class, bVar);
    }

    private C106525b() {
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
                return newMessageInfo(f297058a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C106525b();
            case 4:
                return new C106524a();
            case 5:
                return f297058a;
            case 6:
                C63010eb ebVar = f297059b;
                if (ebVar == null) {
                    synchronized (C106525b.class) {
                        ebVar = f297059b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f297058a);
                            f297059b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
