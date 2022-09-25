package com.google.protos.p4985f.p4988b.p4992c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.b.c.m */
/* compiled from: PG */
public final class C64765m extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64765m f175555b;

    /* renamed from: d */
    private static volatile C63010eb f175556d;

    /* renamed from: a */
    public int f175557a;

    /* renamed from: c */
    private int f175558c;

    static {
        C64765m mVar = new C64765m();
        f175555b = mVar;
        C62942bv.registerDefaultInstance(C64765m.class, mVar);
    }

    private C64765m() {
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
                return newMessageInfo(f175555b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C64765m();
            case 4:
                return new C64764l();
            case 5:
                return f175555b;
            case 6:
                C63010eb ebVar = f175556d;
                if (ebVar == null) {
                    synchronized (C64765m.class) {
                        ebVar = f175556d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175555b);
                            f175556d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
