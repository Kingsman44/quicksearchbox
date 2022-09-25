package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.at */
/* compiled from: PG */
public final class C64459at extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64459at f174850c;

    /* renamed from: d */
    private static volatile C63010eb f174851d;

    /* renamed from: a */
    public boolean f174852a;

    /* renamed from: b */
    public String f174853b = BuildConfig.FLAVOR;

    static {
        C64459at atVar = new C64459at();
        f174850c = atVar;
        C62942bv.registerDefaultInstance(C64459at.class, atVar);
    }

    private C64459at() {
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
                return newMessageInfo(f174850c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C64459at();
            case 4:
                return new C64458as();
            case 5:
                return f174850c;
            case 6:
                C63010eb ebVar = f174851d;
                if (ebVar == null) {
                    synchronized (C64459at.class) {
                        ebVar = f174851d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174850c);
                            f174851d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
