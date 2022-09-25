package com.google.assistant.p3739a.p3740a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.a.a.s */
/* compiled from: PG */
public final class C48122s extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48122s f124539c;

    /* renamed from: d */
    private static volatile C63010eb f124540d;

    /* renamed from: a */
    public int f124541a = 0;

    /* renamed from: b */
    public Object f124542b;

    static {
        C48122s sVar = new C48122s();
        f124539c = sVar;
        C62942bv.registerDefaultInstance(C48122s.class, sVar);
    }

    private C48122s() {
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
                return newMessageInfo(f124539c, "\u0000\u0005\u0001\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0006<\u0000", new Object[]{"b", "a", C48074bh.class, C48076bj.class, C48092bz.class, C48119p.class, C48126w.class});
            case 3:
                return new C48122s();
            case 4:
                return new C48121r();
            case 5:
                return f124539c;
            case 6:
                C63010eb ebVar = f124540d;
                if (ebVar == null) {
                    synchronized (C48122s.class) {
                        ebVar = f124540d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124539c);
                            f124540d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
