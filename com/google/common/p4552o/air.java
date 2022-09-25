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

/* renamed from: com.google.common.o.air */
/* compiled from: PG */
public final class air extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final air f158830f;

    /* renamed from: g */
    public static final C62940bt f158831g;

    /* renamed from: h */
    private static volatile C63010eb f158832h;

    /* renamed from: a */
    public int f158833a;

    /* renamed from: b */
    public aim f158834b;

    /* renamed from: c */
    public aid f158835c;

    /* renamed from: d */
    public aip f158836d;

    /* renamed from: e */
    public aib f158837e;

    static {
        air air = new air();
        f158830f = air;
        C62942bv.registerDefaultInstance(air.class, air);
        f158831g = C62942bv.newSingularGeneratedExtension(aqs.f159780k, air, air, (C62958ce) null, 571, C63066gd.MESSAGE, air.class);
    }

    private air() {
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
                return newMessageInfo(f158830f, "\u0001\u0004\u0000\u0001\u0002\u0007\u0004\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0007ဉ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new air();
            case 4:
                return new aiq();
            case 5:
                return f158830f;
            case 6:
                C63010eb ebVar = f158832h;
                if (ebVar == null) {
                    synchronized (air.class) {
                        ebVar = f158832h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158830f);
                            f158832h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
