package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e;

import com.google.protobuf.C62912at;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.as */
/* compiled from: PG */
public final class C129910as extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C129910as f356356c;

    /* renamed from: d */
    private static volatile C63010eb f356357d;

    /* renamed from: a */
    public int f356358a = 0;

    /* renamed from: b */
    public Object f356359b;

    static {
        C129910as asVar = new C129910as();
        f356356c = asVar;
        C62942bv.registerDefaultInstance(C129910as.class, asVar);
    }

    private C129910as() {
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
                return newMessageInfo(f356356c, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"b", "a", C129906ao.class, C62912at.class, C129908aq.class});
            case 3:
                return new C129910as();
            case 4:
                return new C129904am();
            case 5:
                return f356356c;
            case 6:
                C63010eb ebVar = f356357d;
                if (ebVar == null) {
                    synchronized (C129910as.class) {
                        ebVar = f356357d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f356356c);
                            f356357d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
