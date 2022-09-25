package com.google.common.p4552o.p4566l;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.cr */
/* compiled from: PG */
public final class C60180cr extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C60180cr f162803f;

    /* renamed from: g */
    private static volatile C63010eb f162804g;

    /* renamed from: a */
    public int f162805a;

    /* renamed from: b */
    public boolean f162806b;

    /* renamed from: c */
    public long f162807c;

    /* renamed from: d */
    public boolean f162808d;

    /* renamed from: e */
    public boolean f162809e;

    static {
        C60180cr crVar = new C60180cr();
        f162803f = crVar;
        C62942bv.registerDefaultInstance(C60180cr.class, crVar);
    }

    private C60180cr() {
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
                return newMessageInfo(f162803f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C60180cr();
            case 4:
                return new C60179cq();
            case 5:
                return f162803f;
            case 6:
                C63010eb ebVar = f162804g;
                if (ebVar == null) {
                    synchronized (C60180cr.class) {
                        ebVar = f162804g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162803f);
                            f162804g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
