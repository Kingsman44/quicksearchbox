package com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9537c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.c.b */
/* compiled from: PG */
public final class C127142b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C127142b f350055a;

    /* renamed from: b */
    private static volatile C63010eb f350056b;

    static {
        C127142b bVar = new C127142b();
        f350055a = bVar;
        C62942bv.registerDefaultInstance(C127142b.class, bVar);
    }

    private C127142b() {
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
                return newMessageInfo(f350055a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C127142b();
            case 4:
                return new C127133a();
            case 5:
                return f350055a;
            case 6:
                C63010eb ebVar = f350056b;
                if (ebVar == null) {
                    synchronized (C127142b.class) {
                        ebVar = f350056b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f350055a);
                            f350056b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
