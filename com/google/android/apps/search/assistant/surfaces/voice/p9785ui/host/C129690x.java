package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.x */
/* compiled from: PG */
public final class C129690x extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C129690x f355915a;

    /* renamed from: b */
    private static volatile C63010eb f355916b;

    static {
        C129690x xVar = new C129690x();
        f355915a = xVar;
        C62942bv.registerDefaultInstance(C129690x.class, xVar);
    }

    private C129690x() {
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
                return newMessageInfo(f355915a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C129690x();
            case 4:
                return new C129689w();
            case 5:
                return f355915a;
            case 6:
                C63010eb ebVar = f355916b;
                if (ebVar == null) {
                    synchronized (C129690x.class) {
                        ebVar = f355916b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f355915a);
                            f355916b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
