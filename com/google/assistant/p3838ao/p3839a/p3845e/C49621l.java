package com.google.assistant.p3838ao.p3839a.p3845e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ao.a.e.l */
/* compiled from: PG */
public final class C49621l extends C62937bq implements C62938br {

    /* renamed from: b */
    public static final C49621l f128062b;

    /* renamed from: e */
    private static volatile C63010eb f128063e;

    /* renamed from: a */
    public int f128064a;

    /* renamed from: c */
    private int f128065c;

    /* renamed from: d */
    private byte f128066d = 2;

    static {
        C49621l lVar = new C49621l();
        f128062b = lVar;
        C62942bv.registerDefaultInstance(C49621l.class, lVar);
    }

    private C49621l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f128066d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f128066d = b;
                return null;
            case 2:
                return newMessageInfo(f128062b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C49622m.f128067a});
            case 3:
                return new C49621l();
            case 4:
                return new C49620k();
            case 5:
                return f128062b;
            case 6:
                C63010eb ebVar = f128063e;
                if (ebVar == null) {
                    synchronized (C49621l.class) {
                        ebVar = f128063e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128062b);
                            f128063e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
