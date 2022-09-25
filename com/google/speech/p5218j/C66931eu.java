package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.eu */
/* compiled from: PG */
public final class C66931eu extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66931eu f181932c;

    /* renamed from: d */
    private static volatile C63010eb f181933d;

    /* renamed from: a */
    public int f181934a = 0;

    /* renamed from: b */
    public Object f181935b;

    static {
        C66931eu euVar = new C66931eu();
        f181932c = euVar;
        C62942bv.registerDefaultInstance(C66931eu.class, euVar);
    }

    private C66931eu() {
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
                return newMessageInfo(f181932c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဵ\u0000\u0002ဵ\u0000\u0003ဳ\u0000", new Object[]{"b", "a"});
            case 3:
                return new C66931eu();
            case 4:
                return new C66930et();
            case 5:
                return f181932c;
            case 6:
                C63010eb ebVar = f181933d;
                if (ebVar == null) {
                    synchronized (C66931eu.class) {
                        ebVar = f181933d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181932c);
                            f181933d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
