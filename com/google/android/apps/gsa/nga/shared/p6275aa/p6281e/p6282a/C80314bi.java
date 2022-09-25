package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.bi */
/* compiled from: PG */
public final class C80314bi extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80314bi f220394a;

    /* renamed from: b */
    private static volatile C63010eb f220395b;

    static {
        C80314bi biVar = new C80314bi();
        f220394a = biVar;
        C62942bv.registerDefaultInstance(C80314bi.class, biVar);
    }

    private C80314bi() {
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
                return newMessageInfo(f220394a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C80314bi();
            case 4:
                return new C80313bh();
            case 5:
                return f220394a;
            case 6:
                C63010eb ebVar = f220395b;
                if (ebVar == null) {
                    synchronized (C80314bi.class) {
                        ebVar = f220395b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220394a);
                            f220395b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
