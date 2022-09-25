package com.google.protos.youtube.elements;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.youtube.elements.cq */
/* compiled from: PG */
public final class C66172cq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66172cq f179941c;

    /* renamed from: d */
    public static final C62940bt f179942d;

    /* renamed from: f */
    private static volatile C63010eb f179943f;

    /* renamed from: a */
    public int f179944a;

    /* renamed from: b */
    public int f179945b;

    /* renamed from: e */
    private int f179946e;

    static {
        C66172cq cqVar = new C66172cq();
        f179941c = cqVar;
        C62942bv.registerDefaultInstance(C66172cq.class, cqVar);
        f179942d = C62942bv.newSingularGeneratedExtension(C66063ay.f179656a, cqVar, cqVar, (C62958ce) null, 212323971, C63066gd.MESSAGE, C66172cq.class);
    }

    private C66172cq() {
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
                return newMessageInfo(f179941c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"e", "a", "b"});
            case 3:
                return new C66172cq();
            case 4:
                return new C66171cp();
            case 5:
                return f179941c;
            case 6:
                C63010eb ebVar = f179943f;
                if (ebVar == null) {
                    synchronized (C66172cq.class) {
                        ebVar = f179943f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179941c);
                            f179943f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
