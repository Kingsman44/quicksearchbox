package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.lm */
/* compiled from: PG */
public final class C50125lm extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50125lm f130309b;

    /* renamed from: c */
    private static volatile C63010eb f130310c;

    /* renamed from: a */
    public C62971cq f130311a = emptyProtobufList();

    static {
        C50125lm lmVar = new C50125lm();
        f130309b = lmVar;
        C62942bv.registerDefaultInstance(C50125lm.class, lmVar);
    }

    private C50125lm() {
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
                return newMessageInfo(f130309b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C50121li.class});
            case 3:
                return new C50125lm();
            case 4:
                return new C50124ll();
            case 5:
                return f130309b;
            case 6:
                C63010eb ebVar = f130310c;
                if (ebVar == null) {
                    synchronized (C50125lm.class) {
                        ebVar = f130310c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130309b);
                            f130310c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
