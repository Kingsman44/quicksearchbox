package com.google.android.apps.gsa.nga.shared.p6345h;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.cc */
/* compiled from: PG */
public final class C81299cc extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C81299cc f222543e;

    /* renamed from: f */
    private static volatile C63010eb f222544f;

    /* renamed from: a */
    public int f222545a;

    /* renamed from: b */
    public String f222546b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f222547c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public double f222548d;

    static {
        C81299cc ccVar = new C81299cc();
        f222543e = ccVar;
        C62942bv.registerDefaultInstance(C81299cc.class, ccVar);
    }

    private C81299cc() {
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
                return newMessageInfo(f222543e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003က\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C81299cc();
            case 4:
                return new C81298cb();
            case 5:
                return f222543e;
            case 6:
                C63010eb ebVar = f222544f;
                if (ebVar == null) {
                    synchronized (C81299cc.class) {
                        ebVar = f222544f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222543e);
                            f222544f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
