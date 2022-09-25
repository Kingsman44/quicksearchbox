package com.google.android.apps.search.assistant.libraries.dictation.p8961b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.libraries.dictation.b.h */
/* compiled from: PG */
public final class C119286h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C119286h f332638c;

    /* renamed from: d */
    private static volatile C63010eb f332639d;

    /* renamed from: a */
    public int f332640a = 0;

    /* renamed from: b */
    public Object f332641b;

    static {
        C119286h hVar = new C119286h();
        f332638c = hVar;
        C62942bv.registerDefaultInstance(C119286h.class, hVar);
    }

    private C119286h() {
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
                return newMessageInfo(f332638c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", C119271ag.class, C119277am.class});
            case 3:
                return new C119286h();
            case 4:
                return new C119285g();
            case 5:
                return f332638c;
            case 6:
                C63010eb ebVar = f332639d;
                if (ebVar == null) {
                    synchronized (C119286h.class) {
                        ebVar = f332639d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f332638c);
                            f332639d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
