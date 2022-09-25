package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.xm */
/* compiled from: PG */
public final class C50449xm extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50449xm f131299b;

    /* renamed from: c */
    private static volatile C63010eb f131300c;

    /* renamed from: a */
    public C62971cq f131301a = C62942bv.emptyProtobufList();

    static {
        C50449xm xmVar = new C50449xm();
        f131299b = xmVar;
        C62942bv.registerDefaultInstance(C50449xm.class, xmVar);
    }

    private C50449xm() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f131299b, "\u0001\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0000\b\u001a", new Object[]{"a"});
            case 3:
                return new C50449xm();
            case 4:
                return new C50448xl();
            case 5:
                return f131299b;
            case 6:
                C63010eb ebVar = f131300c;
                if (ebVar == null) {
                    synchronized (C50449xm.class) {
                        ebVar = f131300c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131299b);
                            f131300c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
