package com.google.android.apps.search.googleapp.discover.p10173aa;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.googleapp.discover.aa.az */
/* compiled from: PG */
public final class C134033az extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C134033az f365090d;

    /* renamed from: e */
    private static volatile C63010eb f365091e;

    /* renamed from: a */
    public int f365092a;

    /* renamed from: b */
    public C63042fg f365093b;

    /* renamed from: c */
    public String f365094c = BuildConfig.FLAVOR;

    static {
        C134033az azVar = new C134033az();
        f365090d = azVar;
        C62942bv.registerDefaultInstance(C134033az.class, azVar);
    }

    private C134033az() {
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
                return newMessageInfo(f365090d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C134033az();
            case 4:
                return new C134032ay();
            case 5:
                return f365090d;
            case 6:
                C63010eb ebVar = f365091e;
                if (ebVar == null) {
                    synchronized (C134033az.class) {
                        ebVar = f365091e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f365090d);
                            f365091e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
