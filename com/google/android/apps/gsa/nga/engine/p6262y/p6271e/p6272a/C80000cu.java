package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.cu */
/* compiled from: PG */
public final class C80000cu extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C80000cu f219479e;

    /* renamed from: f */
    private static volatile C63010eb f219480f;

    /* renamed from: a */
    public int f219481a;

    /* renamed from: b */
    public C79994co f219482b;

    /* renamed from: c */
    public C79997cr f219483c;

    /* renamed from: d */
    public C79999ct f219484d;

    static {
        C80000cu cuVar = new C80000cu();
        f219479e = cuVar;
        C62942bv.registerDefaultInstance(C80000cu.class, cuVar);
    }

    private C80000cu() {
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
                return newMessageInfo(f219479e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C80000cu();
            case 4:
                return new C79995cp();
            case 5:
                return f219479e;
            case 6:
                C63010eb ebVar = f219480f;
                if (ebVar == null) {
                    synchronized (C80000cu.class) {
                        ebVar = f219480f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219479e);
                            f219480f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
