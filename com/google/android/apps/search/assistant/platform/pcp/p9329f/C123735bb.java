package com.google.android.apps.search.assistant.platform.pcp.p9329f;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.bb */
/* compiled from: PG */
public final class C123735bb extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C123735bb f341782d;

    /* renamed from: f */
    private static volatile C63010eb f341783f;

    /* renamed from: a */
    public int f341784a;

    /* renamed from: b */
    public C62961ch f341785b = emptyIntList();

    /* renamed from: c */
    public boolean f341786c;

    /* renamed from: e */
    private int f341787e;

    static {
        C123735bb bbVar = new C123735bb();
        f341782d = bbVar;
        C62942bv.registerDefaultInstance(C123735bb.class, bbVar);
    }

    private C123735bb() {
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
                return newMessageInfo(f341782d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u0016\u0003ဇ\u0001", new Object[]{"e", "a", C53306j.m86810b(), "b", C45240c.f118157a});
            case 3:
                return new C123735bb();
            case 4:
                return new C123734ba();
            case 5:
                return f341782d;
            case 6:
                C63010eb ebVar = f341783f;
                if (ebVar == null) {
                    synchronized (C123735bb.class) {
                        ebVar = f341783f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341782d);
                            f341783f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
