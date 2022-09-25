package com.google.android.apps.search.assistant.libraries.dictation.p8961b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.libraries.dictation.b.w */
/* compiled from: PG */
public final class C119301w extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C119301w f332677b;

    /* renamed from: c */
    private static volatile C63010eb f332678c;

    /* renamed from: a */
    public int f332679a;

    static {
        C119301w wVar = new C119301w();
        f332677b = wVar;
        C62942bv.registerDefaultInstance(C119301w.class, wVar);
    }

    private C119301w() {
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
                return newMessageInfo(f332677b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C119301w();
            case 4:
                return new C119300v();
            case 5:
                return f332677b;
            case 6:
                C63010eb ebVar = f332678c;
                if (ebVar == null) {
                    synchronized (C119301w.class) {
                        ebVar = f332678c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f332677b);
                            f332678c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
