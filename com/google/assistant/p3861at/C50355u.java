package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.u */
/* compiled from: PG */
public final class C50355u extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50355u f131056c;

    /* renamed from: d */
    private static volatile C63010eb f131057d;

    /* renamed from: a */
    public int f131058a = 0;

    /* renamed from: b */
    public Object f131059b;

    static {
        C50355u uVar = new C50355u();
        f131056c = uVar;
        C62942bv.registerDefaultInstance(C50355u.class, uVar);
    }

    private C50355u() {
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
                return newMessageInfo(f131056c, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000", new Object[]{"b", "a", C49855bm.class, C49834as.class, C49865bw.class, C49859bq.class, C49870ca.class});
            case 3:
                return new C50355u();
            case 4:
                return new C50328t();
            case 5:
                return f131056c;
            case 6:
                C63010eb ebVar = f131057d;
                if (ebVar == null) {
                    synchronized (C50355u.class) {
                        ebVar = f131057d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131056c);
                            f131057d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
