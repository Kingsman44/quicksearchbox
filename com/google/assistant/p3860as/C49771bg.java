package com.google.assistant.p3860as;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.as.bg */
/* compiled from: PG */
public final class C49771bg extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49771bg f128520c;

    /* renamed from: e */
    private static volatile C63010eb f128521e;

    /* renamed from: a */
    public int f128522a;

    /* renamed from: b */
    public C49773bi f128523b;

    /* renamed from: d */
    private int f128524d;

    static {
        C49771bg bgVar = new C49771bg();
        f128520c = bgVar;
        C62942bv.registerDefaultInstance(C49771bg.class, bgVar);
    }

    private C49771bg() {
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
                return newMessageInfo(f128520c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C49771bg();
            case 4:
                return new C49770bf();
            case 5:
                return f128520c;
            case 6:
                C63010eb ebVar = f128521e;
                if (ebVar == null) {
                    synchronized (C49771bg.class) {
                        ebVar = f128521e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128520c);
                            f128521e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
