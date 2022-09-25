package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.adl */
/* compiled from: PG */
public final class adl extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final adl f158377d;

    /* renamed from: e */
    private static volatile C63010eb f158378e;

    /* renamed from: a */
    public int f158379a;

    /* renamed from: b */
    public boolean f158380b;

    /* renamed from: c */
    public boolean f158381c;

    static {
        adl adl = new adl();
        f158377d = adl;
        C62942bv.registerDefaultInstance(adl.class, adl);
    }

    private adl() {
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
                return newMessageInfo(f158377d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new adl();
            case 4:
                return new adk();
            case 5:
                return f158377d;
            case 6:
                C63010eb ebVar = f158378e;
                if (ebVar == null) {
                    synchronized (adl.class) {
                        ebVar = f158378e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158377d);
                            f158378e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
