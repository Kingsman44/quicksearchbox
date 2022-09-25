package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.da */
/* compiled from: PG */
public final class C51785da extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51785da f135875e;

    /* renamed from: f */
    private static volatile C63010eb f135876f;

    /* renamed from: a */
    public int f135877a;

    /* renamed from: b */
    public String f135878b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f135879c = 1;

    /* renamed from: d */
    public C52230ka f135880d;

    static {
        C51785da daVar = new C51785da();
        f135875e = daVar;
        C62942bv.registerDefaultInstance(C51785da.class, daVar);
    }

    private C51785da() {
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
                return newMessageInfo(f135875e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C51785da();
            case 4:
                return new C51773cz();
            case 5:
                return f135875e;
            case 6:
                C63010eb ebVar = f135876f;
                if (ebVar == null) {
                    synchronized (C51785da.class) {
                        ebVar = f135876f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135875e);
                            f135876f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
