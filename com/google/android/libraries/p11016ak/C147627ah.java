package com.google.android.libraries.p11016ak;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.ak.ah */
/* compiled from: PG */
public final class C147627ah extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C147627ah f398451b;

    /* renamed from: c */
    private static volatile C63010eb f398452c;

    /* renamed from: a */
    public String f398453a = BuildConfig.FLAVOR;

    static {
        C147627ah ahVar = new C147627ah();
        f398451b = ahVar;
        C62942bv.registerDefaultInstance(C147627ah.class, ahVar);
    }

    private C147627ah() {
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
                return newMessageInfo(f398451b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C147627ah();
            case 4:
                return new C147626ag();
            case 5:
                return f398451b;
            case 6:
                C63010eb ebVar = f398452c;
                if (ebVar == null) {
                    synchronized (C147627ah.class) {
                        ebVar = f398452c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f398451b);
                            f398452c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
