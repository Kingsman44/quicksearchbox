package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.wr */
/* compiled from: PG */
public final class C50427wr extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50427wr f131243c;

    /* renamed from: d */
    private static volatile C63010eb f131244d;

    /* renamed from: a */
    public int f131245a;

    /* renamed from: b */
    public int f131246b;

    static {
        C50427wr wrVar = new C50427wr();
        f131243c = wrVar;
        C62942bv.registerDefaultInstance(C50427wr.class, wrVar);
    }

    private C50427wr() {
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
                return newMessageInfo(f131243c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C50425wp.f131242a});
            case 3:
                return new C50427wr();
            case 4:
                return new C50424wo();
            case 5:
                return f131243c;
            case 6:
                C63010eb ebVar = f131244d;
                if (ebVar == null) {
                    synchronized (C50427wr.class) {
                        ebVar = f131244d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131243c);
                            f131244d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
