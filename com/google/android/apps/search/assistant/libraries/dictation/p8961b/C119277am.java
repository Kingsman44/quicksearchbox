package com.google.android.apps.search.assistant.libraries.dictation.p8961b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.libraries.dictation.b.am */
/* compiled from: PG */
public final class C119277am extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C119277am f332624b;

    /* renamed from: c */
    private static volatile C63010eb f332625c;

    /* renamed from: a */
    public int f332626a;

    static {
        C119277am amVar = new C119277am();
        f332624b = amVar;
        C62942bv.registerDefaultInstance(C119277am.class, amVar);
    }

    private C119277am() {
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
                return newMessageInfo(f332624b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C119277am();
            case 4:
                return new C119276al();
            case 5:
                return f332624b;
            case 6:
                C63010eb ebVar = f332625c;
                if (ebVar == null) {
                    synchronized (C119277am.class) {
                        ebVar = f332625c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f332624b);
                            f332625c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
