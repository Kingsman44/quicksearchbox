package com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.h.e.d */
/* compiled from: PG */
public final class C127925d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C127925d f352134b;

    /* renamed from: c */
    private static volatile C63010eb f352135c;

    /* renamed from: a */
    public int f352136a;

    static {
        C127925d dVar = new C127925d();
        f352134b = dVar;
        C62942bv.registerDefaultInstance(C127925d.class, dVar);
    }

    private C127925d() {
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
                return newMessageInfo(f352134b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C127925d();
            case 4:
                return new C127924c();
            case 5:
                return f352134b;
            case 6:
                C63010eb ebVar = f352135c;
                if (ebVar == null) {
                    synchronized (C127925d.class) {
                        ebVar = f352135c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352134b);
                            f352135c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
