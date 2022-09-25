package com.google.android.apps.search.assistant.platform.pcp.p9329f;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.ch */
/* compiled from: PG */
public final class C123768ch extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C123768ch f341894d;

    /* renamed from: e */
    private static volatile C63010eb f341895e;

    /* renamed from: a */
    public int f341896a;

    /* renamed from: b */
    public C62971cq f341897b = emptyProtobufList();

    /* renamed from: c */
    public int f341898c;

    static {
        C123768ch chVar = new C123768ch();
        f341894d = chVar;
        C62942bv.registerDefaultInstance(C123768ch.class, chVar);
    }

    private C123768ch() {
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
                return newMessageInfo(f341894d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဌ\u0000", new Object[]{"a", "b", C123766cf.class, C45240c.f118157a, C123762cb.m203108b()});
            case 3:
                return new C123768ch();
            case 4:
                return new C123767cg();
            case 5:
                return f341894d;
            case 6:
                C63010eb ebVar = f341895e;
                if (ebVar == null) {
                    synchronized (C123768ch.class) {
                        ebVar = f341895e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341894d);
                            f341895e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
