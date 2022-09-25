package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.rj */
/* compiled from: PG */
public final class C7988rj extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C7988rj f28062d;

    /* renamed from: f */
    private static volatile C63010eb f28063f;

    /* renamed from: a */
    public String f28064a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f28065b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f28066c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f28067e;

    static {
        C7988rj rjVar = new C7988rj();
        f28062d = rjVar;
        C62942bv.registerDefaultInstance(C7988rj.class, rjVar);
    }

    private C7988rj() {
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
                return newMessageInfo(f28062d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C7988rj();
            case 4:
                return new C7987ri();
            case 5:
                return f28062d;
            case 6:
                C63010eb ebVar = f28063f;
                if (ebVar == null) {
                    synchronized (C7988rj.class) {
                        ebVar = f28063f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28062d);
                            f28063f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
