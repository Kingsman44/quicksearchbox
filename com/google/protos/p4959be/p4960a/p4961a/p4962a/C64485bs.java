package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.bs */
/* compiled from: PG */
public final class C64485bs extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64485bs f174903b;

    /* renamed from: c */
    private static volatile C63010eb f174904c;

    /* renamed from: a */
    public C62971cq f174905a = C62942bv.emptyProtobufList();

    static {
        C64485bs bsVar = new C64485bs();
        f174903b = bsVar;
        C62942bv.registerDefaultInstance(C64485bs.class, bsVar);
    }

    private C64485bs() {
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
                return newMessageInfo(f174903b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"a"});
            case 3:
                return new C64485bs();
            case 4:
                return new C64484br();
            case 5:
                return f174903b;
            case 6:
                C63010eb ebVar = f174904c;
                if (ebVar == null) {
                    synchronized (C64485bs.class) {
                        ebVar = f174904c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174903b);
                            f174904c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
