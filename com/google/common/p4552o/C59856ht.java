package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ht */
/* compiled from: PG */
public final class C59856ht extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59856ht f161758d;

    /* renamed from: e */
    private static volatile C63010eb f161759e;

    /* renamed from: a */
    public int f161760a;

    /* renamed from: b */
    public String f161761b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f161762c = BuildConfig.FLAVOR;

    static {
        C59856ht htVar = new C59856ht();
        f161758d = htVar;
        C62942bv.registerDefaultInstance(C59856ht.class, htVar);
    }

    private C59856ht() {
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
                return newMessageInfo(f161758d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C59856ht();
            case 4:
                return new C59855hs();
            case 5:
                return f161758d;
            case 6:
                C63010eb ebVar = f161759e;
                if (ebVar == null) {
                    synchronized (C59856ht.class) {
                        ebVar = f161759e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161758d);
                            f161759e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
