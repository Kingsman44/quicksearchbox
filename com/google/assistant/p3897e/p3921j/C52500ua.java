package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ua */
/* compiled from: PG */
public final class C52500ua extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52500ua f137822c;

    /* renamed from: d */
    private static volatile C63010eb f137823d;

    /* renamed from: a */
    public int f137824a;

    /* renamed from: b */
    public int f137825b;

    static {
        C52500ua uaVar = new C52500ua();
        f137822c = uaVar;
        C62942bv.registerDefaultInstance(C52500ua.class, uaVar);
    }

    private C52500ua() {
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
                return newMessageInfo(f137822c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52500ua();
            case 4:
                return new C52498tz();
            case 5:
                return f137822c;
            case 6:
                C63010eb ebVar = f137823d;
                if (ebVar == null) {
                    synchronized (C52500ua.class) {
                        ebVar = f137823d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137822c);
                            f137823d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
