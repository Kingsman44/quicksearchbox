package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.ae */
/* compiled from: PG */
public final class C80283ae extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80283ae f220302b;

    /* renamed from: c */
    private static volatile C63010eb f220303c;

    /* renamed from: a */
    public boolean f220304a;

    static {
        C80283ae aeVar = new C80283ae();
        f220302b = aeVar;
        C62942bv.registerDefaultInstance(C80283ae.class, aeVar);
    }

    private C80283ae() {
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
                return newMessageInfo(f220302b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            case 3:
                return new C80283ae();
            case 4:
                return new C80282ad();
            case 5:
                return f220302b;
            case 6:
                C63010eb ebVar = f220303c;
                if (ebVar == null) {
                    synchronized (C80283ae.class) {
                        ebVar = f220303c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220302b);
                            f220303c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
