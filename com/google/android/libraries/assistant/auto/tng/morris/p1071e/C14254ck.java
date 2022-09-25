package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ck */
/* compiled from: PG */
public final class C14254ck extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14254ck f43126c;

    /* renamed from: d */
    private static volatile C63010eb f43127d;

    /* renamed from: a */
    public String f43128a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public boolean f43129b;

    static {
        C14254ck ckVar = new C14254ck();
        f43126c = ckVar;
        C62942bv.registerDefaultInstance(C14254ck.class, ckVar);
    }

    private C14254ck() {
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
                return newMessageInfo(f43126c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"a", "b"});
            case 3:
                return new C14254ck();
            case 4:
                return new C14253cj();
            case 5:
                return f43126c;
            case 6:
                C63010eb ebVar = f43127d;
                if (ebVar == null) {
                    synchronized (C14254ck.class) {
                        ebVar = f43127d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43126c);
                            f43127d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
