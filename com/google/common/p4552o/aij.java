package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.common.o.aij */
/* compiled from: PG */
public final class aij extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final aij f158815c;

    /* renamed from: d */
    public static final C62940bt f158816d;

    /* renamed from: e */
    private static volatile C63010eb f158817e;

    /* renamed from: a */
    public int f158818a;

    /* renamed from: b */
    public aid f158819b;

    static {
        aij aij = new aij();
        f158815c = aij;
        C62942bv.registerDefaultInstance(aij.class, aij);
        f158816d = C62942bv.newSingularGeneratedExtension(C60313nz.f163201a, aij, aij, (C62958ce) null, 118, C63066gd.MESSAGE, aij.class);
    }

    private aij() {
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
                return newMessageInfo(f158815c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new aij();
            case 4:
                return new aii();
            case 5:
                return f158815c;
            case 6:
                C63010eb ebVar = f158817e;
                if (ebVar == null) {
                    synchronized (aij.class) {
                        ebVar = f158817e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158815c);
                            f158817e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
