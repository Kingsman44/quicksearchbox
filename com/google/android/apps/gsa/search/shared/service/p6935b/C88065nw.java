package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.nw */
/* compiled from: PG */
public final class C88065nw extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C88065nw f238110d;

    /* renamed from: e */
    private static volatile C63010eb f238111e;

    /* renamed from: a */
    public int f238112a;

    /* renamed from: b */
    public long f238113b;

    /* renamed from: c */
    public String f238114c = BuildConfig.FLAVOR;

    static {
        C88065nw nwVar = new C88065nw();
        f238110d = nwVar;
        C62942bv.registerDefaultInstance(C88065nw.class, nwVar);
    }

    private C88065nw() {
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
                return newMessageInfo(f238110d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001စ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C88065nw();
            case 4:
                return new C88064nv();
            case 5:
                return f238110d;
            case 6:
                C63010eb ebVar = f238111e;
                if (ebVar == null) {
                    synchronized (C88065nw.class) {
                        ebVar = f238111e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238110d);
                            f238111e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
