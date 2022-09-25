package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.co */
/* compiled from: PG */
public final class C80166co extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80166co f219976c;

    /* renamed from: d */
    private static volatile C63010eb f219977d;

    /* renamed from: a */
    public int f219978a;

    /* renamed from: b */
    public boolean f219979b;

    static {
        C80166co coVar = new C80166co();
        f219976c = coVar;
        C62942bv.registerDefaultInstance(C80166co.class, coVar);
    }

    private C80166co() {
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
                return newMessageInfo(f219976c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C80166co();
            case 4:
                return new C80165cn();
            case 5:
                return f219976c;
            case 6:
                C63010eb ebVar = f219977d;
                if (ebVar == null) {
                    synchronized (C80166co.class) {
                        ebVar = f219977d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219976c);
                            f219977d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
