package com.google.android.p10712d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.gt */
/* compiled from: PG */
public final class C142476gt extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C142476gt f386648a;

    /* renamed from: b */
    private static volatile C63010eb f386649b;

    static {
        C142476gt gtVar = new C142476gt();
        f386648a = gtVar;
        C62942bv.registerDefaultInstance(C142476gt.class, gtVar);
    }

    private C142476gt() {
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
                return newMessageInfo(f386648a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C142476gt();
            case 4:
                return new C142475gs();
            case 5:
                return f386648a;
            case 6:
                C63010eb ebVar = f386649b;
                if (ebVar == null) {
                    synchronized (C142476gt.class) {
                        ebVar = f386649b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386648a);
                            f386649b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
