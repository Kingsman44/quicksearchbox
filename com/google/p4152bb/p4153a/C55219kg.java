package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.kg */
/* compiled from: PG */
public final class C55219kg extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55219kg f145373d;

    /* renamed from: e */
    public static final C62940bt f145374e;

    /* renamed from: g */
    private static volatile C63010eb f145375g;

    /* renamed from: a */
    public int f145376a;

    /* renamed from: b */
    public C55093fp f145377b;

    /* renamed from: c */
    public C55173io f145378c;

    /* renamed from: f */
    private byte f145379f = 2;

    static {
        C55219kg kgVar = new C55219kg();
        f145373d = kgVar;
        C62942bv.registerDefaultInstance(C55219kg.class, kgVar);
        f145374e = C62942bv.newSingularGeneratedExtension(C55213ka.f145356g, kgVar, kgVar, (C62958ce) null, 1001, C63066gd.MESSAGE, C55219kg.class);
    }

    private C55219kg() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145379f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145379f = b;
                return null;
            case 2:
                return newMessageInfo(f145373d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C55219kg();
            case 4:
                return new C55218kf();
            case 5:
                return f145373d;
            case 6:
                C63010eb ebVar = f145375g;
                if (ebVar == null) {
                    synchronized (C55219kg.class) {
                        ebVar = f145375g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145373d);
                            f145375g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
