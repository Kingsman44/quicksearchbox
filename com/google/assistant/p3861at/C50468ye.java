package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ye */
/* compiled from: PG */
public final class C50468ye extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50468ye f131346c;

    /* renamed from: d */
    private static volatile C63010eb f131347d;

    /* renamed from: a */
    public int f131348a;

    /* renamed from: b */
    public C50247q f131349b;

    static {
        C50468ye yeVar = new C50468ye();
        f131346c = yeVar;
        C62942bv.registerDefaultInstance(C50468ye.class, yeVar);
    }

    private C50468ye() {
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
                return newMessageInfo(f131346c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C50468ye();
            case 4:
                return new C50467yd();
            case 5:
                return f131346c;
            case 6:
                C63010eb ebVar = f131347d;
                if (ebVar == null) {
                    synchronized (C50468ye.class) {
                        ebVar = f131347d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131346c);
                            f131347d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
