package com.google.android.libraries.assistant.p1467d.p1472c.p1476c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.assistant.d.c.c.z */
/* compiled from: PG */
public final class C17924z extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C17924z f51348d;

    /* renamed from: e */
    private static volatile C63010eb f51349e;

    /* renamed from: a */
    public int f51350a;

    /* renamed from: b */
    public String f51351b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C63088z f51352c = C63088z.f170246b;

    static {
        C17924z zVar = new C17924z();
        f51348d = zVar;
        C62942bv.registerDefaultInstance(C17924z.class, zVar);
    }

    private C17924z() {
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
                return newMessageInfo(f51348d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C17924z();
            case 4:
                return new C17923y();
            case 5:
                return f51348d;
            case 6:
                C63010eb ebVar = f51349e;
                if (ebVar == null) {
                    synchronized (C17924z.class) {
                        ebVar = f51349e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f51348d);
                            f51349e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
