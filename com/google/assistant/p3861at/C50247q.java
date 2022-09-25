package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.q */
/* compiled from: PG */
public final class C50247q extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50247q f130666c;

    /* renamed from: e */
    private static volatile C63010eb f130667e;

    /* renamed from: a */
    public long f130668a;

    /* renamed from: b */
    public int f130669b;

    /* renamed from: d */
    private int f130670d;

    static {
        C50247q qVar = new C50247q();
        f130666c = qVar;
        C62942bv.registerDefaultInstance(C50247q.class, qVar);
    }

    private C50247q() {
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
                return newMessageInfo(f130666c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"d", "a", "b", C50193o.f130484a});
            case 3:
                return new C50247q();
            case 4:
                return new C50166n();
            case 5:
                return f130666c;
            case 6:
                C63010eb ebVar = f130667e;
                if (ebVar == null) {
                    synchronized (C50247q.class) {
                        ebVar = f130667e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130666c);
                            f130667e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
