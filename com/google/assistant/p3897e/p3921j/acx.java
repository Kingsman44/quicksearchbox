package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.acx */
/* compiled from: PG */
public final class acx extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final acx f134854e;

    /* renamed from: f */
    private static volatile C63010eb f134855f;

    /* renamed from: a */
    public int f134856a;

    /* renamed from: b */
    public String f134857b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f134858c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f134859d = BuildConfig.FLAVOR;

    static {
        acx acx = new acx();
        f134854e = acx;
        C62942bv.registerDefaultInstance(acx.class, acx);
    }

    private acx() {
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
                return newMessageInfo(f134854e, "\u0001\u0003\u0000\u0001\u0005\u0007\u0003\u0000\u0000\u0000\u0005ဈ\u0002\u0006ဈ\u0003\u0007ဈ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new acx();
            case 4:
                return new acw();
            case 5:
                return f134854e;
            case 6:
                C63010eb ebVar = f134855f;
                if (ebVar == null) {
                    synchronized (acx.class) {
                        ebVar = f134855f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134854e);
                            f134855f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
