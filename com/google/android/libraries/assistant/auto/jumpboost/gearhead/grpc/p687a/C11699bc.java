package com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.a.bc */
/* compiled from: PG */
public final class C11699bc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C11699bc f37719c;

    /* renamed from: d */
    private static volatile C63010eb f37720d;

    /* renamed from: a */
    public int f37721a;

    /* renamed from: b */
    public C11681al f37722b;

    static {
        C11699bc bcVar = new C11699bc();
        f37719c = bcVar;
        C62942bv.registerDefaultInstance(C11699bc.class, bcVar);
    }

    private C11699bc() {
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
                return newMessageInfo(f37719c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C11699bc();
            case 4:
                return new C11698bb();
            case 5:
                return f37719c;
            case 6:
                C63010eb ebVar = f37720d;
                if (ebVar == null) {
                    synchronized (C11699bc.class) {
                        ebVar = f37720d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f37719c);
                            f37720d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
