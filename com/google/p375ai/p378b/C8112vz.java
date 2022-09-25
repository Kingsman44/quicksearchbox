package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.vz */
/* compiled from: PG */
public final class C8112vz extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8112vz f28525d;

    /* renamed from: f */
    private static volatile C63010eb f28526f;

    /* renamed from: a */
    public int f28527a;

    /* renamed from: b */
    public int f28528b;

    /* renamed from: c */
    public int f28529c;

    /* renamed from: e */
    private int f28530e;

    static {
        C8112vz vzVar = new C8112vz();
        f28525d = vzVar;
        C62942bv.registerDefaultInstance(C8112vz.class, vzVar);
    }

    private C8112vz() {
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
                return newMessageInfo(f28525d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C8112vz();
            case 4:
                return new C8111vy();
            case 5:
                return f28525d;
            case 6:
                C63010eb ebVar = f28526f;
                if (ebVar == null) {
                    synchronized (C8112vz.class) {
                        ebVar = f28526f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28525d);
                            f28526f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
