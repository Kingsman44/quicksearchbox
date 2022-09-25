package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.xl */
/* compiled from: PG */
public final class C8152xl extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8152xl f28662d;

    /* renamed from: f */
    private static volatile C63010eb f28663f;

    /* renamed from: a */
    public String f28664a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f28665b;

    /* renamed from: c */
    public int f28666c;

    /* renamed from: e */
    private int f28667e;

    static {
        C8152xl xlVar = new C8152xl();
        f28662d = xlVar;
        C62942bv.registerDefaultInstance(C8152xl.class, xlVar);
    }

    private C8152xl() {
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
                return newMessageInfo(f28662d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C8152xl();
            case 4:
                return new C8151xk();
            case 5:
                return f28662d;
            case 6:
                C63010eb ebVar = f28663f;
                if (ebVar == null) {
                    synchronized (C8152xl.class) {
                        ebVar = f28663f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28662d);
                            f28663f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
