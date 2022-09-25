package com.google.common.p4552o.p4563i;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.au */
/* compiled from: PG */
public final class C59885au extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C59885au f161823e;

    /* renamed from: f */
    private static volatile C63010eb f161824f;

    /* renamed from: a */
    public int f161825a;

    /* renamed from: b */
    public int f161826b;

    /* renamed from: c */
    public int f161827c;

    /* renamed from: d */
    public int f161828d;

    static {
        C59885au auVar = new C59885au();
        f161823e = auVar;
        C62942bv.registerDefaultInstance(C59885au.class, auVar);
    }

    private C59885au() {
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
                return newMessageInfo(f161823e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C59885au();
            case 4:
                return new C59884at();
            case 5:
                return f161823e;
            case 6:
                C63010eb ebVar = f161824f;
                if (ebVar == null) {
                    synchronized (C59885au.class) {
                        ebVar = f161824f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161823e);
                            f161824f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
