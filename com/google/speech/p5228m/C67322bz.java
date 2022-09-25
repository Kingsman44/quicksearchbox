package com.google.speech.p5228m;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.bz */
/* compiled from: PG */
public final class C67322bz extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67322bz f182986c;

    /* renamed from: d */
    private static volatile C63010eb f182987d;

    /* renamed from: a */
    public C62971cq f182988a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f182989b = emptyProtobufList();

    static {
        C67322bz bzVar = new C67322bz();
        f182986c = bzVar;
        C62942bv.registerDefaultInstance(C67322bz.class, bzVar);
    }

    private C67322bz() {
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
                return newMessageInfo(f182986c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", C67316bt.class, "b", C67331ch.class});
            case 3:
                return new C67322bz();
            case 4:
                return new C67321by();
            case 5:
                return f182986c;
            case 6:
                C63010eb ebVar = f182987d;
                if (ebVar == null) {
                    synchronized (C67322bz.class) {
                        ebVar = f182987d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182986c);
                            f182987d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
