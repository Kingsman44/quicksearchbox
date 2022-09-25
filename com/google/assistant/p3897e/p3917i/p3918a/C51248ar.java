package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.i.a.ar */
/* compiled from: PG */
public final class C51248ar extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51248ar f133416d;

    /* renamed from: e */
    private static volatile C63010eb f133417e;

    /* renamed from: a */
    public int f133418a;

    /* renamed from: b */
    public C63088z f133419b = C63088z.f170246b;

    /* renamed from: c */
    public C63088z f133420c = C63088z.f170246b;

    static {
        C51248ar arVar = new C51248ar();
        f133416d = arVar;
        C62942bv.registerDefaultInstance(C51248ar.class, arVar);
    }

    private C51248ar() {
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
                return newMessageInfo(f133416d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C51248ar();
            case 4:
                return new C51247aq();
            case 5:
                return f133416d;
            case 6:
                C63010eb ebVar = f133417e;
                if (ebVar == null) {
                    synchronized (C51248ar.class) {
                        ebVar = f133417e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133416d);
                            f133417e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
