package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.c */
/* compiled from: PG */
public final class C16753c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C16753c f49018d;

    /* renamed from: e */
    private static volatile C63010eb f49019e;

    /* renamed from: a */
    public int f49020a;

    /* renamed from: b */
    public String f49021b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f49022c = BuildConfig.FLAVOR;

    static {
        C16753c cVar = new C16753c();
        f49018d = cVar;
        C62942bv.registerDefaultInstance(C16753c.class, cVar);
    }

    private C16753c() {
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
                return newMessageInfo(f49018d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C16753c();
            case 4:
                return new C16739b();
            case 5:
                return f49018d;
            case 6:
                C63010eb ebVar = f49019e;
                if (ebVar == null) {
                    synchronized (C16753c.class) {
                        ebVar = f49019e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f49018d);
                            f49019e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
