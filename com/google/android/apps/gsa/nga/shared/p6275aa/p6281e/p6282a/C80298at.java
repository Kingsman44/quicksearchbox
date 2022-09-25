package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.at */
/* compiled from: PG */
public final class C80298at extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80298at f220368b;

    /* renamed from: c */
    private static volatile C63010eb f220369c;

    /* renamed from: a */
    public int f220370a;

    static {
        C80298at atVar = new C80298at();
        f220368b = atVar;
        C62942bv.registerDefaultInstance(C80298at.class, atVar);
    }

    private C80298at() {
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
                return newMessageInfo(f220368b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C80298at();
            case 4:
                return new C80296ar();
            case 5:
                return f220368b;
            case 6:
                C63010eb ebVar = f220369c;
                if (ebVar == null) {
                    synchronized (C80298at.class) {
                        ebVar = f220369c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220368b);
                            f220369c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
