package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.cc */
/* compiled from: PG */
public final class C80236cc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80236cc f220124c;

    /* renamed from: d */
    private static volatile C63010eb f220125d;

    /* renamed from: a */
    public int f220126a = 0;

    /* renamed from: b */
    public Object f220127b;

    static {
        C80236cc ccVar = new C80236cc();
        f220124c = ccVar;
        C62942bv.registerDefaultInstance(C80236cc.class, ccVar);
    }

    private C80236cc() {
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
                return newMessageInfo(f220124c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C80197ar.class, C80219bm.class});
            case 3:
                return new C80236cc();
            case 4:
                return new C80235cb();
            case 5:
                return f220124c;
            case 6:
                C63010eb ebVar = f220125d;
                if (ebVar == null) {
                    synchronized (C80236cc.class) {
                        ebVar = f220125d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220124c);
                            f220125d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
