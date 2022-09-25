package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.xy */
/* compiled from: PG */
public final class C88337xy extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C88337xy f238901d;

    /* renamed from: e */
    private static volatile C63010eb f238902e;

    /* renamed from: a */
    public int f238903a;

    /* renamed from: b */
    public String f238904b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f238905c;

    static {
        C88337xy xyVar = new C88337xy();
        f238901d = xyVar;
        C62942bv.registerDefaultInstance(C88337xy.class, xyVar);
    }

    private C88337xy() {
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
                return newMessageInfo(f238901d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C88337xy();
            case 4:
                return new C88336xx();
            case 5:
                return f238901d;
            case 6:
                C63010eb ebVar = f238902e;
                if (ebVar == null) {
                    synchronized (C88337xy.class) {
                        ebVar = f238902e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238901d);
                            f238902e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
