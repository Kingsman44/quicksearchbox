package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.f.a.a.p */
/* compiled from: PG */
public final class C57655p extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C57655p f153967a;

    /* renamed from: d */
    private static volatile C63010eb f153968d;

    /* renamed from: b */
    private C57590bg f153969b;

    /* renamed from: c */
    private byte f153970c = 2;

    static {
        C57655p pVar = new C57655p();
        f153967a = pVar;
        C62942bv.registerDefaultInstance(C57655p.class, pVar);
    }

    private C57655p() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153970c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f153970c = b;
                return null;
            case 2:
                return newMessageInfo(f153967a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"b"});
            case 3:
                return new C57655p();
            case 4:
                return new C57654o();
            case 5:
                return f153967a;
            case 6:
                C63010eb ebVar = f153968d;
                if (ebVar == null) {
                    synchronized (C57655p.class) {
                        ebVar = f153968d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153967a);
                            f153968d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
