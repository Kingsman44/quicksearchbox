package com.google.p4017at.p4060h.p4061a.p4062a.p4066d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4757ac.p4758a.C63111j;

/* renamed from: com.google.at.h.a.a.d.e */
/* compiled from: PG */
public final class C54153e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54153e f142110c;

    /* renamed from: e */
    private static volatile C63010eb f142111e;

    /* renamed from: a */
    public int f142112a;

    /* renamed from: b */
    public C63111j f142113b;

    /* renamed from: d */
    private int f142114d;

    static {
        C54153e eVar = new C54153e();
        f142110c = eVar;
        C62942bv.registerDefaultInstance(C54153e.class, eVar);
    }

    private C54153e() {
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
                return newMessageInfo(f142110c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", C54151c.f142109a, "b"});
            case 3:
                return new C54153e();
            case 4:
                return new C54150b();
            case 5:
                return f142110c;
            case 6:
                C63010eb ebVar = f142111e;
                if (ebVar == null) {
                    synchronized (C54153e.class) {
                        ebVar = f142111e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142110c);
                            f142111e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
