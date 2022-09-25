package com.google.android.p10712d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.hw */
/* compiled from: PG */
public final class C142506hw extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C142506hw f386710a;

    /* renamed from: b */
    private static volatile C63010eb f386711b;

    static {
        C142506hw hwVar = new C142506hw();
        f386710a = hwVar;
        C62942bv.registerDefaultInstance(C142506hw.class, hwVar);
    }

    private C142506hw() {
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
                return newMessageInfo(f386710a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C142506hw();
            case 4:
                return new C142505hv();
            case 5:
                return f386710a;
            case 6:
                C63010eb ebVar = f386711b;
                if (ebVar == null) {
                    synchronized (C142506hw.class) {
                        ebVar = f386711b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386710a);
                            f386711b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
