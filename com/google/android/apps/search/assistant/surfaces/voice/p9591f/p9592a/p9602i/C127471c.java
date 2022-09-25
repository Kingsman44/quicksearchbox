package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.a.i.c */
/* compiled from: PG */
public final class C127471c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C127471c f350977d;

    /* renamed from: e */
    private static volatile C63010eb f350978e;

    /* renamed from: a */
    public int f350979a;

    /* renamed from: b */
    public int f350980b;

    /* renamed from: c */
    public int f350981c;

    static {
        C127471c cVar = new C127471c();
        f350977d = cVar;
        C62942bv.registerDefaultInstance(C127471c.class, cVar);
    }

    private C127471c() {
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
                return newMessageInfo(f350977d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002င\u0000", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C127471c();
            case 4:
                return new C127469a();
            case 5:
                return f350977d;
            case 6:
                C63010eb ebVar = f350978e;
                if (ebVar == null) {
                    synchronized (C127471c.class) {
                        ebVar = f350978e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f350977d);
                            f350978e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
