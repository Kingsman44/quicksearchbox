package com.google.android.apps.p489g.p494d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7805kp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.eh */
/* compiled from: PG */
public final class C9253eh extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C9253eh f31995d;

    /* renamed from: e */
    private static volatile C63010eb f31996e;

    /* renamed from: a */
    public int f31997a;

    /* renamed from: b */
    public C7805kp f31998b;

    /* renamed from: c */
    public String f31999c = BuildConfig.FLAVOR;

    static {
        C9253eh ehVar = new C9253eh();
        f31995d = ehVar;
        C62942bv.registerDefaultInstance(C9253eh.class, ehVar);
    }

    private C9253eh() {
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
                return newMessageInfo(f31995d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C9253eh();
            case 4:
                return new C9252eg();
            case 5:
                return f31995d;
            case 6:
                C63010eb ebVar = f31996e;
                if (ebVar == null) {
                    synchronized (C9253eh.class) {
                        ebVar = f31996e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31995d);
                            f31996e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
