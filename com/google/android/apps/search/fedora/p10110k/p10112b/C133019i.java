package com.google.android.apps.search.fedora.p10110k.p10112b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.fedora.k.b.i */
/* compiled from: PG */
public final class C133019i extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C133019i f362737a;

    /* renamed from: b */
    private static volatile C63010eb f362738b;

    static {
        C133019i iVar = new C133019i();
        f362737a = iVar;
        C62942bv.registerDefaultInstance(C133019i.class, iVar);
    }

    private C133019i() {
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
                return newMessageInfo(f362737a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C133019i();
            case 4:
                return new C133018h();
            case 5:
                return f362737a;
            case 6:
                C63010eb ebVar = f362738b;
                if (ebVar == null) {
                    synchronized (C133019i.class) {
                        ebVar = f362738b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362737a);
                            f362738b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
