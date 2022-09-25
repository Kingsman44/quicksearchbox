package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.common.o.aqo */
/* compiled from: PG */
public final class aqo extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final aqo f159776a;

    /* renamed from: b */
    public static final C62940bt f159777b = C62942bv.newRepeatedGeneratedExtension(aqs.f159780k, (MessageLite) null, (C62958ce) null, 260, C63066gd.STRING, false, String.class);

    /* renamed from: c */
    private static volatile C63010eb f159778c;

    static {
        aqo aqo = new aqo();
        f159776a = aqo;
        C62942bv.registerDefaultInstance(aqo.class, aqo);
    }

    private aqo() {
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
                return newMessageInfo(f159776a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new aqo();
            case 4:
                return new aqn();
            case 5:
                return f159776a;
            case 6:
                C63010eb ebVar = f159778c;
                if (ebVar == null) {
                    synchronized (aqo.class) {
                        ebVar = f159778c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159776a);
                            f159778c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
