package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.zc */
/* compiled from: PG */
public final class C50493zc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50493zc f131397c;

    /* renamed from: d */
    private static volatile C63010eb f131398d;

    /* renamed from: a */
    public int f131399a;

    /* renamed from: b */
    public C50491za f131400b;

    static {
        C50493zc zcVar = new C50493zc();
        f131397c = zcVar;
        C62942bv.registerDefaultInstance(C50493zc.class, zcVar);
    }

    private C50493zc() {
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
                return newMessageInfo(f131397c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C50493zc();
            case 4:
                return new C50492zb();
            case 5:
                return f131397c;
            case 6:
                C63010eb ebVar = f131398d;
                if (ebVar == null) {
                    synchronized (C50493zc.class) {
                        ebVar = f131398d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131397c);
                            f131398d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
