package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.ej */
/* compiled from: PG */
public final class C51348ej extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51348ej f133744d;

    /* renamed from: e */
    private static volatile C63010eb f133745e;

    /* renamed from: a */
    public int f133746a;

    /* renamed from: b */
    public int f133747b;

    /* renamed from: c */
    public float f133748c;

    static {
        C51348ej ejVar = new C51348ej();
        f133744d = ejVar;
        C62942bv.registerDefaultInstance(C51348ej.class, ejVar);
    }

    private C51348ej() {
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
                return newMessageInfo(f133744d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ခ\u0001", new Object[]{"a", "b", C51347ei.m86144b(), C45240c.f118157a});
            case 3:
                return new C51348ej();
            case 4:
                return new C51345eg();
            case 5:
                return f133744d;
            case 6:
                C63010eb ebVar = f133745e;
                if (ebVar == null) {
                    synchronized (C51348ej.class) {
                        ebVar = f133745e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133744d);
                            f133745e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
