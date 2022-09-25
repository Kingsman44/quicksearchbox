package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.hp */
/* compiled from: PG */
public final class C67007hp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67007hp f182153c;

    /* renamed from: d */
    private static volatile C63010eb f182154d;

    /* renamed from: a */
    public int f182155a = 0;

    /* renamed from: b */
    public Object f182156b;

    static {
        C67007hp hpVar = new C67007hp();
        f182153c = hpVar;
        C62942bv.registerDefaultInstance(C67007hp.class, hpVar);
    }

    private C67007hp() {
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
                return newMessageInfo(f182153c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", C67001hj.class, C67006ho.class, C67004hm.class});
            case 3:
                return new C67007hp();
            case 4:
                return new C67002hk();
            case 5:
                return f182153c;
            case 6:
                C63010eb ebVar = f182154d;
                if (ebVar == null) {
                    synchronized (C67007hp.class) {
                        ebVar = f182154d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182153c);
                            f182154d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
