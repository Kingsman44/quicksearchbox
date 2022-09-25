package com.google.speech.p5228m;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.cn */
/* compiled from: PG */
public final class C67337cn extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C67337cn f183024e;

    /* renamed from: f */
    private static volatile C63010eb f183025f;

    /* renamed from: a */
    public int f183026a;

    /* renamed from: b */
    public int f183027b;

    /* renamed from: c */
    public C62971cq f183028c = emptyProtobufList();

    /* renamed from: d */
    public int f183029d;

    static {
        C67337cn cnVar = new C67337cn();
        f183024e = cnVar;
        C62942bv.registerDefaultInstance(C67337cn.class, cnVar);
    }

    private C67337cn() {
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
                return newMessageInfo(f183024e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002\u001b\u0003င\u0001", new Object[]{"a", "b", C45240c.f118157a, C67284ao.class, "d"});
            case 3:
                return new C67337cn();
            case 4:
                return new C67336cm();
            case 5:
                return f183024e;
            case 6:
                C63010eb ebVar = f183025f;
                if (ebVar == null) {
                    synchronized (C67337cn.class) {
                        ebVar = f183025f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183024e);
                            f183025f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
