package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8228o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.o.b */
/* compiled from: PG */
public final class C106592b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C106592b f297191a;

    /* renamed from: b */
    private static volatile C63010eb f297192b;

    static {
        C106592b bVar = new C106592b();
        f297191a = bVar;
        C62942bv.registerDefaultInstance(C106592b.class, bVar);
    }

    private C106592b() {
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
                return newMessageInfo(f297191a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C106592b();
            case 4:
                return new C106591a();
            case 5:
                return f297191a;
            case 6:
                C63010eb ebVar = f297192b;
                if (ebVar == null) {
                    synchronized (C106592b.class) {
                        ebVar = f297192b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f297191a);
                            f297192b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
