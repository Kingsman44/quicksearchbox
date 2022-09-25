package com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.c.a.a.s */
/* compiled from: PG */
public final class C16654s extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C16654s f48773e;

    /* renamed from: f */
    private static volatile C63010eb f48774f;

    /* renamed from: a */
    public int f48775a;

    /* renamed from: b */
    public int f48776b;

    /* renamed from: c */
    public C16651p f48777c;

    /* renamed from: d */
    public C16651p f48778d;

    static {
        C16654s sVar = new C16654s();
        f48773e = sVar;
        C62942bv.registerDefaultInstance(C16654s.class, sVar);
    }

    private C16654s() {
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
                return newMessageInfo(f48773e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", C16652q.f48772a, C45240c.f118157a, "d"});
            case 3:
                return new C16654s();
            case 4:
                return new C16649n();
            case 5:
                return f48773e;
            case 6:
                C63010eb ebVar = f48774f;
                if (ebVar == null) {
                    synchronized (C16654s.class) {
                        ebVar = f48774f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48773e);
                            f48774f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
