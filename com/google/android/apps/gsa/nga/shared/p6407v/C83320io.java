package com.google.android.apps.gsa.nga.shared.p6407v;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.io */
/* compiled from: PG */
public final class C83320io extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C83320io f227132d;

    /* renamed from: e */
    private static volatile C63010eb f227133e;

    /* renamed from: a */
    public int f227134a;

    /* renamed from: b */
    public String f227135b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f227136c = BuildConfig.FLAVOR;

    static {
        C83320io ioVar = new C83320io();
        f227132d = ioVar;
        C62942bv.registerDefaultInstance(C83320io.class, ioVar);
    }

    private C83320io() {
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
                return newMessageInfo(f227132d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C83320io();
            case 4:
                return new C83319in();
            case 5:
                return f227132d;
            case 6:
                C63010eb ebVar = f227133e;
                if (ebVar == null) {
                    synchronized (C83320io.class) {
                        ebVar = f227133e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f227132d);
                            f227133e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
