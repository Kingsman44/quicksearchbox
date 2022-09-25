package com.google.android.libraries.mdi.download;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.mdi.download.ad */
/* compiled from: PG */
public final class C28698ad extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C28698ad f77969b;

    /* renamed from: d */
    private static volatile C63010eb f77970d;

    /* renamed from: a */
    public String f77971a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f77972c;

    static {
        C28698ad adVar = new C28698ad();
        f77969b = adVar;
        C62942bv.registerDefaultInstance(C28698ad.class, adVar);
    }

    private C28698ad() {
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
                return newMessageInfo(f77969b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C28698ad();
            case 4:
                return new C28697ac();
            case 5:
                return f77969b;
            case 6:
                C63010eb ebVar = f77970d;
                if (ebVar == null) {
                    synchronized (C28698ad.class) {
                        ebVar = f77970d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f77969b);
                            f77970d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
