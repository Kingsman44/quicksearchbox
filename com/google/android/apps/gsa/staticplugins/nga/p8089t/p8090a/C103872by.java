package com.google.android.apps.gsa.staticplugins.nga.p8089t.p8090a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.a.by */
/* compiled from: PG */
public final class C103872by extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C103872by f289147e;

    /* renamed from: f */
    private static volatile C63010eb f289148f;

    /* renamed from: a */
    public int f289149a;

    /* renamed from: b */
    public int f289150b;

    /* renamed from: c */
    public String f289151c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f289152d = BuildConfig.FLAVOR;

    static {
        C103872by byVar = new C103872by();
        f289147e = byVar;
        C62942bv.registerDefaultInstance(C103872by.class, byVar);
    }

    private C103872by() {
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
                return newMessageInfo(f289147e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C103872by();
            case 4:
                return new C103871bx();
            case 5:
                return f289147e;
            case 6:
                C63010eb ebVar = f289148f;
                if (ebVar == null) {
                    synchronized (C103872by.class) {
                        ebVar = f289148f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f289147e);
                            f289148f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
