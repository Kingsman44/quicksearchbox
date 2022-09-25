package com.google.frameworks.client.p4630b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.frameworks.client.b.l */
/* compiled from: PG */
public final class C61329l extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C61329l f165858e;

    /* renamed from: f */
    private static volatile C63010eb f165859f;

    /* renamed from: a */
    public int f165860a;

    /* renamed from: b */
    public long f165861b;

    /* renamed from: c */
    public C62964ck f165862c = emptyLongList();

    /* renamed from: d */
    public C62971cq f165863d = emptyProtobufList();

    static {
        C61329l lVar = new C61329l();
        f165858e = lVar;
        C62942bv.registerDefaultInstance(C61329l.class, lVar);
    }

    private C61329l() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f165858e, "\u0001\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0002\u0000\u0004\u001b\u0005စ\u0001\u0006\u0017", new Object[]{"a", "d", C61328k.class, "b", C45240c.f118157a});
            case 3:
                return new C61329l();
            case 4:
                return new C61322e();
            case 5:
                return f165858e;
            case 6:
                C63010eb ebVar = f165859f;
                if (ebVar == null) {
                    synchronized (C61329l.class) {
                        ebVar = f165859f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f165858e);
                            f165859f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
