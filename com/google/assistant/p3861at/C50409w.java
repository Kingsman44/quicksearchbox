package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.w */
/* compiled from: PG */
public final class C50409w extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50409w f131206c;

    /* renamed from: d */
    private static volatile C63010eb f131207d;

    /* renamed from: a */
    public int f131208a = 0;

    /* renamed from: b */
    public Object f131209b;

    static {
        C50409w wVar = new C50409w();
        f131206c = wVar;
        C62942bv.registerDefaultInstance(C50409w.class, wVar);
    }

    private C50409w() {
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
                return newMessageInfo(f131206c, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000", new Object[]{"b", "a", C49853bk.class, C49832aq.class, C49863bu.class, C49857bo.class, C49867by.class});
            case 3:
                return new C50409w();
            case 4:
                return new C50382v();
            case 5:
                return f131206c;
            case 6:
                C63010eb ebVar = f131207d;
                if (ebVar == null) {
                    synchronized (C50409w.class) {
                        ebVar = f131207d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131206c);
                            f131207d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
