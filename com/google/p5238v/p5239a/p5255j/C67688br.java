package com.google.p5238v.p5239a.p5255j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.v.a.j.br */
/* compiled from: PG */
public final class C67688br extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C67688br f183675e;

    /* renamed from: f */
    private static volatile C63010eb f183676f;

    /* renamed from: a */
    public int f183677a;

    /* renamed from: b */
    public C67684bn f183678b;

    /* renamed from: c */
    public C63088z f183679c = C63088z.f170246b;

    /* renamed from: d */
    public C63088z f183680d = C63088z.f170246b;

    static {
        C67688br brVar = new C67688br();
        f183675e = brVar;
        C62942bv.registerDefaultInstance(C67688br.class, brVar);
    }

    private C67688br() {
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
                return newMessageInfo(f183675e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C67688br();
            case 4:
                return new C67687bq();
            case 5:
                return f183675e;
            case 6:
                C63010eb ebVar = f183676f;
                if (ebVar == null) {
                    synchronized (C67688br.class) {
                        ebVar = f183676f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183675e);
                            f183676f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
