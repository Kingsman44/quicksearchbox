package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9596c;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9601h.C127465c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.a.c.g */
/* compiled from: PG */
public final class C127430g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C127430g f350871c;

    /* renamed from: d */
    private static volatile C63010eb f350872d;

    /* renamed from: a */
    public C119834cb f350873a;

    /* renamed from: b */
    public C127465c f350874b;

    static {
        C127430g gVar = new C127430g();
        f350871c = gVar;
        C62942bv.registerDefaultInstance(C127430g.class, gVar);
    }

    private C127430g() {
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
                return newMessageInfo(f350871c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C127430g();
            case 4:
                return new C127429f();
            case 5:
                return f350871c;
            case 6:
                C63010eb ebVar = f350872d;
                if (ebVar == null) {
                    synchronized (C127430g.class) {
                        ebVar = f350872d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f350871c);
                            f350872d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
