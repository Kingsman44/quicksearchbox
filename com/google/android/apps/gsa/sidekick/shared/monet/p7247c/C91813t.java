package com.google.android.apps.gsa.sidekick.shared.monet.p7247c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.c.t */
/* compiled from: PG */
public final class C91813t extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C91813t f256060d;

    /* renamed from: e */
    private static volatile C63010eb f256061e;

    /* renamed from: a */
    public int f256062a;

    /* renamed from: b */
    public long f256063b;

    /* renamed from: c */
    public boolean f256064c;

    static {
        C91813t tVar = new C91813t();
        f256060d = tVar;
        C62942bv.registerDefaultInstance(C91813t.class, tVar);
    }

    private C91813t() {
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
                return newMessageInfo(f256060d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C91813t();
            case 4:
                return new C91812s();
            case 5:
                return f256060d;
            case 6:
                C63010eb ebVar = f256061e;
                if (ebVar == null) {
                    synchronized (C91813t.class) {
                        ebVar = f256061e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f256060d);
                            f256061e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
