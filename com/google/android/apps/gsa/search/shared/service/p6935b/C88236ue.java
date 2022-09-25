package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ue */
/* compiled from: PG */
public final class C88236ue extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88236ue f238483c;

    /* renamed from: d */
    private static volatile C63010eb f238484d;

    /* renamed from: a */
    public int f238485a;

    /* renamed from: b */
    public int f238486b;

    static {
        C88236ue ueVar = new C88236ue();
        f238483c = ueVar;
        C62942bv.registerDefaultInstance(C88236ue.class, ueVar);
    }

    private C88236ue() {
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
                return newMessageInfo(f238483c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C88236ue();
            case 4:
                return new C88235ud();
            case 5:
                return f238483c;
            case 6:
                C63010eb ebVar = f238484d;
                if (ebVar == null) {
                    synchronized (C88236ue.class) {
                        ebVar = f238484d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238483c);
                            f238484d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
