package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.j.hf */
/* compiled from: PG */
public final class C52154hf extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52154hf f136854c;

    /* renamed from: d */
    private static volatile C63010eb f136855d;

    /* renamed from: a */
    public int f136856a;

    /* renamed from: b */
    public C63088z f136857b = C63088z.f170246b;

    static {
        C52154hf hfVar = new C52154hf();
        f136854c = hfVar;
        C62942bv.registerDefaultInstance(C52154hf.class, hfVar);
    }

    private C52154hf() {
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
                return newMessageInfo(f136854c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52154hf();
            case 4:
                return new C52153he();
            case 5:
                return f136854c;
            case 6:
                C63010eb ebVar = f136855d;
                if (ebVar == null) {
                    synchronized (C52154hf.class) {
                        ebVar = f136855d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136854c);
                            f136855d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
