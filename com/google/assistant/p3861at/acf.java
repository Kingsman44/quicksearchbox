package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.acf */
/* compiled from: PG */
public final class acf extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final acf f128844c;

    /* renamed from: d */
    private static volatile C63010eb f128845d;

    /* renamed from: a */
    public int f128846a;

    /* renamed from: b */
    public aan f128847b;

    static {
        acf acf = new acf();
        f128844c = acf;
        C62942bv.registerDefaultInstance(acf.class, acf);
    }

    private acf() {
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
                return newMessageInfo(f128844c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"a", "b"});
            case 3:
                return new acf();
            case 4:
                return new ace();
            case 5:
                return f128844c;
            case 6:
                C63010eb ebVar = f128845d;
                if (ebVar == null) {
                    synchronized (acf.class) {
                        ebVar = f128845d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128844c);
                            f128845d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
