package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.common.o.pv */
/* compiled from: PG */
public final class C60427pv extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60427pv f163530c;

    /* renamed from: d */
    public static final C62940bt f163531d;

    /* renamed from: e */
    private static volatile C63010eb f163532e;

    /* renamed from: a */
    public int f163533a;

    /* renamed from: b */
    public int f163534b;

    static {
        C60427pv pvVar = new C60427pv();
        f163530c = pvVar;
        C62942bv.registerDefaultInstance(C60427pv.class, pvVar);
        f163531d = C62942bv.newSingularGeneratedExtension(C60313nz.f163201a, pvVar, pvVar, (C62958ce) null, 128, C63066gd.MESSAGE, C60427pv.class);
    }

    private C60427pv() {
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
                return newMessageInfo(f163530c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C60425pt.m92581b()});
            case 3:
                return new C60427pv();
            case 4:
                return new C60426pu();
            case 5:
                return f163530c;
            case 6:
                C63010eb ebVar = f163532e;
                if (ebVar == null) {
                    synchronized (C60427pv.class) {
                        ebVar = f163532e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163530c);
                            f163532e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
