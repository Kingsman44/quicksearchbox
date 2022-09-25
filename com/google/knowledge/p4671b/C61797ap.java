package com.google.knowledge.p4671b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.b.ap */
/* compiled from: PG */
public final class C61797ap extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C61797ap f166930c;

    /* renamed from: e */
    private static volatile C63010eb f166931e;

    /* renamed from: a */
    public int f166932a;

    /* renamed from: b */
    public int f166933b;

    /* renamed from: d */
    private byte f166934d = 2;

    static {
        C61797ap apVar = new C61797ap();
        f166930c = apVar;
        C62942bv.registerDefaultInstance(C61797ap.class, apVar);
    }

    private C61797ap() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f166934d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f166934d = b;
                return null;
            case 2:
                return newMessageInfo(f166930c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C61796ao.f166929a});
            case 3:
                return new C61797ap();
            case 4:
                return new C61795an();
            case 5:
                return f166930c;
            case 6:
                C63010eb ebVar = f166931e;
                if (ebVar == null) {
                    synchronized (C61797ap.class) {
                        ebVar = f166931e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166930c);
                            f166931e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
