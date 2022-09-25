package com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8129b.p8132c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.b.b.c.b */
/* compiled from: PG */
public final class C105148b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C105148b f293111f;

    /* renamed from: g */
    private static volatile C63010eb f293112g;

    /* renamed from: a */
    public int f293113a;

    /* renamed from: b */
    public String f293114b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f293115c;

    /* renamed from: d */
    public C105152f f293116d;

    /* renamed from: e */
    public boolean f293117e;

    static {
        C105148b bVar = new C105148b();
        f293111f = bVar;
        C62942bv.registerDefaultInstance(C105148b.class, bVar);
    }

    private C105148b() {
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
                return newMessageInfo(f293111f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C105148b();
            case 4:
                return new C105147a();
            case 5:
                return f293111f;
            case 6:
                C63010eb ebVar = f293112g;
                if (ebVar == null) {
                    synchronized (C105148b.class) {
                        ebVar = f293112g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f293111f);
                            f293112g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
