package com.google.protos.p4963bf.p4964a.p4965a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bf.a.a.bg */
/* compiled from: PG */
public final class C64585bg extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64585bg f175105b;

    /* renamed from: c */
    private static volatile C63010eb f175106c;

    /* renamed from: a */
    public C62971cq f175107a = emptyProtobufList();

    static {
        C64585bg bgVar = new C64585bg();
        f175105b = bgVar;
        C62942bv.registerDefaultInstance(C64585bg.class, bgVar);
    }

    private C64585bg() {
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
                return newMessageInfo(f175105b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C64584bf.class});
            case 3:
                return new C64585bg();
            case 4:
                return new C64582bd();
            case 5:
                return f175105b;
            case 6:
                C63010eb ebVar = f175106c;
                if (ebVar == null) {
                    synchronized (C64585bg.class) {
                        ebVar = f175106c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175105b);
                            f175106c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
