package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.bu */
/* compiled from: PG */
public final class C80227bu extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C80227bu f220106d;

    /* renamed from: e */
    private static volatile C63010eb f220107e;

    /* renamed from: a */
    public int f220108a;

    /* renamed from: b */
    public String f220109b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f220110c = BuildConfig.FLAVOR;

    static {
        C80227bu buVar = new C80227bu();
        f220106d = buVar;
        C62942bv.registerDefaultInstance(C80227bu.class, buVar);
    }

    private C80227bu() {
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
                return newMessageInfo(f220106d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C80227bu();
            case 4:
                return new C80226bt();
            case 5:
                return f220106d;
            case 6:
                C63010eb ebVar = f220107e;
                if (ebVar == null) {
                    synchronized (C80227bu.class) {
                        ebVar = f220107e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220106d);
                            f220107e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
