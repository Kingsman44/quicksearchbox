package com.google.android.p10712d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.fa */
/* compiled from: PG */
public final class C142430fa extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C142430fa f386495a;

    /* renamed from: b */
    private static volatile C63010eb f386496b;

    static {
        C142430fa faVar = new C142430fa();
        f386495a = faVar;
        C62942bv.registerDefaultInstance(C142430fa.class, faVar);
    }

    private C142430fa() {
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
                return newMessageInfo(f386495a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C142430fa();
            case 4:
                return new C142428ez();
            case 5:
                return f386495a;
            case 6:
                C63010eb ebVar = f386496b;
                if (ebVar == null) {
                    synchronized (C142430fa.class) {
                        ebVar = f386496b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386495a);
                            f386496b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
