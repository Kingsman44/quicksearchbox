package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.pd */
/* compiled from: PG */
public final class C52368pd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52368pd f137421c;

    /* renamed from: d */
    private static volatile C63010eb f137422d;

    /* renamed from: a */
    public int f137423a;

    /* renamed from: b */
    public boolean f137424b;

    static {
        C52368pd pdVar = new C52368pd();
        f137421c = pdVar;
        C62942bv.registerDefaultInstance(C52368pd.class, pdVar);
    }

    private C52368pd() {
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
                return newMessageInfo(f137421c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52368pd();
            case 4:
                return new C52367pc();
            case 5:
                return f137421c;
            case 6:
                C63010eb ebVar = f137422d;
                if (ebVar == null) {
                    synchronized (C52368pd.class) {
                        ebVar = f137422d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137421c);
                            f137422d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
