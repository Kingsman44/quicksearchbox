package com.google.lens.p4707j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.eg */
/* compiled from: PG */
public final class C62511eg extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62511eg f168775b;

    /* renamed from: c */
    private static volatile C63010eb f168776c;

    /* renamed from: a */
    public String f168777a = BuildConfig.FLAVOR;

    static {
        C62511eg egVar = new C62511eg();
        f168775b = egVar;
        C62942bv.registerDefaultInstance(C62511eg.class, egVar);
    }

    private C62511eg() {
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
                return newMessageInfo(f168775b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C62511eg();
            case 4:
                return new C62510ef();
            case 5:
                return f168775b;
            case 6:
                C63010eb ebVar = f168776c;
                if (ebVar == null) {
                    synchronized (C62511eg.class) {
                        ebVar = f168776c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168775b);
                            f168776c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
