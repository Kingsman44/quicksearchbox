package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.hm */
/* compiled from: PG */
public final class C50017hm extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50017hm f130033c;

    /* renamed from: d */
    private static volatile C63010eb f130034d;

    /* renamed from: a */
    public int f130035a;

    /* renamed from: b */
    public C50016hl f130036b;

    static {
        C50017hm hmVar = new C50017hm();
        f130033c = hmVar;
        C62942bv.registerDefaultInstance(C50017hm.class, hmVar);
    }

    private C50017hm() {
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
                return newMessageInfo(f130033c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0002", new Object[]{"a", "b"});
            case 3:
                return new C50017hm();
            case 4:
                return new C50014hj();
            case 5:
                return f130033c;
            case 6:
                C63010eb ebVar = f130034d;
                if (ebVar == null) {
                    synchronized (C50017hm.class) {
                        ebVar = f130034d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130033c);
                            f130034d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
