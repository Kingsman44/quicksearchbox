package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.dl */
/* compiled from: PG */
public final class C124700dl extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C124700dl f344019d;

    /* renamed from: e */
    private static volatile C63010eb f344020e;

    /* renamed from: a */
    public int f344021a;

    /* renamed from: b */
    public String f344022b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f344023c;

    static {
        C124700dl dlVar = new C124700dl();
        f344019d = dlVar;
        C62942bv.registerDefaultInstance(C124700dl.class, dlVar);
    }

    private C124700dl() {
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
                return newMessageInfo(f344019d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C124700dl();
            case 4:
                return new C124699dk();
            case 5:
                return f344019d;
            case 6:
                C63010eb ebVar = f344020e;
                if (ebVar == null) {
                    synchronized (C124700dl.class) {
                        ebVar = f344020e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f344019d);
                            f344020e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
