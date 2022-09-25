package com.google.speech.p5228m;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.bf */
/* compiled from: PG */
public final class C67302bf extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67302bf f182938c;

    /* renamed from: e */
    private static volatile C63010eb f182939e;

    /* renamed from: a */
    public boolean f182940a;

    /* renamed from: b */
    public C62971cq f182941b = emptyProtobufList();

    /* renamed from: d */
    private int f182942d;

    static {
        C67302bf bfVar = new C67302bf();
        f182938c = bfVar;
        C62942bv.registerDefaultInstance(C67302bf.class, bfVar);
    }

    private C67302bf() {
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
                return newMessageInfo(f182938c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001b", new Object[]{"d", "a", "b", C67300bd.class});
            case 3:
                return new C67302bf();
            case 4:
                return new C67301be();
            case 5:
                return f182938c;
            case 6:
                C63010eb ebVar = f182939e;
                if (ebVar == null) {
                    synchronized (C67302bf.class) {
                        ebVar = f182939e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182938c);
                            f182939e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
