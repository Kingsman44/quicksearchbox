package com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a;

import com.google.android.apps.gsa.opaonboarding.p6462d.C83935v;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.speech.hotword.enrollmentutils.a.s */
/* compiled from: PG */
public final class C92395s extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C92395s f257652e;

    /* renamed from: f */
    private static volatile C63010eb f257653f;

    /* renamed from: a */
    public int f257654a;

    /* renamed from: b */
    public C92391o f257655b;

    /* renamed from: c */
    public C83935v f257656c;

    /* renamed from: d */
    public int f257657d;

    static {
        C92395s sVar = new C92395s();
        f257652e = sVar;
        C62942bv.registerDefaultInstance(C92395s.class, sVar);
    }

    private C92395s() {
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
                return newMessageInfo(f257652e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", C92393q.f257651a});
            case 3:
                return new C92395s();
            case 4:
                return new C92392p();
            case 5:
                return f257652e;
            case 6:
                C63010eb ebVar = f257653f;
                if (ebVar == null) {
                    synchronized (C92395s.class) {
                        ebVar = f257653f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f257652e);
                            f257653f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
