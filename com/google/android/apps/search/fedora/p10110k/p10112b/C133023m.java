package com.google.android.apps.search.fedora.p10110k.p10112b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.fedora.k.b.m */
/* compiled from: PG */
public final class C133023m extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C133023m f362741a;

    /* renamed from: b */
    private static volatile C63010eb f362742b;

    static {
        C133023m mVar = new C133023m();
        f362741a = mVar;
        C62942bv.registerDefaultInstance(C133023m.class, mVar);
    }

    private C133023m() {
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
                return newMessageInfo(f362741a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C133023m();
            case 4:
                return new C133022l();
            case 5:
                return f362741a;
            case 6:
                C63010eb ebVar = f362742b;
                if (ebVar == null) {
                    synchronized (C133023m.class) {
                        ebVar = f362742b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362741a);
                            f362742b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
