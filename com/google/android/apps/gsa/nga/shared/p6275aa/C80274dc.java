package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.C60470rb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.dc */
/* compiled from: PG */
public final class C80274dc extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C80274dc f220282e;

    /* renamed from: f */
    private static volatile C63010eb f220283f;

    /* renamed from: a */
    public int f220284a;

    /* renamed from: b */
    public String f220285b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f220286c;

    /* renamed from: d */
    public boolean f220287d;

    static {
        C80274dc dcVar = new C80274dc();
        f220282e = dcVar;
        C62942bv.registerDefaultInstance(C80274dc.class, dcVar);
    }

    private C80274dc() {
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
                return newMessageInfo(f220282e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0004ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, C60470rb.m92595b(), "d"});
            case 3:
                return new C80274dc();
            case 4:
                return new C80273db();
            case 5:
                return f220282e;
            case 6:
                C63010eb ebVar = f220283f;
                if (ebVar == null) {
                    synchronized (C80274dc.class) {
                        ebVar = f220283f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220282e);
                            f220283f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
