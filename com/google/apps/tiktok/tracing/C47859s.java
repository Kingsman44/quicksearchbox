package com.google.apps.tiktok.tracing;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.tiktok.tracing.s */
/* compiled from: PG */
public final class C47859s extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C47859s f123924c;

    /* renamed from: d */
    private static volatile C63010eb f123925d;

    /* renamed from: a */
    public int f123926a;

    /* renamed from: b */
    public int f123927b;

    static {
        C47859s sVar = new C47859s();
        f123924c = sVar;
        C62942bv.registerDefaultInstance(C47859s.class, sVar);
    }

    private C47859s() {
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
                return newMessageInfo(f123924c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C47859s();
            case 4:
                return new C47858r();
            case 5:
                return f123924c;
            case 6:
                C63010eb ebVar = f123925d;
                if (ebVar == null) {
                    synchronized (C47859s.class) {
                        ebVar = f123925d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f123924c);
                            f123925d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
