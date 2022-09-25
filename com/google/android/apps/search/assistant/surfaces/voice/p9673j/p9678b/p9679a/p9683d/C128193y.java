package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.d.y */
/* compiled from: PG */
public final class C128193y extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C128193y f352653a;

    /* renamed from: b */
    private static volatile C63010eb f352654b;

    static {
        C128193y yVar = new C128193y();
        f352653a = yVar;
        C62942bv.registerDefaultInstance(C128193y.class, yVar);
    }

    private C128193y() {
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
                return newMessageInfo(f352653a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C128193y();
            case 4:
                return new C128192x();
            case 5:
                return f352653a;
            case 6:
                C63010eb ebVar = f352654b;
                if (ebVar == null) {
                    synchronized (C128193y.class) {
                        ebVar = f352654b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352653a);
                            f352654b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
