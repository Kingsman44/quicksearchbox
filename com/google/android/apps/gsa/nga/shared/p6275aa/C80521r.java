package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.r */
/* compiled from: PG */
public final class C80521r extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80521r f221052a;

    /* renamed from: b */
    private static volatile C63010eb f221053b;

    static {
        C80521r rVar = new C80521r();
        f221052a = rVar;
        C62942bv.registerDefaultInstance(C80521r.class, rVar);
    }

    private C80521r() {
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
                return newMessageInfo(f221052a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C80521r();
            case 4:
                return new C80520q();
            case 5:
                return f221052a;
            case 6:
                C63010eb ebVar = f221053b;
                if (ebVar == null) {
                    synchronized (C80521r.class) {
                        ebVar = f221053b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221052a);
                            f221053b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
