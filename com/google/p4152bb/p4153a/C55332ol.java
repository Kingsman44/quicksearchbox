package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.ol */
/* compiled from: PG */
public final class C55332ol extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55332ol f145776b;

    /* renamed from: c */
    public static final C62940bt f145777c;

    /* renamed from: e */
    private static volatile C63010eb f145778e;

    /* renamed from: a */
    public long f145779a;

    /* renamed from: d */
    private int f145780d;

    static {
        C55332ol olVar = new C55332ol();
        f145776b = olVar;
        C62942bv.registerDefaultInstance(C55332ol.class, olVar);
        f145777c = C62942bv.newSingularGeneratedExtension(C55324od.f145745j, olVar, olVar, (C62958ce) null, 70736603, C63066gd.MESSAGE, C55332ol.class);
    }

    private C55332ol() {
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
                return newMessageInfo(f145776b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C55332ol();
            case 4:
                return new C55331ok();
            case 5:
                return f145776b;
            case 6:
                C63010eb ebVar = f145778e;
                if (ebVar == null) {
                    synchronized (C55332ol.class) {
                        ebVar = f145778e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145776b);
                            f145778e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
