package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.am */
/* compiled from: PG */
public final class C51681am extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51681am f135358d;

    /* renamed from: e */
    private static volatile C63010eb f135359e;

    /* renamed from: a */
    public int f135360a = 0;

    /* renamed from: b */
    public Object f135361b;

    /* renamed from: c */
    public C62971cq f135362c = emptyProtobufList();

    static {
        C51681am amVar = new C51681am();
        f135358d = amVar;
        C62942bv.registerDefaultInstance(C51681am.class, amVar);
    }

    private C51681am() {
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
                return newMessageInfo(f135358d, "\u0001\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u001b\u0002ြ\u0000\u0004ြ\u0000", new Object[]{"b", "a", C45240c.f118157a, C52428rj.class, C51805du.class, C51680al.class});
            case 3:
                return new C51681am();
            case 4:
                return new C51678aj();
            case 5:
                return f135358d;
            case 6:
                C63010eb ebVar = f135359e;
                if (ebVar == null) {
                    synchronized (C51681am.class) {
                        ebVar = f135359e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135358d);
                            f135359e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
