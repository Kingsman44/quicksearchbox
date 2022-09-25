package com.google.android.libraries.gsa.p1880l;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.gsa.l.f */
/* compiled from: PG */
public final class C22878f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C22878f f62970b;

    /* renamed from: d */
    private static volatile C63010eb f62971d;

    /* renamed from: a */
    public String f62972a = "com.google.android.apps.gsa.staticplugins.save.RESULT_EXTRA";

    /* renamed from: c */
    private int f62973c;

    static {
        C22878f fVar = new C22878f();
        f62970b = fVar;
        C62942bv.registerDefaultInstance(C22878f.class, fVar);
    }

    private C22878f() {
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
                return newMessageInfo(f62970b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C22878f();
            case 4:
                return new C22877e();
            case 5:
                return f62970b;
            case 6:
                C63010eb ebVar = f62971d;
                if (ebVar == null) {
                    synchronized (C22878f.class) {
                        ebVar = f62971d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f62970b);
                            f62971d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
