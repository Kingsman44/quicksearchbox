package com.google.android.libraries.lens.view.flags;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.flags.u */
/* compiled from: PG */
public final class C26263u extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C26263u f71394a;

    /* renamed from: b */
    private static volatile C63010eb f71395b;

    static {
        C26263u uVar = new C26263u();
        f71394a = uVar;
        C62942bv.registerDefaultInstance(C26263u.class, uVar);
    }

    private C26263u() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f71394a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C26263u();
            case 4:
                return new C26262t();
            case 5:
                return f71394a;
            case 6:
                C63010eb ebVar = f71395b;
                if (ebVar == null) {
                    synchronized (C26263u.class) {
                        ebVar = f71395b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f71394a);
                            f71395b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
