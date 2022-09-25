package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.ei */
/* compiled from: PG */
public final class C82893ei extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C82893ei f226110e;

    /* renamed from: f */
    private static volatile C63010eb f226111f;

    /* renamed from: a */
    public int f226112a;

    /* renamed from: b */
    public String f226113b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f226114c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f226115d = BuildConfig.FLAVOR;

    static {
        C82893ei eiVar = new C82893ei();
        f226110e = eiVar;
        C62942bv.registerDefaultInstance(C82893ei.class, eiVar);
    }

    private C82893ei() {
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
                return newMessageInfo(f226110e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C82893ei();
            case 4:
                return new C82892eh();
            case 5:
                return f226110e;
            case 6:
                C63010eb ebVar = f226111f;
                if (ebVar == null) {
                    synchronized (C82893ei.class) {
                        ebVar = f226111f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226110e);
                            f226111f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
