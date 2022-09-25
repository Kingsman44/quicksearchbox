package com.google.protos.p5127o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.o.j */
/* compiled from: PG */
public final class C65684j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65684j f178466b;

    /* renamed from: d */
    private static volatile C63010eb f178467d;

    /* renamed from: a */
    public long f178468a;

    /* renamed from: c */
    private int f178469c;

    static {
        C65684j jVar = new C65684j();
        f178466b = jVar;
        C62942bv.registerDefaultInstance(C65684j.class, jVar);
    }

    private C65684j() {
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
                return newMessageInfo(f178466b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C65684j();
            case 4:
                return new C65683i();
            case 5:
                return f178466b;
            case 6:
                C63010eb ebVar = f178467d;
                if (ebVar == null) {
                    synchronized (C65684j.class) {
                        ebVar = f178467d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178466b);
                            f178467d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
