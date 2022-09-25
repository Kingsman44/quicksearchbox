package com.google.protos.p5129p.p5131b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.p.b.bd */
/* compiled from: PG */
public final class C65773bd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65773bd f178808c;

    /* renamed from: d */
    public static final C62940bt f178809d;

    /* renamed from: e */
    private static volatile C63010eb f178810e;

    /* renamed from: a */
    public int f178811a;

    /* renamed from: b */
    public C65771bb f178812b;

    static {
        C65773bd bdVar = new C65773bd();
        f178808c = bdVar;
        C62942bv.registerDefaultInstance(C65773bd.class, bdVar);
        f178809d = C62942bv.newSingularGeneratedExtension(C65808cl.f178897d, bdVar, bdVar, (C62958ce) null, 402926957, C63066gd.MESSAGE, C65773bd.class);
    }

    private C65773bd() {
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
                return newMessageInfo(f178808c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65773bd();
            case 4:
                return new C65772bc();
            case 5:
                return f178808c;
            case 6:
                C63010eb ebVar = f178810e;
                if (ebVar == null) {
                    synchronized (C65773bd.class) {
                        ebVar = f178810e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178808c);
                            f178810e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
