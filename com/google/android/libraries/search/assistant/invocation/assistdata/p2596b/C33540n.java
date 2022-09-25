package com.google.android.libraries.search.assistant.invocation.assistdata.p2596b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.assistdata.b.n */
/* compiled from: PG */
public final class C33540n extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C33540n f89707b;

    /* renamed from: c */
    private static volatile C63010eb f89708c;

    /* renamed from: a */
    public String f89709a = BuildConfig.FLAVOR;

    static {
        C33540n nVar = new C33540n();
        f89707b = nVar;
        C62942bv.registerDefaultInstance(C33540n.class, nVar);
    }

    private C33540n() {
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
                return newMessageInfo(f89707b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C33540n();
            case 4:
                return new C33539m();
            case 5:
                return f89707b;
            case 6:
                C63010eb ebVar = f89708c;
                if (ebVar == null) {
                    synchronized (C33540n.class) {
                        ebVar = f89708c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f89707b);
                            f89708c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
