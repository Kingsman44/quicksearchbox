package com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.c.a.a.a.b.ai */
/* compiled from: PG */
public final class C120047ai extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C120047ai f334213b;

    /* renamed from: c */
    private static volatile C63010eb f334214c;

    /* renamed from: a */
    public int f334215a;

    static {
        C120047ai aiVar = new C120047ai();
        f334213b = aiVar;
        C62942bv.registerDefaultInstance(C120047ai.class, aiVar);
    }

    private C120047ai() {
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
                return newMessageInfo(f334213b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C120047ai();
            case 4:
                return new C120046ah();
            case 5:
                return f334213b;
            case 6:
                C63010eb ebVar = f334214c;
                if (ebVar == null) {
                    synchronized (C120047ai.class) {
                        ebVar = f334214c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f334213b);
                            f334214c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
