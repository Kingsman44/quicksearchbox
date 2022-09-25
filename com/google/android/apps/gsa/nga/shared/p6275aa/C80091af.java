package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.af */
/* compiled from: PG */
public final class C80091af extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80091af f219785c;

    /* renamed from: d */
    private static volatile C63010eb f219786d;

    /* renamed from: a */
    public int f219787a;

    /* renamed from: b */
    public int f219788b;

    static {
        C80091af afVar = new C80091af();
        f219785c = afVar;
        C62942bv.registerDefaultInstance(C80091af.class, afVar);
    }

    private C80091af() {
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
                return newMessageInfo(f219785c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C80089ad.f219784a});
            case 3:
                return new C80091af();
            case 4:
                return new C80088ac();
            case 5:
                return f219785c;
            case 6:
                C63010eb ebVar = f219786d;
                if (ebVar == null) {
                    synchronized (C80091af.class) {
                        ebVar = f219786d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219785c);
                            f219786d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
