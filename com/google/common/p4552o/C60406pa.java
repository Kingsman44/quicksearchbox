package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.pa */
/* compiled from: PG */
public final class C60406pa extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60406pa f163474c;

    /* renamed from: d */
    private static volatile C63010eb f163475d;

    /* renamed from: a */
    public int f163476a;

    /* renamed from: b */
    public C60408pc f163477b;

    static {
        C60406pa paVar = new C60406pa();
        f163474c = paVar;
        C62942bv.registerDefaultInstance(C60406pa.class, paVar);
    }

    private C60406pa() {
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
                return newMessageInfo(f163474c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C60406pa();
            case 4:
                return new C60342oz();
            case 5:
                return f163474c;
            case 6:
                C63010eb ebVar = f163475d;
                if (ebVar == null) {
                    synchronized (C60406pa.class) {
                        ebVar = f163475d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163474c);
                            f163475d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
