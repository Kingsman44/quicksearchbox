package com.google.p4160bf.p4164b.p4165a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.r */
/* compiled from: PG */
public final class C55678r extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55678r f146900c;

    /* renamed from: d */
    private static volatile C63010eb f146901d;

    /* renamed from: a */
    public int f146902a = 0;

    /* renamed from: b */
    public Object f146903b;

    static {
        C55678r rVar = new C55678r();
        f146900c = rVar;
        C62942bv.registerDefaultInstance(C55678r.class, rVar);
    }

    private C55678r() {
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
                return newMessageInfo(f146900c, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000", new Object[]{"b", "a", C55685y.class, C55591aa.class, C55671k.class, C55674n.class, C55663cs.class, C55593ac.class, C55680t.class, C55655ck.class});
            case 3:
                return new C55678r();
            case 4:
                return new C55677q();
            case 5:
                return f146900c;
            case 6:
                C63010eb ebVar = f146901d;
                if (ebVar == null) {
                    synchronized (C55678r.class) {
                        ebVar = f146901d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146900c);
                            f146901d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
