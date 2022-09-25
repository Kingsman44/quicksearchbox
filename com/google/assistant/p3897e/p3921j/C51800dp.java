package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.dp */
/* compiled from: PG */
public final class C51800dp extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51800dp f135913d;

    /* renamed from: e */
    private static volatile C63010eb f135914e;

    /* renamed from: a */
    public int f135915a;

    /* renamed from: b */
    public int f135916b;

    /* renamed from: c */
    public double f135917c = 1.0d;

    static {
        C51800dp dpVar = new C51800dp();
        f135913d = dpVar;
        C62942bv.registerDefaultInstance(C51800dp.class, dpVar);
    }

    private C51800dp() {
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
                return newMessageInfo(f135913d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002က\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C51800dp();
            case 4:
                return new C51799do();
            case 5:
                return f135913d;
            case 6:
                C63010eb ebVar = f135914e;
                if (ebVar == null) {
                    synchronized (C51800dp.class) {
                        ebVar = f135914e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135913d);
                            f135914e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
