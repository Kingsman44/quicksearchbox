package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.agc */
/* compiled from: PG */
public final class agc extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final agc f129206a;

    /* renamed from: d */
    private static volatile C63010eb f129207d;

    /* renamed from: b */
    private int f129208b;

    /* renamed from: c */
    private C49822aga f129209c;

    static {
        agc agc = new agc();
        f129206a = agc;
        C62942bv.registerDefaultInstance(agc.class, agc);
    }

    private agc() {
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
                return newMessageInfo(f129206a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new agc();
            case 4:
                return new agb();
            case 5:
                return f129206a;
            case 6:
                C63010eb ebVar = f129207d;
                if (ebVar == null) {
                    synchronized (agc.class) {
                        ebVar = f129207d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129206a);
                            f129207d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
