package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bc */
/* compiled from: PG */
public final class C16742bc extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C16742bc f48958d;

    /* renamed from: e */
    private static volatile C63010eb f48959e;

    /* renamed from: a */
    public int f48960a;

    /* renamed from: b */
    public int f48961b;

    /* renamed from: c */
    public String f48962c = BuildConfig.FLAVOR;

    static {
        C16742bc bcVar = new C16742bc();
        f48958d = bcVar;
        C62942bv.registerDefaultInstance(C16742bc.class, bcVar);
    }

    private C16742bc() {
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
                return newMessageInfo(f48958d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C16741bb.f48957a, C45240c.f118157a});
            case 3:
                return new C16742bc();
            case 4:
                return new C16740ba();
            case 5:
                return f48958d;
            case 6:
                C63010eb ebVar = f48959e;
                if (ebVar == null) {
                    synchronized (C16742bc.class) {
                        ebVar = f48959e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48958d);
                            f48959e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
