package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.l */
/* compiled from: PG */
public final class C128111l extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C128111l f352488a;

    /* renamed from: b */
    private static volatile C63010eb f352489b;

    static {
        C128111l lVar = new C128111l();
        f352488a = lVar;
        C62942bv.registerDefaultInstance(C128111l.class, lVar);
    }

    private C128111l() {
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
                return newMessageInfo(f352488a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C128111l();
            case 4:
                return new C128110k();
            case 5:
                return f352488a;
            case 6:
                C63010eb ebVar = f352489b;
                if (ebVar == null) {
                    synchronized (C128111l.class) {
                        ebVar = f352489b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352488a);
                            f352489b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
