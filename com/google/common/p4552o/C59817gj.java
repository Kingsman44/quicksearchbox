package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.gj */
/* compiled from: PG */
public final class C59817gj extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C59817gj f161645e;

    /* renamed from: f */
    private static volatile C63010eb f161646f;

    /* renamed from: a */
    public int f161647a;

    /* renamed from: b */
    public int f161648b;

    /* renamed from: c */
    public String f161649c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f161650d;

    static {
        C59817gj gjVar = new C59817gj();
        f161645e = gjVar;
        C62942bv.registerDefaultInstance(C59817gj.class, gjVar);
    }

    private C59817gj() {
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
                return newMessageInfo(f161645e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C59815gh.f161644a, C45240c.f118157a, "d", C59812ge.f161643a});
            case 3:
                return new C59817gj();
            case 4:
                return new C59814gg();
            case 5:
                return f161645e;
            case 6:
                C63010eb ebVar = f161646f;
                if (ebVar == null) {
                    synchronized (C59817gj.class) {
                        ebVar = f161646f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161645e);
                            f161646f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
