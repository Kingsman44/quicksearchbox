package com.google.protos.p4887at.p4888a.p4889a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.at.a.a.p */
/* compiled from: PG */
public final class C63813p extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63813p f172587d;

    /* renamed from: e */
    private static volatile C63010eb f172588e;

    /* renamed from: a */
    public C62971cq f172589a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f172590b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f172591c = emptyProtobufList();

    static {
        C63813p pVar = new C63813p();
        f172587d = pVar;
        C62942bv.registerDefaultInstance(C63813p.class, pVar);
    }

    private C63813p() {
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
                return newMessageInfo(f172587d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b", new Object[]{"a", C63801d.class, "b", C63799b.class, C45240c.f118157a, C63799b.class});
            case 3:
                return new C63813p();
            case 4:
                return new C63812o();
            case 5:
                return f172587d;
            case 6:
                C63010eb ebVar = f172588e;
                if (ebVar == null) {
                    synchronized (C63813p.class) {
                        ebVar = f172588e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172587d);
                            f172588e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
