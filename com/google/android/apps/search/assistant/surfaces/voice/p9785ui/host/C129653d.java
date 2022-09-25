package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.d */
/* compiled from: PG */
public final class C129653d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C129653d f355840d;

    /* renamed from: e */
    private static volatile C63010eb f355841e;

    /* renamed from: a */
    public int f355842a;

    /* renamed from: b */
    public C129541aa f355843b;

    /* renamed from: c */
    public int f355844c;

    static {
        C129653d dVar = new C129653d();
        f355840d = dVar;
        C62942bv.registerDefaultInstance(C129653d.class, dVar);
    }

    private C129653d() {
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
                return newMessageInfo(f355840d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C129648c.m211699b()});
            case 3:
                return new C129653d();
            case 4:
                return new C129537a();
            case 5:
                return f355840d;
            case 6:
                C63010eb ebVar = f355841e;
                if (ebVar == null) {
                    synchronized (C129653d.class) {
                        ebVar = f355841e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f355840d);
                            f355841e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
