package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;

/* renamed from: com.google.assistant.at.afq */
/* compiled from: PG */
public final class afq extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final afq f129166e;

    /* renamed from: f */
    private static volatile C63010eb f129167f;

    /* renamed from: a */
    public int f129168a;

    /* renamed from: b */
    public int f129169b;

    /* renamed from: c */
    public boolean f129170c;

    /* renamed from: d */
    public C63070h f129171d;

    static {
        afq afq = new afq();
        f129166e = afq;
        C62942bv.registerDefaultInstance(afq.class, afq);
    }

    private afq() {
        emptyProtobufList();
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
                return newMessageInfo(f129166e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဇ\u0002\u0003ဉ\u0003\u0004ဌ\u0001", new Object[]{"a", C45240c.f118157a, "d", "b", afo.f129165a});
            case 3:
                return new afq();
            case 4:
                return new afn();
            case 5:
                return f129166e;
            case 6:
                C63010eb ebVar = f129167f;
                if (ebVar == null) {
                    synchronized (afq.class) {
                        ebVar = f129167f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129166e);
                            f129167f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
