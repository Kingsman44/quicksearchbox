package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.c.a.cb */
/* compiled from: PG */
public final class C57274cb extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57274cb f152898b;

    /* renamed from: d */
    private static volatile C63010eb f152899d;

    /* renamed from: a */
    public int f152900a;

    /* renamed from: c */
    private int f152901c;

    static {
        C57274cb cbVar = new C57274cb();
        f152898b = cbVar;
        C62942bv.registerDefaultInstance(C57274cb.class, cbVar);
    }

    private C57274cb() {
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
                return newMessageInfo(f152898b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C57276cd.m88296b()});
            case 3:
                return new C57274cb();
            case 4:
                return new C57273ca();
            case 5:
                return f152898b;
            case 6:
                C63010eb ebVar = f152899d;
                if (ebVar == null) {
                    synchronized (C57274cb.class) {
                        ebVar = f152899d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152898b);
                            f152899d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
