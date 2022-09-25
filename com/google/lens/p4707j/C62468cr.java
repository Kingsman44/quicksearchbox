package com.google.lens.p4707j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.cr */
/* compiled from: PG */
public final class C62468cr extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62468cr f168665d;

    /* renamed from: e */
    private static volatile C63010eb f168666e;

    /* renamed from: a */
    public int f168667a;

    /* renamed from: b */
    public boolean f168668b;

    /* renamed from: c */
    public boolean f168669c;

    static {
        C62468cr crVar = new C62468cr();
        f168665d = crVar;
        C62942bv.registerDefaultInstance(C62468cr.class, crVar);
    }

    private C62468cr() {
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
                return newMessageInfo(f168665d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C62468cr();
            case 4:
                return new C62467cq();
            case 5:
                return f168665d;
            case 6:
                C63010eb ebVar = f168666e;
                if (ebVar == null) {
                    synchronized (C62468cr.class) {
                        ebVar = f168666e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168665d);
                            f168666e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
