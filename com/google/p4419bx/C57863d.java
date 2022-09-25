package com.google.p4419bx;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.bx.d */
/* compiled from: PG */
public final class C57863d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57863d f154580d;

    /* renamed from: e */
    private static volatile C63010eb f154581e;

    /* renamed from: a */
    public int f154582a;

    /* renamed from: b */
    public C63042fg f154583b;

    /* renamed from: c */
    public C57862c f154584c;

    static {
        C57863d dVar = new C57863d();
        f154580d = dVar;
        C62942bv.registerDefaultInstance(C57863d.class, dVar);
    }

    private C57863d() {
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
                return newMessageInfo(f154580d, "\u0001\u0002\u0000\u0001\u0001\u0006\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0006ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C57863d();
            case 4:
                return new C57860a();
            case 5:
                return f154580d;
            case 6:
                C63010eb ebVar = f154581e;
                if (ebVar == null) {
                    synchronized (C57863d.class) {
                        ebVar = f154581e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154580d);
                            f154581e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
