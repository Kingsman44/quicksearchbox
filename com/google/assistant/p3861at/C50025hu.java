package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.at.hu */
/* compiled from: PG */
public final class C50025hu extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50025hu f130050c;

    /* renamed from: e */
    private static volatile C63010eb f130051e;

    /* renamed from: a */
    public int f130052a;

    /* renamed from: b */
    public C63088z f130053b = C63088z.f170246b;

    /* renamed from: d */
    private int f130054d;

    static {
        C50025hu huVar = new C50025hu();
        f130050c = huVar;
        C62942bv.registerDefaultInstance(C50025hu.class, huVar);
    }

    private C50025hu() {
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
                return newMessageInfo(f130050c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဌ\u0001\u0003ည\u0002", new Object[]{"d", "a", C50023hs.f130049a, "b"});
            case 3:
                return new C50025hu();
            case 4:
                return new C50022hr();
            case 5:
                return f130050c;
            case 6:
                C63010eb ebVar = f130051e;
                if (ebVar == null) {
                    synchronized (C50025hu.class) {
                        ebVar = f130051e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130050c);
                            f130051e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
