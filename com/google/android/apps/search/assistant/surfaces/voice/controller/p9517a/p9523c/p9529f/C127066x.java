package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.x */
/* compiled from: PG */
public final class C127066x extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C127066x f349885a;

    /* renamed from: b */
    private static volatile C63010eb f349886b;

    static {
        C127066x xVar = new C127066x();
        f349885a = xVar;
        C62942bv.registerDefaultInstance(C127066x.class, xVar);
    }

    private C127066x() {
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
                return newMessageInfo(f349885a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C127066x();
            case 4:
                return new C127065w();
            case 5:
                return f349885a;
            case 6:
                C63010eb ebVar = f349886b;
                if (ebVar == null) {
                    synchronized (C127066x.class) {
                        ebVar = f349886b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f349885a);
                            f349886b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
