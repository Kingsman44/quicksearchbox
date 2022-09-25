package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.jo */
/* compiled from: PG */
public final class C67060jo extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67060jo f182289c;

    /* renamed from: e */
    private static volatile C63010eb f182290e;

    /* renamed from: a */
    public long f182291a;

    /* renamed from: b */
    public long f182292b;

    /* renamed from: d */
    private int f182293d;

    static {
        C67060jo joVar = new C67060jo();
        f182289c = joVar;
        C62942bv.registerDefaultInstance(C67060jo.class, joVar);
    }

    private C67060jo() {
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
                return newMessageInfo(f182289c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C67060jo();
            case 4:
                return new C67059jn();
            case 5:
                return f182289c;
            case 6:
                C63010eb ebVar = f182290e;
                if (ebVar == null) {
                    synchronized (C67060jo.class) {
                        ebVar = f182290e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182289c);
                            f182290e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
