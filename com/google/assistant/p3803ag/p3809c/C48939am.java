package com.google.assistant.p3803ag.p3809c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.am */
/* compiled from: PG */
public final class C48939am extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48939am f126628c;

    /* renamed from: d */
    private static volatile C63010eb f126629d;

    /* renamed from: a */
    public int f126630a = 0;

    /* renamed from: b */
    public Object f126631b;

    static {
        C48939am amVar = new C48939am();
        f126628c = amVar;
        C62942bv.registerDefaultInstance(C48939am.class, amVar);
    }

    private C48939am() {
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
                return newMessageInfo(f126628c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဿ\u0000\u0002ဿ\u0000", new Object[]{"b", "a", C48938al.m85314b(), C48935ai.m85312b()});
            case 3:
                return new C48939am();
            case 4:
                return new C48936aj();
            case 5:
                return f126628c;
            case 6:
                C63010eb ebVar = f126629d;
                if (ebVar == null) {
                    synchronized (C48939am.class) {
                        ebVar = f126629d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126628c);
                            f126629d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
