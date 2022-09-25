package com.google.android.apps.search.assistant.verticals.ambient.p9917g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.g.m */
/* compiled from: PG */
public final class C130691m extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C130691m f357858a;

    /* renamed from: b */
    private static volatile C63010eb f357859b;

    static {
        C130691m mVar = new C130691m();
        f357858a = mVar;
        C62942bv.registerDefaultInstance(C130691m.class, mVar);
    }

    private C130691m() {
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
                return newMessageInfo(f357858a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C130691m();
            case 4:
                return new C130690l();
            case 5:
                return f357858a;
            case 6:
                C63010eb ebVar = f357859b;
                if (ebVar == null) {
                    synchronized (C130691m.class) {
                        ebVar = f357859b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f357858a);
                            f357859b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
