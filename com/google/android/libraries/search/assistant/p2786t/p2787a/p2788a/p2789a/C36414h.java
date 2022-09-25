package com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a.p2789a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.t.a.a.a.h */
/* compiled from: PG */
public final class C36414h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C36414h f95100a;

    /* renamed from: b */
    private static volatile C63010eb f95101b;

    static {
        C36414h hVar = new C36414h();
        f95100a = hVar;
        C62942bv.registerDefaultInstance(C36414h.class, hVar);
    }

    private C36414h() {
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
                return newMessageInfo(f95100a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C36414h();
            case 4:
                return new C36413g();
            case 5:
                return f95100a;
            case 6:
                C63010eb ebVar = f95101b;
                if (ebVar == null) {
                    synchronized (C36414h.class) {
                        ebVar = f95101b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f95100a);
                            f95101b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
