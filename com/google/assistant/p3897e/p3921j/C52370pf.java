package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.pf */
/* compiled from: PG */
public final class C52370pf extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C52370pf f137425e;

    /* renamed from: f */
    private static volatile C63010eb f137426f;

    /* renamed from: a */
    public C52378pn f137427a;

    /* renamed from: b */
    public C62971cq f137428b = emptyProtobufList();

    /* renamed from: c */
    public boolean f137429c;

    /* renamed from: d */
    public boolean f137430d;

    static {
        C52370pf pfVar = new C52370pf();
        f137425e = pfVar;
        C62942bv.registerDefaultInstance(C52370pf.class, pfVar);
    }

    private C52370pf() {
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
                return newMessageInfo(f137425e, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0001\u0000\u0001\t\u0002\u001b\u0004\u0007\u0005\u0007", new Object[]{"a", "b", C51098gh.class, C45240c.f118157a, "d"});
            case 3:
                return new C52370pf();
            case 4:
                return new C52369pe();
            case 5:
                return f137425e;
            case 6:
                C63010eb ebVar = f137426f;
                if (ebVar == null) {
                    synchronized (C52370pf.class) {
                        ebVar = f137426f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137425e);
                            f137426f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
