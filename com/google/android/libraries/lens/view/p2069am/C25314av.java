package com.google.android.libraries.lens.view.p2069am;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.am.av */
/* compiled from: PG */
public final class C25314av extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C25314av f68875c;

    /* renamed from: d */
    private static volatile C63010eb f68876d;

    /* renamed from: a */
    public float f68877a;

    /* renamed from: b */
    public float f68878b;

    static {
        C25314av avVar = new C25314av();
        f68875c = avVar;
        C62942bv.registerDefaultInstance(C25314av.class, avVar);
    }

    private C25314av() {
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
                return newMessageInfo(f68875c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0002\u0001", new Object[]{"a", "b"});
            case 3:
                return new C25314av();
            case 4:
                return new C25313au();
            case 5:
                return f68875c;
            case 6:
                C63010eb ebVar = f68876d;
                if (ebVar == null) {
                    synchronized (C25314av.class) {
                        ebVar = f68876d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68875c);
                            f68876d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
