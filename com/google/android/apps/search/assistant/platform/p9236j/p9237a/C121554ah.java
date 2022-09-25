package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.j.a.ah */
/* compiled from: PG */
public final class C121554ah extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C121554ah f337299b;

    /* renamed from: c */
    private static volatile C63010eb f337300c;

    /* renamed from: a */
    public String f337301a = BuildConfig.FLAVOR;

    static {
        C121554ah ahVar = new C121554ah();
        f337299b = ahVar;
        C62942bv.registerDefaultInstance(C121554ah.class, ahVar);
    }

    private C121554ah() {
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
                return newMessageInfo(f337299b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C121554ah();
            case 4:
                return new C121553ag();
            case 5:
                return f337299b;
            case 6:
                C63010eb ebVar = f337300c;
                if (ebVar == null) {
                    synchronized (C121554ah.class) {
                        ebVar = f337300c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f337299b);
                            f337300c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
