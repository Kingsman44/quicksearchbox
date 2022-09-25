package com.google.speech.p5228m.p5229a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.a.h */
/* compiled from: PG */
public final class C67259h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67259h f182823c;

    /* renamed from: d */
    private static volatile C63010eb f182824d;

    /* renamed from: a */
    public C62971cq f182825a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f182826b = emptyProtobufList();

    static {
        C67259h hVar = new C67259h();
        f182823c = hVar;
        C62942bv.registerDefaultInstance(C67259h.class, hVar);
    }

    private C67259h() {
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
                return newMessageInfo(f182823c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", C67253b.class, "b", C67258g.class});
            case 3:
                return new C67259h();
            case 4:
                return new C67254c();
            case 5:
                return f182823c;
            case 6:
                C63010eb ebVar = f182824d;
                if (ebVar == null) {
                    synchronized (C67259h.class) {
                        ebVar = f182824d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182823c);
                            f182824d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
