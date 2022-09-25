package com.google.assistant.p3745ab;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.av */
/* compiled from: PG */
public final class C48236av extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48236av f124790c;

    /* renamed from: d */
    private static volatile C63010eb f124791d;

    /* renamed from: a */
    public long f124792a;

    /* renamed from: b */
    public int f124793b;

    static {
        C48236av avVar = new C48236av();
        f124790c = avVar;
        C62942bv.registerDefaultInstance(C48236av.class, avVar);
    }

    private C48236av() {
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
                return newMessageInfo(f124790c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"a", "b"});
            case 3:
                return new C48236av();
            case 4:
                return new C48235au();
            case 5:
                return f124790c;
            case 6:
                C63010eb ebVar = f124791d;
                if (ebVar == null) {
                    synchronized (C48236av.class) {
                        ebVar = f124791d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124790c);
                            f124791d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
