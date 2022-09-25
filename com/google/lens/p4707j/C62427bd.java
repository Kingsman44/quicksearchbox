package com.google.lens.p4707j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.bd */
/* compiled from: PG */
public final class C62427bd extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62427bd f168513e;

    /* renamed from: g */
    private static volatile C63010eb f168514g;

    /* renamed from: a */
    public int f168515a;

    /* renamed from: b */
    public int f168516b = 0;

    /* renamed from: c */
    public Object f168517c;

    /* renamed from: d */
    public C62431bh f168518d;

    /* renamed from: f */
    private byte f168519f = 2;

    static {
        C62427bd bdVar = new C62427bd();
        f168513e = bdVar;
        C62942bv.registerDefaultInstance(C62427bd.class, bdVar);
    }

    private C62427bd() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168519f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f168519f = b;
                return null;
            case 2:
                return newMessageInfo(f168513e, "\u0001\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001ဉ\u0000\u0003ြ\u0000\u0004ᐼ\u0000\u0005ြ\u0000\u0006ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C62569gk.class, C62402af.class, C62409am.class, C62509ee.class});
            case 3:
                return new C62427bd();
            case 4:
                return new C62426bc();
            case 5:
                return f168513e;
            case 6:
                C63010eb ebVar = f168514g;
                if (ebVar == null) {
                    synchronized (C62427bd.class) {
                        ebVar = f168514g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168513e);
                            f168514g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
