package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.fd */
/* compiled from: PG */
public final class C59776fd extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C59776fd f161516e;

    /* renamed from: f */
    private static volatile C63010eb f161517f;

    /* renamed from: a */
    public int f161518a;

    /* renamed from: b */
    public String f161519b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f161520c = emptyProtobufList();

    /* renamed from: d */
    public C59774fb f161521d;

    static {
        C59776fd fdVar = new C59776fd();
        f161516e = fdVar;
        C62942bv.registerDefaultInstance(C59776fd.class, fdVar);
    }

    private C59776fd() {
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
                return newMessageInfo(f161516e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a, C59784fl.class, "d"});
            case 3:
                return new C59776fd();
            case 4:
                return new C59775fc();
            case 5:
                return f161516e;
            case 6:
                C63010eb ebVar = f161517f;
                if (ebVar == null) {
                    synchronized (C59776fd.class) {
                        ebVar = f161517f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161516e);
                            f161517f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
