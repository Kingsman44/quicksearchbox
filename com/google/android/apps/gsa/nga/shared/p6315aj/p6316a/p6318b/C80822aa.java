package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.b.aa */
/* compiled from: PG */
public final class C80822aa extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80822aa f221741a;

    /* renamed from: b */
    private static volatile C63010eb f221742b;

    static {
        C80822aa aaVar = new C80822aa();
        f221741a = aaVar;
        C62942bv.registerDefaultInstance(C80822aa.class, aaVar);
    }

    private C80822aa() {
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
                return newMessageInfo(f221741a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C80822aa();
            case 4:
                return new C80880z();
            case 5:
                return f221741a;
            case 6:
                C63010eb ebVar = f221742b;
                if (ebVar == null) {
                    synchronized (C80822aa.class) {
                        ebVar = f221742b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221741a);
                            f221742b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
