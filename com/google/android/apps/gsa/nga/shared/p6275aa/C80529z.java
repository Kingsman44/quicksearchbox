package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.z */
/* compiled from: PG */
public final class C80529z extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C80529z f221064f;

    /* renamed from: g */
    private static volatile C63010eb f221065g;

    /* renamed from: a */
    public int f221066a;

    /* renamed from: b */
    public String f221067b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f221068c;

    /* renamed from: d */
    public String f221069d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public long f221070e;

    static {
        C80529z zVar = new C80529z();
        f221064f = zVar;
        C62942bv.registerDefaultInstance(C80529z.class, zVar);
    }

    private C80529z() {
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
                return newMessageInfo(f221064f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", C45240c.f118157a, C65753ak.m96798c(), "d", "e"});
            case 3:
                return new C80529z();
            case 4:
                return new C80528y();
            case 5:
                return f221064f;
            case 6:
                C63010eb ebVar = f221065g;
                if (ebVar == null) {
                    synchronized (C80529z.class) {
                        ebVar = f221065g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221064f);
                            f221065g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
