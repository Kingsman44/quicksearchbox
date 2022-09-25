package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.cw */
/* compiled from: PG */
public final class C80174cw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80174cw f219990c;

    /* renamed from: d */
    private static volatile C63010eb f219991d;

    /* renamed from: a */
    public int f219992a;

    /* renamed from: b */
    public boolean f219993b;

    static {
        C80174cw cwVar = new C80174cw();
        f219990c = cwVar;
        C62942bv.registerDefaultInstance(C80174cw.class, cwVar);
    }

    private C80174cw() {
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
                return newMessageInfo(f219990c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C80174cw();
            case 4:
                return new C80173cv();
            case 5:
                return f219990c;
            case 6:
                C63010eb ebVar = f219991d;
                if (ebVar == null) {
                    synchronized (C80174cw.class) {
                        ebVar = f219991d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219990c);
                            f219991d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
