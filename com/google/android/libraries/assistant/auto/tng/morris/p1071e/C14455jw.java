package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.jw */
/* compiled from: PG */
public final class C14455jw extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14455jw f43722b;

    /* renamed from: c */
    private static volatile C63010eb f43723c;

    /* renamed from: a */
    public String f43724a = BuildConfig.FLAVOR;

    static {
        C14455jw jwVar = new C14455jw();
        f43722b = jwVar;
        C62942bv.registerDefaultInstance(C14455jw.class, jwVar);
    }

    private C14455jw() {
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
                return newMessageInfo(f43722b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C14455jw();
            case 4:
                return new C14454jv();
            case 5:
                return f43722b;
            case 6:
                C63010eb ebVar = f43723c;
                if (ebVar == null) {
                    synchronized (C14455jw.class) {
                        ebVar = f43723c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43722b);
                            f43723c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
