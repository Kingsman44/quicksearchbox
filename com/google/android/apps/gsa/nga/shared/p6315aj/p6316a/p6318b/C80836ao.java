package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.b.ao */
/* compiled from: PG */
public final class C80836ao extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80836ao f221763c;

    /* renamed from: d */
    private static volatile C63010eb f221764d;

    /* renamed from: a */
    public boolean f221765a;

    /* renamed from: b */
    public boolean f221766b;

    static {
        C80836ao aoVar = new C80836ao();
        f221763c = aoVar;
        C62942bv.registerDefaultInstance(C80836ao.class, aoVar);
    }

    private C80836ao() {
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
                return newMessageInfo(f221763c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"a", "b"});
            case 3:
                return new C80836ao();
            case 4:
                return new C80835an();
            case 5:
                return f221763c;
            case 6:
                C63010eb ebVar = f221764d;
                if (ebVar == null) {
                    synchronized (C80836ao.class) {
                        ebVar = f221764d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221763c);
                            f221764d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
