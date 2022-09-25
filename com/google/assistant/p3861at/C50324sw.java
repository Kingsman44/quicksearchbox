package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.sw */
/* compiled from: PG */
public final class C50324sw extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50324sw f130974d;

    /* renamed from: f */
    private static volatile C63010eb f130975f;

    /* renamed from: a */
    public C50323sv f130976a;

    /* renamed from: b */
    public C50323sv f130977b;

    /* renamed from: c */
    public String f130978c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f130979e;

    static {
        C50324sw swVar = new C50324sw();
        f130974d = swVar;
        C62942bv.registerDefaultInstance(C50324sw.class, swVar);
    }

    private C50324sw() {
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
                return newMessageInfo(f130974d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C50324sw();
            case 4:
                return new C50321st();
            case 5:
                return f130974d;
            case 6:
                C63010eb ebVar = f130975f;
                if (ebVar == null) {
                    synchronized (C50324sw.class) {
                        ebVar = f130975f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130974d);
                            f130975f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
