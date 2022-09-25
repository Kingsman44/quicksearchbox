package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.dk */
/* compiled from: PG */
public final class C51795dk extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51795dk f135896e;

    /* renamed from: f */
    private static volatile C63010eb f135897f;

    /* renamed from: a */
    public int f135898a;

    /* renamed from: b */
    public int f135899b;

    /* renamed from: c */
    public boolean f135900c;

    /* renamed from: d */
    public int f135901d;

    static {
        C51795dk dkVar = new C51795dk();
        f135896e = dkVar;
        C62942bv.registerDefaultInstance(C51795dk.class, dkVar);
    }

    private C51795dk() {
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
                return newMessageInfo(f135896e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", C51794dj.f135895a});
            case 3:
                return new C51795dk();
            case 4:
                return new C51793di();
            case 5:
                return f135896e;
            case 6:
                C63010eb ebVar = f135897f;
                if (ebVar == null) {
                    synchronized (C51795dk.class) {
                        ebVar = f135897f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135896e);
                            f135897f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
