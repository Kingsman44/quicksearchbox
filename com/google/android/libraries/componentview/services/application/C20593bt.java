package com.google.android.libraries.componentview.services.application;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.componentview.services.application.bt */
/* compiled from: PG */
public final class C20593bt extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C20593bt f57796c;

    /* renamed from: d */
    private static volatile C63010eb f57797d;

    /* renamed from: a */
    public int f57798a;

    /* renamed from: b */
    public int f57799b;

    static {
        C20593bt btVar = new C20593bt();
        f57796c = btVar;
        C62942bv.registerDefaultInstance(C20593bt.class, btVar);
    }

    private C20593bt() {
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
                return newMessageInfo(f57796c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဌ\u0000", new Object[]{"a", "b", C20592bs.m38634b()});
            case 3:
                return new C20593bt();
            case 4:
                return new C20590bq();
            case 5:
                return f57796c;
            case 6:
                C63010eb ebVar = f57797d;
                if (ebVar == null) {
                    synchronized (C20593bt.class) {
                        ebVar = f57797d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f57796c);
                            f57797d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
