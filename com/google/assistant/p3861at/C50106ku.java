package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.at.ku */
/* compiled from: PG */
public final class C50106ku extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50106ku f130256c;

    /* renamed from: e */
    private static volatile C63010eb f130257e;

    /* renamed from: a */
    public int f130258a;

    /* renamed from: b */
    public C63088z f130259b = C63088z.f170246b;

    /* renamed from: d */
    private int f130260d;

    static {
        C50106ku kuVar = new C50106ku();
        f130256c = kuVar;
        C62942bv.registerDefaultInstance(C50106ku.class, kuVar);
    }

    private C50106ku() {
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
                return newMessageInfo(f130256c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ည\u0001", new Object[]{"d", "a", C50104ks.f130255a, "b"});
            case 3:
                return new C50106ku();
            case 4:
                return new C50103kr();
            case 5:
                return f130256c;
            case 6:
                C63010eb ebVar = f130257e;
                if (ebVar == null) {
                    synchronized (C50106ku.class) {
                        ebVar = f130257e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130256c);
                            f130257e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
