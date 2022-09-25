package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.ck */
/* compiled from: PG */
public final class C55007ck extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55007ck f144720c;

    /* renamed from: d */
    public static final C62940bt f144721d;

    /* renamed from: e */
    private static volatile C63010eb f144722e;

    /* renamed from: a */
    public int f144723a;

    /* renamed from: b */
    public int f144724b;

    static {
        C55007ck ckVar = new C55007ck();
        f144720c = ckVar;
        C62942bv.registerDefaultInstance(C55007ck.class, ckVar);
        f144721d = C62942bv.newSingularGeneratedExtension(C55005ci.f144714d, ckVar, ckVar, (C62958ce) null, 69061725, C63066gd.MESSAGE, C55007ck.class);
    }

    private C55007ck() {
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
                return newMessageInfo(f144720c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C55018cv.m87559b()});
            case 3:
                return new C55007ck();
            case 4:
                return new C55006cj();
            case 5:
                return f144720c;
            case 6:
                C63010eb ebVar = f144722e;
                if (ebVar == null) {
                    synchronized (C55007ck.class) {
                        ebVar = f144722e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144720c);
                            f144722e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
