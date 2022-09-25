package com.google.android.p10712d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.ds */
/* compiled from: PG */
public final class C142394ds extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C142394ds f386396a;

    /* renamed from: b */
    private static volatile C63010eb f386397b;

    static {
        C142394ds dsVar = new C142394ds();
        f386396a = dsVar;
        C62942bv.registerDefaultInstance(C142394ds.class, dsVar);
    }

    private C142394ds() {
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
                return newMessageInfo(f386396a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C142394ds();
            case 4:
                return new C142393dr();
            case 5:
                return f386396a;
            case 6:
                C63010eb ebVar = f386397b;
                if (ebVar == null) {
                    synchronized (C142394ds.class) {
                        ebVar = f386397b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386396a);
                            f386397b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
