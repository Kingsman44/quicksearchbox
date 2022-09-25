package com.google.assistant.p3886c.p3887a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.a.x */
/* compiled from: PG */
public final class C50688x extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50688x f131868b;

    /* renamed from: c */
    private static volatile C63010eb f131869c;

    /* renamed from: a */
    public C62971cq f131870a = emptyProtobufList();

    static {
        C50688x xVar = new C50688x();
        f131868b = xVar;
        C62942bv.registerDefaultInstance(C50688x.class, xVar);
    }

    private C50688x() {
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
                return newMessageInfo(f131868b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C50686v.class});
            case 3:
                return new C50688x();
            case 4:
                return new C50687w();
            case 5:
                return f131868b;
            case 6:
                C63010eb ebVar = f131869c;
                if (ebVar == null) {
                    synchronized (C50688x.class) {
                        ebVar = f131869c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131868b);
                            f131869c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
