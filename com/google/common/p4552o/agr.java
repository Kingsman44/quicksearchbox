package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.agr */
/* compiled from: PG */
public final class agr extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final agr f158661e;

    /* renamed from: f */
    private static volatile C63010eb f158662f;

    /* renamed from: a */
    public int f158663a;

    /* renamed from: b */
    public int f158664b;

    /* renamed from: c */
    public int f158665c;

    /* renamed from: d */
    public String f158666d = BuildConfig.FLAVOR;

    static {
        agr agr = new agr();
        f158661e = agr;
        C62942bv.registerDefaultInstance(agr.class, agr);
    }

    private agr() {
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
                return newMessageInfo(f158661e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002င\u0001\u0003ဌ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, agq.f158660a, "d"});
            case 3:
                return new agr();
            case 4:
                return new agp();
            case 5:
                return f158661e;
            case 6:
                C63010eb ebVar = f158662f;
                if (ebVar == null) {
                    synchronized (agr.class) {
                        ebVar = f158662f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158661e);
                            f158662f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
