package com.google.common.p4552o.p4553a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80220bn;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.bj */
/* compiled from: PG */
public final class C59486bj extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59486bj f157824d;

    /* renamed from: e */
    private static volatile C63010eb f157825e;

    /* renamed from: a */
    public int f157826a;

    /* renamed from: b */
    public String f157827b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f157828c;

    static {
        C59486bj bjVar = new C59486bj();
        f157824d = bjVar;
        C62942bv.registerDefaultInstance(C59486bj.class, bjVar);
    }

    private C59486bj() {
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
                return newMessageInfo(f157824d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C80220bn.f220096a});
            case 3:
                return new C59486bj();
            case 4:
                return new C59485bi();
            case 5:
                return f157824d;
            case 6:
                C63010eb ebVar = f157825e;
                if (ebVar == null) {
                    synchronized (C59486bj.class) {
                        ebVar = f157825e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157824d);
                            f157825e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
