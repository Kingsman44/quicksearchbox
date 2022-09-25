package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.uj */
/* compiled from: PG */
public final class C8069uj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8069uj f28398c;

    /* renamed from: e */
    private static volatile C63010eb f28399e;

    /* renamed from: a */
    public int f28400a;

    /* renamed from: b */
    public int f28401b = 1;

    /* renamed from: d */
    private int f28402d;

    static {
        C8069uj ujVar = new C8069uj();
        f28398c = ujVar;
        C62942bv.registerDefaultInstance(C8069uj.class, ujVar);
    }

    private C8069uj() {
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
                return newMessageInfo(f28398c, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001င\u0000\u0004ဌ\u0001", new Object[]{"d", "a", "b", C8067uh.f28397a});
            case 3:
                return new C8069uj();
            case 4:
                return new C8066ug();
            case 5:
                return f28398c;
            case 6:
                C63010eb ebVar = f28399e;
                if (ebVar == null) {
                    synchronized (C8069uj.class) {
                        ebVar = f28399e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28398c);
                            f28399e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
