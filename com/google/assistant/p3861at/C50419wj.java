package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.at.wj */
/* compiled from: PG */
public final class C50419wj extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50419wj f131227e;

    /* renamed from: f */
    private static volatile C63010eb f131228f;

    /* renamed from: a */
    public int f131229a;

    /* renamed from: b */
    public int f131230b;

    /* renamed from: c */
    public String f131231c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C63088z f131232d = C63088z.f170246b;

    static {
        C50419wj wjVar = new C50419wj();
        f131227e = wjVar;
        C62942bv.registerDefaultInstance(C50419wj.class, wjVar);
    }

    private C50419wj() {
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
                return newMessageInfo(f131227e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ည\u0002", new Object[]{"a", "b", C50417wh.f131226a, C45240c.f118157a, "d"});
            case 3:
                return new C50419wj();
            case 4:
                return new C50416wg();
            case 5:
                return f131227e;
            case 6:
                C63010eb ebVar = f131228f;
                if (ebVar == null) {
                    synchronized (C50419wj.class) {
                        ebVar = f131228f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131227e);
                            f131228f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
