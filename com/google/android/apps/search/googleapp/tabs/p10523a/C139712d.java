package com.google.android.apps.search.googleapp.tabs.p10523a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.tabs.a.d */
/* compiled from: PG */
public final class C139712d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C139712d f379748d;

    /* renamed from: e */
    private static volatile C63010eb f379749e;

    /* renamed from: a */
    public int f379750a;

    /* renamed from: b */
    public int f379751b;

    /* renamed from: c */
    public String f379752c = BuildConfig.FLAVOR;

    static {
        C139712d dVar = new C139712d();
        f379748d = dVar;
        C62942bv.registerDefaultInstance(C139712d.class, dVar);
    }

    private C139712d() {
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
                return newMessageInfo(f379748d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C139711c.m227154b(), C45240c.f118157a});
            case 3:
                return new C139712d();
            case 4:
                return new C139709a();
            case 5:
                return f379748d;
            case 6:
                C63010eb ebVar = f379749e;
                if (ebVar == null) {
                    synchronized (C139712d.class) {
                        ebVar = f379749e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f379748d);
                            f379749e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
