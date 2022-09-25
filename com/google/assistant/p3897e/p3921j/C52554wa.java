package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.wa */
/* compiled from: PG */
public final class C52554wa extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52554wa f137931c;

    /* renamed from: d */
    private static volatile C63010eb f137932d;

    /* renamed from: a */
    public int f137933a = 0;

    /* renamed from: b */
    public Object f137934b;

    static {
        C52554wa waVar = new C52554wa();
        f137931c = waVar;
        C62942bv.registerDefaultInstance(C52554wa.class, waVar);
    }

    private C52554wa() {
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
                return newMessageInfo(f137931c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", C52552vz.class, C52550vx.class});
            case 3:
                return new C52554wa();
            case 4:
                return new C52546vt();
            case 5:
                return f137931c;
            case 6:
                C63010eb ebVar = f137932d;
                if (ebVar == null) {
                    synchronized (C52554wa.class) {
                        ebVar = f137932d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137931c);
                            f137932d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
