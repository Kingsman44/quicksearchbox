package com.google.android.apps.search.fedora.p10099e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.fedora.e.av */
/* compiled from: PG */
public final class C132791av extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C132791av f362294d;

    /* renamed from: e */
    private static volatile C63010eb f362295e;

    /* renamed from: a */
    public int f362296a;

    /* renamed from: b */
    public String f362297b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f362298c;

    static {
        C132791av avVar = new C132791av();
        f362294d = avVar;
        C62942bv.registerDefaultInstance(C132791av.class, avVar);
    }

    private C132791av() {
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
                return newMessageInfo(f362294d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C132791av();
            case 4:
                return new C132790au();
            case 5:
                return f362294d;
            case 6:
                C63010eb ebVar = f362295e;
                if (ebVar == null) {
                    synchronized (C132791av.class) {
                        ebVar = f362295e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362294d);
                            f362295e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
