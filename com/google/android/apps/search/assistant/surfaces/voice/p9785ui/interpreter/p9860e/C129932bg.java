package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.bg */
/* compiled from: PG */
public final class C129932bg extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C129932bg f356393b;

    /* renamed from: c */
    private static volatile C63010eb f356394c;

    /* renamed from: a */
    public int f356395a;

    static {
        C129932bg bgVar = new C129932bg();
        f356393b = bgVar;
        C62942bv.registerDefaultInstance(C129932bg.class, bgVar);
    }

    private C129932bg() {
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
                return newMessageInfo(f356393b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C129932bg();
            case 4:
                return new C129931bf();
            case 5:
                return f356393b;
            case 6:
                C63010eb ebVar = f356394c;
                if (ebVar == null) {
                    synchronized (C129932bg.class) {
                        ebVar = f356394c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f356393b);
                            f356394c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
