package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9596c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.a.c.l */
/* compiled from: PG */
public final class C127435l extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C127435l f350884b;

    /* renamed from: c */
    private static volatile C63010eb f350885c;

    /* renamed from: a */
    public int f350886a;

    static {
        C127435l lVar = new C127435l();
        f350884b = lVar;
        C62942bv.registerDefaultInstance(C127435l.class, lVar);
    }

    private C127435l() {
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
                return newMessageInfo(f350884b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C127435l();
            case 4:
                return new C127433j();
            case 5:
                return f350884b;
            case 6:
                C63010eb ebVar = f350885c;
                if (ebVar == null) {
                    synchronized (C127435l.class) {
                        ebVar = f350885c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f350884b);
                            f350885c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
