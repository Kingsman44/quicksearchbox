package com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.c.a.a.a.b.am */
/* compiled from: PG */
public final class C120051am extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C120051am f334216a;

    /* renamed from: b */
    private static volatile C63010eb f334217b;

    static {
        C120051am amVar = new C120051am();
        f334216a = amVar;
        C62942bv.registerDefaultInstance(C120051am.class, amVar);
    }

    private C120051am() {
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
                return newMessageInfo(f334216a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C120051am();
            case 4:
                return new C120050al();
            case 5:
                return f334216a;
            case 6:
                C63010eb ebVar = f334217b;
                if (ebVar == null) {
                    synchronized (C120051am.class) {
                        ebVar = f334217b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f334216a);
                            f334217b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
