package com.google.common.p4552o.p4564j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.j.aj */
/* compiled from: PG */
public final class C60014aj extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60014aj f162211d;

    /* renamed from: e */
    private static volatile C63010eb f162212e;

    /* renamed from: a */
    public int f162213a;

    /* renamed from: b */
    public int f162214b;

    /* renamed from: c */
    public C60021aq f162215c;

    static {
        C60014aj ajVar = new C60014aj();
        f162211d = ajVar;
        C62942bv.registerDefaultInstance(C60014aj.class, ajVar);
    }

    private C60014aj() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f162211d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဋ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C60014aj();
            case 4:
                return new C60013ai();
            case 5:
                return f162211d;
            case 6:
                C63010eb ebVar = f162212e;
                if (ebVar == null) {
                    synchronized (C60014aj.class) {
                        ebVar = f162212e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162211d);
                            f162212e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
