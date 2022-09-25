package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.protos.be.a.a.a.cl */
/* compiled from: PG */
public final class C64505cl extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64505cl f174951c;

    /* renamed from: d */
    private static volatile C63010eb f174952d;

    /* renamed from: a */
    public String f174953a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C63088z f174954b = C63088z.f170246b;

    static {
        C64505cl clVar = new C64505cl();
        f174951c = clVar;
        C62942bv.registerDefaultInstance(C64505cl.class, clVar);
    }

    private C64505cl() {
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
                return newMessageInfo(f174951c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"a", "b"});
            case 3:
                return new C64505cl();
            case 4:
                return new C64504ck();
            case 5:
                return f174951c;
            case 6:
                C63010eb ebVar = f174952d;
                if (ebVar == null) {
                    synchronized (C64505cl.class) {
                        ebVar = f174952d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174951c);
                            f174952d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
