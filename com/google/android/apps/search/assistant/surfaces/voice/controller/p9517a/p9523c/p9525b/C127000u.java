package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.b.u */
/* compiled from: PG */
public final class C127000u extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C127000u f349717a;

    /* renamed from: b */
    private static volatile C63010eb f349718b;

    static {
        C127000u uVar = new C127000u();
        f349717a = uVar;
        C62942bv.registerDefaultInstance(C127000u.class, uVar);
    }

    private C127000u() {
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
                return newMessageInfo(f349717a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C127000u();
            case 4:
                return new C126999t();
            case 5:
                return f349717a;
            case 6:
                C63010eb ebVar = f349718b;
                if (ebVar == null) {
                    synchronized (C127000u.class) {
                        ebVar = f349718b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f349717a);
                            f349718b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
