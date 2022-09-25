package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.b.g */
/* compiled from: PG */
public final class C80861g extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80861g f221804a;

    /* renamed from: b */
    private static volatile C63010eb f221805b;

    static {
        C80861g gVar = new C80861g();
        f221804a = gVar;
        C62942bv.registerDefaultInstance(C80861g.class, gVar);
    }

    private C80861g() {
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
                return newMessageInfo(f221804a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C80861g();
            case 4:
                return new C80860f();
            case 5:
                return f221804a;
            case 6:
                C63010eb ebVar = f221805b;
                if (ebVar == null) {
                    synchronized (C80861g.class) {
                        ebVar = f221805b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221804a);
                            f221805b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
