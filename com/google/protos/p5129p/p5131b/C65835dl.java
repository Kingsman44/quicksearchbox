package com.google.protos.p5129p.p5131b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.protos.p.b.dl */
/* compiled from: PG */
public final class C65835dl extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65835dl f178966c;

    /* renamed from: e */
    private static volatile C63010eb f178967e;

    /* renamed from: a */
    public String f178968a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C63088z f178969b = C63088z.f170246b;

    /* renamed from: d */
    private int f178970d;

    static {
        C65835dl dlVar = new C65835dl();
        f178966c = dlVar;
        C62942bv.registerDefaultInstance(C65835dl.class, dlVar);
    }

    private C65835dl() {
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
                return newMessageInfo(f178966c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C65835dl();
            case 4:
                return new C65834dk();
            case 5:
                return f178966c;
            case 6:
                C63010eb ebVar = f178967e;
                if (ebVar == null) {
                    synchronized (C65835dl.class) {
                        ebVar = f178967e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178966c);
                            f178967e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
