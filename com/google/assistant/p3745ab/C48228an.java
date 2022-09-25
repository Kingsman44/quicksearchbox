package com.google.assistant.p3745ab;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.an */
/* compiled from: PG */
public final class C48228an extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48228an f124774c;

    /* renamed from: e */
    private static volatile C63010eb f124775e;

    /* renamed from: a */
    public C62971cq f124776a = emptyProtobufList();

    /* renamed from: b */
    public boolean f124777b;

    /* renamed from: d */
    private byte f124778d = 2;

    static {
        C48228an anVar = new C48228an();
        f124774c = anVar;
        C62942bv.registerDefaultInstance(C48228an.class, anVar);
    }

    private C48228an() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f124778d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f124778d = b;
                return null;
            case 2:
                return newMessageInfo(f124774c, "\u0000\u0002\u0000\u0000\u0001\u0005\u0002\u0000\u0001\u0001\u0001\u0007\u0005Л", new Object[]{"b", "a", C48226al.class});
            case 3:
                return new C48228an();
            case 4:
                return new C48227am();
            case 5:
                return f124774c;
            case 6:
                C63010eb ebVar = f124775e;
                if (ebVar == null) {
                    synchronized (C48228an.class) {
                        ebVar = f124775e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124774c);
                            f124775e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
