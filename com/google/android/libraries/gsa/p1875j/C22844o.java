package com.google.android.libraries.gsa.p1875j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.gsa.j.o */
/* compiled from: PG */
public final class C22844o extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C22844o f62884e;

    /* renamed from: f */
    private static volatile C63010eb f62885f;

    /* renamed from: a */
    public int f62886a;

    /* renamed from: b */
    public String f62887b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f62888c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f62889d = BuildConfig.FLAVOR;

    static {
        C22844o oVar = new C22844o();
        f62884e = oVar;
        C62942bv.registerDefaultInstance(C22844o.class, oVar);
    }

    private C22844o() {
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
                return newMessageInfo(f62884e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C22844o();
            case 4:
                return new C22843n();
            case 5:
                return f62884e;
            case 6:
                C63010eb ebVar = f62885f;
                if (ebVar == null) {
                    synchronized (C22844o.class) {
                        ebVar = f62885f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f62884e);
                            f62885f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
