package com.google.protos.p4850an.p4855d.p4857b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4850an.p4855d.p4864i.C63579b;

/* renamed from: com.google.protos.an.d.b.l */
/* compiled from: PG */
public final class C63486l extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63486l f171557a;

    /* renamed from: f */
    private static volatile C63010eb f171558f;

    /* renamed from: b */
    private int f171559b;

    /* renamed from: c */
    private C63579b f171560c;

    /* renamed from: d */
    private C63579b f171561d;

    /* renamed from: e */
    private byte f171562e = 2;

    static {
        C63486l lVar = new C63486l();
        f171557a = lVar;
        C62942bv.registerDefaultInstance(C63486l.class, lVar);
    }

    private C63486l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171562e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171562e = b;
                return null;
            case 2:
                return newMessageInfo(f171557a, "\u0001\u0002\u0000\u0001\u0003\u0007\u0002\u0000\u0000\u0002\u0003ᐉ\u0005\u0007ᐉ\u0004", new Object[]{"b", "d", C45240c.f118157a});
            case 3:
                return new C63486l();
            case 4:
                return new C63485k();
            case 5:
                return f171557a;
            case 6:
                C63010eb ebVar = f171558f;
                if (ebVar == null) {
                    synchronized (C63486l.class) {
                        ebVar = f171558f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171557a);
                            f171558f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
