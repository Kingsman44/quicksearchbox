package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.qy */
/* compiled from: PG */
public final class C50272qy extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50272qy f130732c;

    /* renamed from: d */
    private static volatile C63010eb f130733d;

    /* renamed from: a */
    public int f130734a = 0;

    /* renamed from: b */
    public Object f130735b;

    static {
        C50272qy qyVar = new C50272qy();
        f130732c = qyVar;
        C62942bv.registerDefaultInstance(C50272qy.class, qyVar);
    }

    private C50272qy() {
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
                return newMessageInfo(f130732c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", C50264qq.class, C50253qf.class, C50260qm.class});
            case 3:
                return new C50272qy();
            case 4:
                return new C50271qx();
            case 5:
                return f130732c;
            case 6:
                C63010eb ebVar = f130733d;
                if (ebVar == null) {
                    synchronized (C50272qy.class) {
                        ebVar = f130733d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130732c);
                            f130733d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
