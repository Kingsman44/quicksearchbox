package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.b.k */
/* compiled from: PG */
public final class C126990k extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C126990k f349679a;

    /* renamed from: b */
    private static volatile C63010eb f349680b;

    static {
        C126990k kVar = new C126990k();
        f349679a = kVar;
        C62942bv.registerDefaultInstance(C126990k.class, kVar);
    }

    private C126990k() {
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
                return newMessageInfo(f349679a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C126990k();
            case 4:
                return new C126989j();
            case 5:
                return f349679a;
            case 6:
                C63010eb ebVar = f349680b;
                if (ebVar == null) {
                    synchronized (C126990k.class) {
                        ebVar = f349680b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f349679a);
                            f349680b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
