package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.i */
/* compiled from: PG */
public final class C129958i extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C129958i f356427a;

    /* renamed from: b */
    private static volatile C63010eb f356428b;

    static {
        C129958i iVar = new C129958i();
        f356427a = iVar;
        C62942bv.registerDefaultInstance(C129958i.class, iVar);
    }

    private C129958i() {
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
                return newMessageInfo(f356427a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C129958i();
            case 4:
                return new C129957h();
            case 5:
                return f356427a;
            case 6:
                C63010eb ebVar = f356428b;
                if (ebVar == null) {
                    synchronized (C129958i.class) {
                        ebVar = f356428b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f356427a);
                            f356428b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
