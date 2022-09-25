package com.google.common.p4552o.p4563i;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.bt */
/* compiled from: PG */
public final class C59911bt extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C59911bt f161919e;

    /* renamed from: f */
    private static volatile C63010eb f161920f;

    /* renamed from: a */
    public int f161921a;

    /* renamed from: b */
    public long f161922b;

    /* renamed from: c */
    public long f161923c;

    /* renamed from: d */
    public boolean f161924d;

    static {
        C59911bt btVar = new C59911bt();
        f161919e = btVar;
        C62942bv.registerDefaultInstance(C59911bt.class, btVar);
    }

    private C59911bt() {
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
                return newMessageInfo(f161919e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C59911bt();
            case 4:
                return new C59910bs();
            case 5:
                return f161919e;
            case 6:
                C63010eb ebVar = f161920f;
                if (ebVar == null) {
                    synchronized (C59911bt.class) {
                        ebVar = f161920f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161919e);
                            f161920f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
