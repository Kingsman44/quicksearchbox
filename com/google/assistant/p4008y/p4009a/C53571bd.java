package com.google.assistant.p4008y.p4009a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.a.bd */
/* compiled from: PG */
public final class C53571bd extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53571bd f140604b;

    /* renamed from: c */
    private static volatile C63010eb f140605c;

    /* renamed from: a */
    public C62971cq f140606a = emptyProtobufList();

    static {
        C53571bd bdVar = new C53571bd();
        f140604b = bdVar;
        C62942bv.registerDefaultInstance(C53571bd.class, bdVar);
    }

    private C53571bd() {
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
                return newMessageInfo(f140604b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C53583bp.class});
            case 3:
                return new C53571bd();
            case 4:
                return new C53570bc();
            case 5:
                return f140604b;
            case 6:
                C63010eb ebVar = f140605c;
                if (ebVar == null) {
                    synchronized (C53571bd.class) {
                        ebVar = f140605c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140604b);
                            f140605c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
