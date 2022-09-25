package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.hf */
/* compiled from: PG */
public final class C14384hf extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14384hf f43513b;

    /* renamed from: c */
    private static volatile C63010eb f43514c;

    /* renamed from: a */
    public C14636z f43515a;

    static {
        C14384hf hfVar = new C14384hf();
        f43513b = hfVar;
        C62942bv.registerDefaultInstance(C14384hf.class, hfVar);
    }

    private C14384hf() {
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
                return newMessageInfo(f43513b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"a"});
            case 3:
                return new C14384hf();
            case 4:
                return new C14383he();
            case 5:
                return f43513b;
            case 6:
                C63010eb ebVar = f43514c;
                if (ebVar == null) {
                    synchronized (C14384hf.class) {
                        ebVar = f43514c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43513b);
                            f43514c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
