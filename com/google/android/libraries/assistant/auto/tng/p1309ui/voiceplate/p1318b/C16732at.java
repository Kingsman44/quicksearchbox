package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.at */
/* compiled from: PG */
public final class C16732at extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C16732at f48938c;

    /* renamed from: d */
    private static volatile C63010eb f48939d;

    /* renamed from: a */
    public int f48940a;

    /* renamed from: b */
    public String f48941b = BuildConfig.FLAVOR;

    static {
        C16732at atVar = new C16732at();
        f48938c = atVar;
        C62942bv.registerDefaultInstance(C16732at.class, atVar);
    }

    private C16732at() {
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
                return newMessageInfo(f48938c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C16732at();
            case 4:
                return new C16731as();
            case 5:
                return f48938c;
            case 6:
                C63010eb ebVar = f48939d;
                if (ebVar == null) {
                    synchronized (C16732at.class) {
                        ebVar = f48939d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48938c);
                            f48939d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
