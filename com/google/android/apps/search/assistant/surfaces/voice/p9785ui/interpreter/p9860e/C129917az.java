package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.az */
/* compiled from: PG */
public final class C129917az extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C129917az f356362b;

    /* renamed from: c */
    private static volatile C63010eb f356363c;

    /* renamed from: a */
    public boolean f356364a;

    static {
        C129917az azVar = new C129917az();
        f356362b = azVar;
        C62942bv.registerDefaultInstance(C129917az.class, azVar);
    }

    private C129917az() {
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
                return newMessageInfo(f356362b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            case 3:
                return new C129917az();
            case 4:
                return new C129916ay();
            case 5:
                return f356362b;
            case 6:
                C63010eb ebVar = f356363c;
                if (ebVar == null) {
                    synchronized (C129917az.class) {
                        ebVar = f356363c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f356362b);
                            f356363c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
