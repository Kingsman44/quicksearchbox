package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.xj */
/* compiled from: PG */
public final class C8150xj extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8150xj f28657d;

    /* renamed from: e */
    private static volatile C63010eb f28658e;

    /* renamed from: a */
    public int f28659a;

    /* renamed from: b */
    public String f28660b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f28661c = emptyProtobufList();

    static {
        C8150xj xjVar = new C8150xj();
        f28657d = xjVar;
        C62942bv.registerDefaultInstance(C8150xj.class, xjVar);
    }

    private C8150xj() {
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
                return newMessageInfo(f28657d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"a", "b", C45240c.f118157a, C8149xi.class});
            case 3:
                return new C8150xj();
            case 4:
                return new C8145xe();
            case 5:
                return f28657d;
            case 6:
                C63010eb ebVar = f28658e;
                if (ebVar == null) {
                    synchronized (C8150xj.class) {
                        ebVar = f28658e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28657d);
                            f28658e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
