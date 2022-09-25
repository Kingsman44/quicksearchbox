package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.b.bh */
/* compiled from: PG */
public final class C80856bh extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80856bh f221798b;

    /* renamed from: c */
    private static volatile C63010eb f221799c;

    /* renamed from: a */
    public boolean f221800a;

    static {
        C80856bh bhVar = new C80856bh();
        f221798b = bhVar;
        C62942bv.registerDefaultInstance(C80856bh.class, bhVar);
    }

    private C80856bh() {
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
                return newMessageInfo(f221798b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            case 3:
                return new C80856bh();
            case 4:
                return new C80855bg();
            case 5:
                return f221798b;
            case 6:
                C63010eb ebVar = f221799c;
                if (ebVar == null) {
                    synchronized (C80856bh.class) {
                        ebVar = f221799c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221798b);
                            f221799c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
