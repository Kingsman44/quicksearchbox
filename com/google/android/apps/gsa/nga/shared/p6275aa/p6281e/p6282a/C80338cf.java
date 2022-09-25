package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.cf */
/* compiled from: PG */
public final class C80338cf extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80338cf f220449a;

    /* renamed from: b */
    private static volatile C63010eb f220450b;

    static {
        C80338cf cfVar = new C80338cf();
        f220449a = cfVar;
        C62942bv.registerDefaultInstance(C80338cf.class, cfVar);
    }

    private C80338cf() {
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
                return newMessageInfo(f220449a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C80338cf();
            case 4:
                return new C80337ce();
            case 5:
                return f220449a;
            case 6:
                C63010eb ebVar = f220450b;
                if (ebVar == null) {
                    synchronized (C80338cf.class) {
                        ebVar = f220450b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220449a);
                            f220450b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
