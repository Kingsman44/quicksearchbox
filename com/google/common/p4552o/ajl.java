package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.common.o.ajl */
/* compiled from: PG */
public final class ajl extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final ajl f158880e;

    /* renamed from: f */
    public static final C62940bt f158881f;

    /* renamed from: g */
    private static volatile C63010eb f158882g;

    /* renamed from: a */
    public int f158883a;

    /* renamed from: b */
    public ajp f158884b;

    /* renamed from: c */
    public ajn f158885c;

    /* renamed from: d */
    public ajr f158886d;

    static {
        ajl ajl = new ajl();
        f158880e = ajl;
        C62942bv.registerDefaultInstance(ajl.class, ajl);
        f158881f = C62942bv.newSingularGeneratedExtension(aqs.f159780k, ajl, ajl, (C62958ce) null, 374, C63066gd.MESSAGE, ajl.class);
    }

    private ajl() {
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
                return newMessageInfo(f158880e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new ajl();
            case 4:
                return new ajk();
            case 5:
                return f158880e;
            case 6:
                C63010eb ebVar = f158882g;
                if (ebVar == null) {
                    synchronized (ajl.class) {
                        ebVar = f158882g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158880e);
                            f158882g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
