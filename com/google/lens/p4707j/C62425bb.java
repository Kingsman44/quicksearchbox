package com.google.lens.p4707j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.bb */
/* compiled from: PG */
public final class C62425bb extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62425bb f168506e;

    /* renamed from: g */
    private static volatile C63010eb f168507g;

    /* renamed from: a */
    public int f168508a;

    /* renamed from: b */
    public int f168509b = 0;

    /* renamed from: c */
    public Object f168510c;

    /* renamed from: d */
    public int f168511d;

    /* renamed from: f */
    private byte f168512f = 2;

    static {
        C62425bb bbVar = new C62425bb();
        f168506e = bbVar;
        C62942bv.registerDefaultInstance(C62425bb.class, bbVar);
    }

    private C62425bb() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168512f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f168512f = b;
                return null;
            case 2:
                return newMessageInfo(f168506e, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0003\u0001ဌ\u0000\u0002ᐼ\u0000\u0003ᐼ\u0000\u0004ြ\u0000\u0005ᐼ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C62428be.f168520a, C62536fe.class, C62400ad.class, C62407ak.class, C62507ec.class});
            case 3:
                return new C62425bb();
            case 4:
                return new C62424ba();
            case 5:
                return f168506e;
            case 6:
                C63010eb ebVar = f168507g;
                if (ebVar == null) {
                    synchronized (C62425bb.class) {
                        ebVar = f168507g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168506e);
                            f168507g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
