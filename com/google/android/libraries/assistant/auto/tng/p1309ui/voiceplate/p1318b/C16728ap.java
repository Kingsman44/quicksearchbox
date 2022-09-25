package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.ap */
/* compiled from: PG */
public final class C16728ap extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C16728ap f48926d;

    /* renamed from: e */
    private static volatile C63010eb f48927e;

    /* renamed from: a */
    public int f48928a;

    /* renamed from: b */
    public boolean f48929b;

    /* renamed from: c */
    public long f48930c;

    static {
        C16728ap apVar = new C16728ap();
        f48926d = apVar;
        C62942bv.registerDefaultInstance(C16728ap.class, apVar);
    }

    private C16728ap() {
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
                return newMessageInfo(f48926d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဃ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C16728ap();
            case 4:
                return new C16727ao();
            case 5:
                return f48926d;
            case 6:
                C63010eb ebVar = f48927e;
                if (ebVar == null) {
                    synchronized (C16728ap.class) {
                        ebVar = f48927e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48926d);
                            f48927e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
