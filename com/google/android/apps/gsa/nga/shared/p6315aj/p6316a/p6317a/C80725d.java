package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.d */
/* compiled from: PG */
public final class C80725d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80725d f221607b;

    /* renamed from: c */
    private static volatile C63010eb f221608c;

    /* renamed from: a */
    public int f221609a;

    static {
        C80725d dVar = new C80725d();
        f221607b = dVar;
        C62942bv.registerDefaultInstance(C80725d.class, dVar);
    }

    private C80725d() {
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
                return newMessageInfo(f221607b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C80725d();
            case 4:
                return new C80698c();
            case 5:
                return f221607b;
            case 6:
                C63010eb ebVar = f221608c;
                if (ebVar == null) {
                    synchronized (C80725d.class) {
                        ebVar = f221608c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221607b);
                            f221608c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
