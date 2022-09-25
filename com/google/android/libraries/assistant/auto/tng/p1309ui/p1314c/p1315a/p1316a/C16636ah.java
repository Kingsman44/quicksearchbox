package com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ah */
/* compiled from: PG */
public final class C16636ah extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C16636ah f48726c;

    /* renamed from: d */
    private static volatile C63010eb f48727d;

    /* renamed from: a */
    public int f48728a;

    /* renamed from: b */
    public int f48729b;

    static {
        C16636ah ahVar = new C16636ah();
        f48726c = ahVar;
        C62942bv.registerDefaultInstance(C16636ah.class, ahVar);
    }

    private C16636ah() {
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
                return newMessageInfo(f48726c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C16634af.f48725a});
            case 3:
                return new C16636ah();
            case 4:
                return new C16633ae();
            case 5:
                return f48726c;
            case 6:
                C63010eb ebVar = f48727d;
                if (ebVar == null) {
                    synchronized (C16636ah.class) {
                        ebVar = f48727d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48726c);
                            f48727d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
