package com.google.speech.p5228m;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.ag */
/* compiled from: PG */
public final class C67276ag extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67276ag f182875c;

    /* renamed from: f */
    private static volatile C63010eb f182876f;

    /* renamed from: a */
    public long f182877a;

    /* renamed from: b */
    public long f182878b;

    /* renamed from: d */
    private int f182879d;

    /* renamed from: e */
    private C67287ar f182880e;

    static {
        C67276ag agVar = new C67276ag();
        f182875c = agVar;
        C62942bv.registerDefaultInstance(C67276ag.class, agVar);
    }

    private C67276ag() {
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
                return newMessageInfo(f182875c, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဉ\u0002", new Object[]{"d", "a", "b", "e"});
            case 3:
                return new C67276ag();
            case 4:
                return new C67275af();
            case 5:
                return f182875c;
            case 6:
                C63010eb ebVar = f182876f;
                if (ebVar == null) {
                    synchronized (C67276ag.class) {
                        ebVar = f182876f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182875c);
                            f182876f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
