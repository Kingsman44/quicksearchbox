package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.fl */
/* compiled from: PG */
public final class C14336fl extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C14336fl f43377d;

    /* renamed from: e */
    private static volatile C63010eb f43378e;

    /* renamed from: a */
    public String f43379a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f43380b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f43381c = BuildConfig.FLAVOR;

    static {
        C14336fl flVar = new C14336fl();
        f43377d = flVar;
        C62942bv.registerDefaultInstance(C14336fl.class, flVar);
    }

    private C14336fl() {
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
                return newMessageInfo(f43377d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C14336fl();
            case 4:
                return new C14335fk();
            case 5:
                return f43377d;
            case 6:
                C63010eb ebVar = f43378e;
                if (ebVar == null) {
                    synchronized (C14336fl.class) {
                        ebVar = f43378e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43377d);
                            f43378e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
