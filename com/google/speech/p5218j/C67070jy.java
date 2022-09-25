package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.jy */
/* compiled from: PG */
public final class C67070jy extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67070jy f182315b;

    /* renamed from: c */
    private static volatile C63010eb f182316c;

    /* renamed from: a */
    public C62971cq f182317a = emptyProtobufList();

    static {
        C67070jy jyVar = new C67070jy();
        f182315b = jyVar;
        C62942bv.registerDefaultInstance(C67070jy.class, jyVar);
    }

    private C67070jy() {
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
                return newMessageInfo(f182315b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C67034ip.class});
            case 3:
                return new C67070jy();
            case 4:
                return new C67069jx();
            case 5:
                return f182315b;
            case 6:
                C63010eb ebVar = f182316c;
                if (ebVar == null) {
                    synchronized (C67070jy.class) {
                        ebVar = f182316c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182315b);
                            f182316c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
