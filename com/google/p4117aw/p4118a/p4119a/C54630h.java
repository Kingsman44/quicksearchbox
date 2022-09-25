package com.google.p4117aw.p4118a.p4119a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aw.a.a.h */
/* compiled from: PG */
public final class C54630h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54630h f143438b;

    /* renamed from: c */
    private static volatile C63010eb f143439c;

    /* renamed from: a */
    public C62971cq f143440a = emptyProtobufList();

    static {
        C54630h hVar = new C54630h();
        f143438b = hVar;
        C62942bv.registerDefaultInstance(C54630h.class, hVar);
    }

    private C54630h() {
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
                return newMessageInfo(f143438b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C54628f.class});
            case 3:
                return new C54630h();
            case 4:
                return new C54629g();
            case 5:
                return f143438b;
            case 6:
                C63010eb ebVar = f143439c;
                if (ebVar == null) {
                    synchronized (C54630h.class) {
                        ebVar = f143439c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143438b);
                            f143439c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
