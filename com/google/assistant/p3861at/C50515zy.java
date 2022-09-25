package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.zy */
/* compiled from: PG */
public final class C50515zy extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50515zy f131495c;

    /* renamed from: d */
    private static volatile C63010eb f131496d;

    /* renamed from: a */
    public int f131497a;

    /* renamed from: b */
    public int f131498b;

    static {
        C50515zy zyVar = new C50515zy();
        f131495c = zyVar;
        C62942bv.registerDefaultInstance(C50515zy.class, zyVar);
    }

    private C50515zy() {
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
                return newMessageInfo(f131495c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C50513zw.f131494a});
            case 3:
                return new C50515zy();
            case 4:
                return new C50512zv();
            case 5:
                return f131495c;
            case 6:
                C63010eb ebVar = f131496d;
                if (ebVar == null) {
                    synchronized (C50515zy.class) {
                        ebVar = f131496d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131495c);
                            f131496d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
