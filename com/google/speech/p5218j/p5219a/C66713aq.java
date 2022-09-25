package com.google.speech.p5218j.p5219a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.a.aq */
/* compiled from: PG */
public final class C66713aq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66713aq f181479c;

    /* renamed from: d */
    private static volatile C63010eb f181480d;

    /* renamed from: a */
    public int f181481a = 0;

    /* renamed from: b */
    public Object f181482b;

    static {
        C66713aq aqVar = new C66713aq();
        f181479c = aqVar;
        C62942bv.registerDefaultInstance(C66713aq.class, aqVar);
    }

    private C66713aq() {
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
                return newMessageInfo(f181479c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", C66754u.class, C66718av.class, C66720ax.class});
            case 3:
                return new C66713aq();
            case 4:
                return new C66712ap();
            case 5:
                return f181479c;
            case 6:
                C63010eb ebVar = f181480d;
                if (ebVar == null) {
                    synchronized (C66713aq.class) {
                        ebVar = f181480d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181479c);
                            f181480d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
