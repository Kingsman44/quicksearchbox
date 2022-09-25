package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.aq */
/* compiled from: PG */
public final class C129908aq extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C129908aq f356354a;

    /* renamed from: b */
    private static volatile C63010eb f356355b;

    static {
        C129908aq aqVar = new C129908aq();
        f356354a = aqVar;
        C62942bv.registerDefaultInstance(C129908aq.class, aqVar);
    }

    private C129908aq() {
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
                return newMessageInfo(f356354a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C129908aq();
            case 4:
                return new C129907ap();
            case 5:
                return f356354a;
            case 6:
                C63010eb ebVar = f356355b;
                if (ebVar == null) {
                    synchronized (C129908aq.class) {
                        ebVar = f356355b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f356354a);
                            f356355b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
