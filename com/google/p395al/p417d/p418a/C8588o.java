package com.google.p395al.p417d.p418a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.d.a.o */
/* compiled from: PG */
public final class C8588o extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8588o f29719c;

    /* renamed from: d */
    private static volatile C63010eb f29720d;

    /* renamed from: a */
    public int f29721a;

    /* renamed from: b */
    public long f29722b;

    static {
        C8588o oVar = new C8588o();
        f29719c = oVar;
        C62942bv.registerDefaultInstance(C8588o.class, oVar);
    }

    private C8588o() {
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
                return newMessageInfo(f29719c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဃ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C8588o();
            case 4:
                return new C8587n();
            case 5:
                return f29719c;
            case 6:
                C63010eb ebVar = f29720d;
                if (ebVar == null) {
                    synchronized (C8588o.class) {
                        ebVar = f29720d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29719c);
                            f29720d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
