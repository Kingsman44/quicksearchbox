package com.google.p4222bl.p4223a.p4224a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bl.a.a.ad */
/* compiled from: PG */
public final class C56060ad extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56060ad f149368c;

    /* renamed from: d */
    private static volatile C63010eb f149369d;

    /* renamed from: a */
    public int f149370a = 0;

    /* renamed from: b */
    public Object f149371b;

    static {
        C56060ad adVar = new C56060ad();
        f149368c = adVar;
        C62942bv.registerDefaultInstance(C56060ad.class, adVar);
    }

    private C56060ad() {
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
                return newMessageInfo(f149368c, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"b", "a", C56075n.class, C56079r.class, C56087z.class, C56058ab.class});
            case 3:
                return new C56060ad();
            case 4:
                return new C56059ac();
            case 5:
                return f149368c;
            case 6:
                C63010eb ebVar = f149369d;
                if (ebVar == null) {
                    synchronized (C56060ad.class) {
                        ebVar = f149369d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149368c);
                            f149369d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
