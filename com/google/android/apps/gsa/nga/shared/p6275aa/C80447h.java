package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.h */
/* compiled from: PG */
public final class C80447h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C80447h f220803d;

    /* renamed from: e */
    private static volatile C63010eb f220804e;

    /* renamed from: a */
    public int f220805a;

    /* renamed from: b */
    public String f220806b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f220807c;

    static {
        C80447h hVar = new C80447h();
        f220803d = hVar;
        C62942bv.registerDefaultInstance(C80447h.class, hVar);
    }

    private C80447h() {
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
                return newMessageInfo(f220803d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C80447h();
            case 4:
                return new C80407g();
            case 5:
                return f220803d;
            case 6:
                C63010eb ebVar = f220804e;
                if (ebVar == null) {
                    synchronized (C80447h.class) {
                        ebVar = f220804e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220803d);
                            f220804e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
