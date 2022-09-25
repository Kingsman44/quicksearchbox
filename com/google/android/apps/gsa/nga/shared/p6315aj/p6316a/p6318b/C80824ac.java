package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.b.ac */
/* compiled from: PG */
public final class C80824ac extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80824ac f221743a;

    /* renamed from: b */
    private static volatile C63010eb f221744b;

    static {
        C80824ac acVar = new C80824ac();
        f221743a = acVar;
        C62942bv.registerDefaultInstance(C80824ac.class, acVar);
    }

    private C80824ac() {
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
                return newMessageInfo(f221743a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C80824ac();
            case 4:
                return new C80823ab();
            case 5:
                return f221743a;
            case 6:
                C63010eb ebVar = f221744b;
                if (ebVar == null) {
                    synchronized (C80824ac.class) {
                        ebVar = f221744b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221743a);
                            f221744b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
