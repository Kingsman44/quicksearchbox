package com.google.android.p10712d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.hb */
/* compiled from: PG */
public final class C142485hb extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C142485hb f386667a;

    /* renamed from: b */
    private static volatile C63010eb f386668b;

    static {
        C142485hb hbVar = new C142485hb();
        f386667a = hbVar;
        C62942bv.registerDefaultInstance(C142485hb.class, hbVar);
    }

    private C142485hb() {
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
                return newMessageInfo(f386667a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C142485hb();
            case 4:
                return new C142484ha();
            case 5:
                return f386667a;
            case 6:
                C63010eb ebVar = f386668b;
                if (ebVar == null) {
                    synchronized (C142485hb.class) {
                        ebVar = f386668b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386667a);
                            f386668b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
