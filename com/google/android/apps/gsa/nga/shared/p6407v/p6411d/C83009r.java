package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.r */
/* compiled from: PG */
public final class C83009r extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C83009r f226516e;

    /* renamed from: f */
    private static volatile C63010eb f226517f;

    /* renamed from: a */
    public int f226518a;

    /* renamed from: b */
    public String f226519b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f226520c;

    /* renamed from: d */
    public String f226521d = BuildConfig.FLAVOR;

    static {
        C83009r rVar = new C83009r();
        f226516e = rVar;
        C62942bv.registerDefaultInstance(C83009r.class, rVar);
    }

    private C83009r() {
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
                return newMessageInfo(f226516e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C83009r();
            case 4:
                return new C83008q();
            case 5:
                return f226516e;
            case 6:
                C63010eb ebVar = f226517f;
                if (ebVar == null) {
                    synchronized (C83009r.class) {
                        ebVar = f226517f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226516e);
                            f226517f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
