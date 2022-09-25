package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.mi */
/* compiled from: PG */
public final class C52292mi extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62962ci f137269d = new C52290mg();

    /* renamed from: e */
    public static final C52292mi f137270e;

    /* renamed from: f */
    private static volatile C63010eb f137271f;

    /* renamed from: a */
    public C52378pn f137272a;

    /* renamed from: b */
    public C62971cq f137273b = emptyProtobufList();

    /* renamed from: c */
    public C62961ch f137274c = emptyIntList();

    static {
        C52292mi miVar = new C52292mi();
        f137270e = miVar;
        C62942bv.registerDefaultInstance(C52292mi.class, miVar);
    }

    private C52292mi() {
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
                return newMessageInfo(f137270e, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\t\u0002\u001b\u0003,", new Object[]{"a", "b", C51098gh.class, C45240c.f118157a});
            case 3:
                return new C52292mi();
            case 4:
                return new C52291mh();
            case 5:
                return f137270e;
            case 6:
                C63010eb ebVar = f137271f;
                if (ebVar == null) {
                    synchronized (C52292mi.class) {
                        ebVar = f137271f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137270e);
                            f137271f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
