package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.av */
/* compiled from: PG */
public final class C16734av extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C16734av f48942d;

    /* renamed from: e */
    private static volatile C63010eb f48943e;

    /* renamed from: a */
    public int f48944a;

    /* renamed from: b */
    public boolean f48945b;

    /* renamed from: c */
    public String f48946c = BuildConfig.FLAVOR;

    static {
        C16734av avVar = new C16734av();
        f48942d = avVar;
        C62942bv.registerDefaultInstance(C16734av.class, avVar);
    }

    private C16734av() {
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
                return newMessageInfo(f48942d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C16734av();
            case 4:
                return new C16733au();
            case 5:
                return f48942d;
            case 6:
                C63010eb ebVar = f48943e;
                if (ebVar == null) {
                    synchronized (C16734av.class) {
                        ebVar = f48943e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48942d);
                            f48943e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
