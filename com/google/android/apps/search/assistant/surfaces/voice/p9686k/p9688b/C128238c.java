package com.google.android.apps.search.assistant.surfaces.voice.p9686k.p9688b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.k.b.c */
/* compiled from: PG */
public final class C128238c extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C128238c f352738b;

    /* renamed from: c */
    private static volatile C63010eb f352739c;

    /* renamed from: a */
    public C62995dn f352740a = C62995dn.f170057a;

    static {
        C128238c cVar = new C128238c();
        f352738b = cVar;
        C62942bv.registerDefaultInstance(C128238c.class, cVar);
    }

    private C128238c() {
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
                return newMessageInfo(f352738b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C128237b.f352737a});
            case 3:
                return new C128238c();
            case 4:
                return new C128236a();
            case 5:
                return f352738b;
            case 6:
                C63010eb ebVar = f352739c;
                if (ebVar == null) {
                    synchronized (C128238c.class) {
                        ebVar = f352739c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352738b);
                            f352739c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
