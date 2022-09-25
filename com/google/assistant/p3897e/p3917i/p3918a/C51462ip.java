package com.google.assistant.p3897e.p3917i.p3918a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.ip */
/* compiled from: PG */
public final class C51462ip extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51462ip f134059b;

    /* renamed from: d */
    private static volatile C63010eb f134060d;

    /* renamed from: a */
    public String f134061a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f134062c;

    static {
        C51462ip ipVar = new C51462ip();
        f134059b = ipVar;
        C62942bv.registerDefaultInstance(C51462ip.class, ipVar);
    }

    private C51462ip() {
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
                return newMessageInfo(f134059b, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C51462ip();
            case 4:
                return new C51461io();
            case 5:
                return f134059b;
            case 6:
                C63010eb ebVar = f134060d;
                if (ebVar == null) {
                    synchronized (C51462ip.class) {
                        ebVar = f134060d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134059b);
                            f134060d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
