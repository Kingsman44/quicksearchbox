package com.google.p4184bj.p4193c.p4197c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.c.c.v */
/* compiled from: PG */
public final class C55986v extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55986v f149092c;

    /* renamed from: f */
    private static volatile C63010eb f149093f;

    /* renamed from: a */
    public int f149094a;

    /* renamed from: b */
    public C55984t f149095b;

    /* renamed from: d */
    private C55954ba f149096d;

    /* renamed from: e */
    private byte f149097e = 2;

    static {
        C55986v vVar = new C55986v();
        f149092c = vVar;
        C62942bv.registerDefaultInstance(C55986v.class, vVar);
    }

    private C55986v() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f149097e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f149097e = b;
                return null;
            case 2:
                return newMessageInfo(f149092c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"a", "d", "b"});
            case 3:
                return new C55986v();
            case 4:
                return new C55985u();
            case 5:
                return f149092c;
            case 6:
                C63010eb ebVar = f149093f;
                if (ebVar == null) {
                    synchronized (C55986v.class) {
                        ebVar = f149093f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149092c);
                            f149093f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
