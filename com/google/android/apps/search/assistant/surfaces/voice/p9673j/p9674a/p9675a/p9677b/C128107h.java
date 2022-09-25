package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.h */
/* compiled from: PG */
public final class C128107h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C128107h f352482a;

    /* renamed from: b */
    private static volatile C63010eb f352483b;

    static {
        C128107h hVar = new C128107h();
        f352482a = hVar;
        C62942bv.registerDefaultInstance(C128107h.class, hVar);
    }

    private C128107h() {
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
                return newMessageInfo(f352482a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C128107h();
            case 4:
                return new C128106g();
            case 5:
                return f352482a;
            case 6:
                C63010eb ebVar = f352483b;
                if (ebVar == null) {
                    synchronized (C128107h.class) {
                        ebVar = f352483b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352482a);
                            f352483b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
