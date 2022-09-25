package com.google.assistant.p3739a.p3740a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.a.a.bm */
/* compiled from: PG */
public final class C48079bm extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48079bm f124433c;

    /* renamed from: d */
    private static volatile C63010eb f124434d;

    /* renamed from: a */
    public int f124435a = 0;

    /* renamed from: b */
    public Object f124436b;

    static {
        C48079bm bmVar = new C48079bm();
        f124433c = bmVar;
        C62942bv.registerDefaultInstance(C48079bm.class, bmVar);
    }

    private C48079bm() {
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
                return newMessageInfo(f124433c, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"b", "a", C48095cb.class, C48047ah.class, C48083bq.class});
            case 3:
                return new C48079bm();
            case 4:
                return new C48078bl();
            case 5:
                return f124433c;
            case 6:
                C63010eb ebVar = f124434d;
                if (ebVar == null) {
                    synchronized (C48079bm.class) {
                        ebVar = f124434d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124433c);
                            f124434d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
