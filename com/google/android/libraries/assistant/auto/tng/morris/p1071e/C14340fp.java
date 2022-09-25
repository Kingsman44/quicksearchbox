package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.fp */
/* compiled from: PG */
public final class C14340fp extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14340fp f43386b;

    /* renamed from: c */
    private static volatile C63010eb f43387c;

    /* renamed from: a */
    public int f43388a;

    static {
        C14340fp fpVar = new C14340fp();
        f43386b = fpVar;
        C62942bv.registerDefaultInstance(C14340fp.class, fpVar);
    }

    private C14340fp() {
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
                return newMessageInfo(f43386b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C14340fp();
            case 4:
                return new C14339fo();
            case 5:
                return f43386b;
            case 6:
                C63010eb ebVar = f43387c;
                if (ebVar == null) {
                    synchronized (C14340fp.class) {
                        ebVar = f43387c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43386b);
                            f43387c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
