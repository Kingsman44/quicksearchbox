package com.google.lens.p4707j;

import com.google.lens.p4698d.C62169h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.ei */
/* compiled from: PG */
public final class C62513ei extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62513ei f168778c;

    /* renamed from: e */
    private static volatile C63010eb f168779e;

    /* renamed from: a */
    public int f168780a;

    /* renamed from: b */
    public C62169h f168781b;

    /* renamed from: d */
    private byte f168782d = 2;

    static {
        C62513ei eiVar = new C62513ei();
        f168778c = eiVar;
        C62942bv.registerDefaultInstance(C62513ei.class, eiVar);
    }

    private C62513ei() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168782d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f168782d = b;
                return null;
            case 2:
                return newMessageInfo(f168778c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C62513ei();
            case 4:
                return new C62512eh();
            case 5:
                return f168778c;
            case 6:
                C63010eb ebVar = f168779e;
                if (ebVar == null) {
                    synchronized (C62513ei.class) {
                        ebVar = f168779e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168778c);
                            f168779e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
