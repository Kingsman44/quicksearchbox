package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.f.a.c */
/* compiled from: PG */
public final class C115433c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C115433c f320256d;

    /* renamed from: e */
    private static volatile C63010eb f320257e;

    /* renamed from: a */
    public int f320258a;

    /* renamed from: b */
    public int f320259b;

    /* renamed from: c */
    public String f320260c = BuildConfig.FLAVOR;

    static {
        C115433c cVar = new C115433c();
        f320256d = cVar;
        C62942bv.registerDefaultInstance(C115433c.class, cVar);
    }

    private C115433c() {
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
                return newMessageInfo(f320256d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C115435e.m191425b(), C45240c.f118157a});
            case 3:
                return new C115433c();
            case 4:
                return new C115432b();
            case 5:
                return f320256d;
            case 6:
                C63010eb ebVar = f320257e;
                if (ebVar == null) {
                    synchronized (C115433c.class) {
                        ebVar = f320257e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f320256d);
                            f320257e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
