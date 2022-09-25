package com.google.android.libraries.lens.view.p2067ak;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.ak.cm */
/* compiled from: PG */
public final class C25261cm extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C25261cm f68722b;

    /* renamed from: c */
    private static volatile C63010eb f68723c;

    /* renamed from: a */
    public String f68724a = BuildConfig.FLAVOR;

    static {
        C25261cm cmVar = new C25261cm();
        f68722b = cmVar;
        C62942bv.registerDefaultInstance(C25261cm.class, cmVar);
    }

    private C25261cm() {
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
                return newMessageInfo(f68722b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C25261cm();
            case 4:
                return new C25260cl();
            case 5:
                return f68722b;
            case 6:
                C63010eb ebVar = f68723c;
                if (ebVar == null) {
                    synchronized (C25261cm.class) {
                        ebVar = f68723c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68722b);
                            f68723c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
