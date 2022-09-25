package com.google.lens.p4701g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.lens.g.ai */
/* compiled from: PG */
public final class C62259ai extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62259ai f168090d;

    /* renamed from: f */
    private static volatile C63010eb f168091f;

    /* renamed from: a */
    public C63088z f168092a = C63088z.f170246b;

    /* renamed from: b */
    public int f168093b;

    /* renamed from: c */
    public int f168094c;

    /* renamed from: e */
    private int f168095e;

    static {
        C62259ai aiVar = new C62259ai();
        f168090d = aiVar;
        C62942bv.registerDefaultInstance(C62259ai.class, aiVar);
    }

    private C62259ai() {
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
                return newMessageInfo(f168090d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ည\u0000\u0003င\u0002\u0004င\u0003", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C62259ai();
            case 4:
                return new C62258ah();
            case 5:
                return f168090d;
            case 6:
                C63010eb ebVar = f168091f;
                if (ebVar == null) {
                    synchronized (C62259ai.class) {
                        ebVar = f168091f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168090d);
                            f168091f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
