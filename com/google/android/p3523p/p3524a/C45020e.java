package com.google.android.p3523p.p3524a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.p.a.e */
/* compiled from: PG */
public final class C45020e extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C45020e f117630a;

    /* renamed from: b */
    private static volatile C63010eb f117631b;

    static {
        C45020e eVar = new C45020e();
        f117630a = eVar;
        C62942bv.registerDefaultInstance(C45020e.class, eVar);
    }

    private C45020e() {
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
                return newMessageInfo(f117630a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C45020e();
            case 4:
                return new C45019d();
            case 5:
                return f117630a;
            case 6:
                C63010eb ebVar = f117631b;
                if (ebVar == null) {
                    synchronized (C45020e.class) {
                        ebVar = f117631b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f117630a);
                            f117631b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
