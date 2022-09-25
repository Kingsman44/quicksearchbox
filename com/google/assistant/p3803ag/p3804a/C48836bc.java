package com.google.assistant.p3803ag.p3804a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.ag.a.bc */
/* compiled from: PG */
public final class C48836bc extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48836bc f126374b;

    /* renamed from: c */
    public static final C62940bt f126375c;

    /* renamed from: e */
    private static volatile C63010eb f126376e;

    /* renamed from: a */
    public C48855bv f126377a;

    /* renamed from: d */
    private int f126378d;

    static {
        C48836bc bcVar = new C48836bc();
        f126374b = bcVar;
        C62942bv.registerDefaultInstance(C48836bc.class, bcVar);
        f126375c = C62942bv.newSingularGeneratedExtension(C48862e.f126439a, bcVar, bcVar, (C62958ce) null, 102, C63066gd.MESSAGE, C48836bc.class);
    }

    private C48836bc() {
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
                return newMessageInfo(f126374b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C48836bc();
            case 4:
                return new C48835bb();
            case 5:
                return f126374b;
            case 6:
                C63010eb ebVar = f126376e;
                if (ebVar == null) {
                    synchronized (C48836bc.class) {
                        ebVar = f126376e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126374b);
                            f126376e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
