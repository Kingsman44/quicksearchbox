package com.google.android.apps.gsa.search.core.p6511ah;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62959cf;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.core.ah.l */
/* compiled from: PG */
public final class C84505l extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C84505l f229979f;

    /* renamed from: g */
    private static volatile C63010eb f229980g;

    /* renamed from: a */
    public int f229981a;

    /* renamed from: b */
    public int f229982b;

    /* renamed from: c */
    public int f229983c;

    /* renamed from: d */
    public int f229984d;

    /* renamed from: e */
    public String f229985e = BuildConfig.FLAVOR;

    static {
        C84505l lVar = new C84505l();
        f229979f = lVar;
        C62942bv.registerDefaultInstance(C84505l.class, lVar);
    }

    private C84505l() {
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
                Object[] objArr = new Object[7];
                objArr[0] = "a";
                objArr[1] = "b";
                C62959cf cfVar = C84503j.f229978a;
                objArr[5] = cfVar;
                objArr[2] = cfVar;
                objArr[3] = C45240c.f118157a;
                objArr[4] = "d";
                objArr[6] = "e";
                return newMessageInfo(f229979f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဌ\u0002\u0004ဈ\u0003", objArr);
            case 3:
                return new C84505l();
            case 4:
                return new C84502i();
            case 5:
                return f229979f;
            case 6:
                C63010eb ebVar = f229980g;
                if (ebVar == null) {
                    synchronized (C84505l.class) {
                        ebVar = f229980g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f229979f);
                            f229980g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
