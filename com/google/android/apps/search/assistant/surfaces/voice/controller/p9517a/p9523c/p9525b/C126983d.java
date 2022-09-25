package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.b.d */
/* compiled from: PG */
public final class C126983d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C126983d f349653a;

    /* renamed from: b */
    private static volatile C63010eb f349654b;

    static {
        C126983d dVar = new C126983d();
        f349653a = dVar;
        C62942bv.registerDefaultInstance(C126983d.class, dVar);
    }

    private C126983d() {
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
                return newMessageInfo(f349653a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C126983d();
            case 4:
                return new C126982c();
            case 5:
                return f349653a;
            case 6:
                C63010eb ebVar = f349654b;
                if (ebVar == null) {
                    synchronized (C126983d.class) {
                        ebVar = f349654b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f349653a);
                            f349654b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
