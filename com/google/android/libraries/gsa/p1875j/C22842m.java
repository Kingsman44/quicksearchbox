package com.google.android.libraries.gsa.p1875j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.gsa.j.m */
/* compiled from: PG */
public final class C22842m extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C22842m f62879d;

    /* renamed from: e */
    private static volatile C63010eb f62880e;

    /* renamed from: a */
    public int f62881a;

    /* renamed from: b */
    public String f62882b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f62883c = BuildConfig.FLAVOR;

    static {
        C22842m mVar = new C22842m();
        f62879d = mVar;
        C62942bv.registerDefaultInstance(C22842m.class, mVar);
    }

    private C22842m() {
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
                return newMessageInfo(f62879d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C22842m();
            case 4:
                return new C22841l();
            case 5:
                return f62879d;
            case 6:
                C63010eb ebVar = f62880e;
                if (ebVar == null) {
                    synchronized (C22842m.class) {
                        ebVar = f62880e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f62879d);
                            f62880e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
