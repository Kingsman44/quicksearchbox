package com.google.p4184bj.p4193c.p4197c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.c.c.ab */
/* compiled from: PG */
public final class C55928ab extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55928ab f148876d;

    /* renamed from: e */
    private static volatile C63010eb f148877e;

    /* renamed from: a */
    public int f148878a;

    /* renamed from: b */
    public boolean f148879b;

    /* renamed from: c */
    public boolean f148880c;

    static {
        C55928ab abVar = new C55928ab();
        f148876d = abVar;
        C62942bv.registerDefaultInstance(C55928ab.class, abVar);
    }

    private C55928ab() {
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
                return newMessageInfo(f148876d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C55928ab();
            case 4:
                return new C55927aa();
            case 5:
                return f148876d;
            case 6:
                C63010eb ebVar = f148877e;
                if (ebVar == null) {
                    synchronized (C55928ab.class) {
                        ebVar = f148877e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f148876d);
                            f148877e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
