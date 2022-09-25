package com.google.p4242bp.p4267h;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4152bb.p4153a.C55136he;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.h.r */
/* compiled from: PG */
public final class C56411r extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56411r f150436d;

    /* renamed from: f */
    private static volatile C63010eb f150437f;

    /* renamed from: a */
    public int f150438a;

    /* renamed from: b */
    public int f150439b;

    /* renamed from: c */
    public C55136he f150440c;

    /* renamed from: e */
    private byte f150441e = 2;

    static {
        C56411r rVar = new C56411r();
        f150436d = rVar;
        C62942bv.registerDefaultInstance(C56411r.class, rVar);
    }

    private C56411r() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f150441e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f150441e = b;
                return null;
            case 2:
                return newMessageInfo(f150436d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001င\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C56411r();
            case 4:
                return new C56410q();
            case 5:
                return f150436d;
            case 6:
                C63010eb ebVar = f150437f;
                if (ebVar == null) {
                    synchronized (C56411r.class) {
                        ebVar = f150437f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150436d);
                            f150437f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
