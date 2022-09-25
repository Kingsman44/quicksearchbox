package com.google.p427am.p438d.p439a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.d.a.bt */
/* compiled from: PG */
public final class C8746bt extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8746bt f30086a;

    /* renamed from: b */
    private static volatile C63010eb f30087b;

    static {
        C8746bt btVar = new C8746bt();
        f30086a = btVar;
        C62942bv.registerDefaultInstance(C8746bt.class, btVar);
    }

    private C8746bt() {
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
                return newMessageInfo(f30086a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C8746bt();
            case 4:
                return new C8745bs();
            case 5:
                return f30086a;
            case 6:
                C63010eb ebVar = f30087b;
                if (ebVar == null) {
                    synchronized (C8746bt.class) {
                        ebVar = f30087b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30086a);
                            f30087b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
