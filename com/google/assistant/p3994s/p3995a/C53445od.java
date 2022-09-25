package com.google.assistant.p3994s.p3995a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.od */
/* compiled from: PG */
public final class C53445od extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53445od f140272d;

    /* renamed from: e */
    private static volatile C63010eb f140273e;

    /* renamed from: a */
    public int f140274a;

    /* renamed from: b */
    public C48952az f140275b;

    /* renamed from: c */
    public int f140276c;

    static {
        C53445od odVar = new C53445od();
        f140272d = odVar;
        C62942bv.registerDefaultInstance(C53445od.class, odVar);
    }

    private C53445od() {
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
                return newMessageInfo(f140272d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C53445od();
            case 4:
                return new C53444oc();
            case 5:
                return f140272d;
            case 6:
                C63010eb ebVar = f140273e;
                if (ebVar == null) {
                    synchronized (C53445od.class) {
                        ebVar = f140273e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140272d);
                            f140273e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
