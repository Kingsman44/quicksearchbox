package com.google.android.apps.gsa.search.core.p6807j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.C60494rz;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.core.j.f */
/* compiled from: PG */
public final class C86137f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C86137f f232804f;

    /* renamed from: g */
    private static volatile C63010eb f232805g;

    /* renamed from: a */
    public int f232806a;

    /* renamed from: b */
    public String f232807b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f232808c;

    /* renamed from: d */
    public int f232809d;

    /* renamed from: e */
    public long f232810e;

    static {
        C86137f fVar = new C86137f();
        f232804f = fVar;
        C62942bv.registerDefaultInstance(C86137f.class, fVar);
    }

    private C86137f() {
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
                return newMessageInfo(f232804f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C60494rz.m92599b(), "e"});
            case 3:
                return new C86137f();
            case 4:
                return new C86136e();
            case 5:
                return f232804f;
            case 6:
                C63010eb ebVar = f232805g;
                if (ebVar == null) {
                    synchronized (C86137f.class) {
                        ebVar = f232805g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f232804f);
                            f232805g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
