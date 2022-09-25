package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.i.a.jf */
/* compiled from: PG */
public final class C51479jf extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51479jf f134133c;

    /* renamed from: d */
    private static volatile C63010eb f134134d;

    /* renamed from: a */
    public int f134135a;

    /* renamed from: b */
    public C63088z f134136b = C63088z.f170246b;

    static {
        C51479jf jfVar = new C51479jf();
        f134133c = jfVar;
        C62942bv.registerDefaultInstance(C51479jf.class, jfVar);
    }

    private C51479jf() {
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
                return newMessageInfo(f134133c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            case 3:
                return new C51479jf();
            case 4:
                return new C51478je();
            case 5:
                return f134133c;
            case 6:
                C63010eb ebVar = f134134d;
                if (ebVar == null) {
                    synchronized (C51479jf.class) {
                        ebVar = f134134d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134133c);
                            f134134d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
