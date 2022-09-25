package com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9537c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.c.af */
/* compiled from: PG */
public final class C127139af extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C127139af f350052a;

    /* renamed from: b */
    private static volatile C63010eb f350053b;

    static {
        C127139af afVar = new C127139af();
        f350052a = afVar;
        C62942bv.registerDefaultInstance(C127139af.class, afVar);
    }

    private C127139af() {
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
                return newMessageInfo(f350052a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C127139af();
            case 4:
                return new C127138ae();
            case 5:
                return f350052a;
            case 6:
                C63010eb ebVar = f350053b;
                if (ebVar == null) {
                    synchronized (C127139af.class) {
                        ebVar = f350053b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f350052a);
                            f350053b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
