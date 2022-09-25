package com.google.lens.p4707j;

import com.google.lens.p4698d.C62171j;
import com.google.lens.p4698d.C62176o;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.ad */
/* compiled from: PG */
public final class C62400ad extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62400ad f168445c;

    /* renamed from: e */
    private static volatile C63010eb f168446e;

    /* renamed from: a */
    public int f168447a = 0;

    /* renamed from: b */
    public Object f168448b;

    /* renamed from: d */
    private byte f168449d = 2;

    static {
        C62400ad adVar = new C62400ad();
        f168445c = adVar;
        C62942bv.registerDefaultInstance(C62400ad.class, adVar);
    }

    private C62400ad() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168449d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f168449d = b;
                return null;
            case 2:
                return newMessageInfo(f168445c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001ြ\u0000\u0002ᐼ\u0000", new Object[]{"b", "a", C62171j.class, C62176o.class});
            case 3:
                return new C62400ad();
            case 4:
                return new C62399ac();
            case 5:
                return f168445c;
            case 6:
                C63010eb ebVar = f168446e;
                if (ebVar == null) {
                    synchronized (C62400ad.class) {
                        ebVar = f168446e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168445c);
                            f168446e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
