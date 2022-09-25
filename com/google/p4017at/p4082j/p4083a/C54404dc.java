package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.dc */
/* compiled from: PG */
public final class C54404dc extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54404dc f142893a;

    /* renamed from: b */
    private static volatile C63010eb f142894b;

    static {
        C54404dc dcVar = new C54404dc();
        f142893a = dcVar;
        C62942bv.registerDefaultInstance(C54404dc.class, dcVar);
    }

    private C54404dc() {
        emptyProtobufList();
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
                return newMessageInfo(f142893a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C54404dc();
            case 4:
                return new C54403db();
            case 5:
                return f142893a;
            case 6:
                C63010eb ebVar = f142894b;
                if (ebVar == null) {
                    synchronized (C54404dc.class) {
                        ebVar = f142894b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142893a);
                            f142894b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
