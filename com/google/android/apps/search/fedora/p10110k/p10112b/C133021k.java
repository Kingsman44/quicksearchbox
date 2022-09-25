package com.google.android.apps.search.fedora.p10110k.p10112b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.fedora.k.b.k */
/* compiled from: PG */
public final class C133021k extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C133021k f362739a;

    /* renamed from: b */
    private static volatile C63010eb f362740b;

    static {
        C133021k kVar = new C133021k();
        f362739a = kVar;
        C62942bv.registerDefaultInstance(C133021k.class, kVar);
    }

    private C133021k() {
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
                return newMessageInfo(f362739a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C133021k();
            case 4:
                return new C133020j();
            case 5:
                return f362739a;
            case 6:
                C63010eb ebVar = f362740b;
                if (ebVar == null) {
                    synchronized (C133021k.class) {
                        ebVar = f362740b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362739a);
                            f362740b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
