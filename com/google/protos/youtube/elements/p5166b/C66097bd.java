package com.google.protos.youtube.elements.p5166b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.protos.youtube.elements.b.bd */
/* compiled from: PG */
public final class C66097bd extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C66097bd f179735e;

    /* renamed from: g */
    private static volatile C63010eb f179736g;

    /* renamed from: a */
    public int f179737a;

    /* renamed from: b */
    public int f179738b = 0;

    /* renamed from: c */
    public Object f179739c;

    /* renamed from: d */
    public C63042fg f179740d;

    /* renamed from: f */
    private byte f179741f = 2;

    static {
        C66097bd bdVar = new C66097bd();
        f179735e = bdVar;
        C62942bv.registerDefaultInstance(C66097bd.class, bdVar);
    }

    private C66097bd() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179741f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f179741f = b;
                return null;
            case 2:
                return newMessageInfo(f179735e, "\u0001\b\u0001\u0001\u0001\t\b\u0000\u0000\u0002\u0001ဉ\u0000\u0002ြ\u0000\u0003ᐼ\u0000\u0004ᐼ\u0000\u0005ြ\u0000\u0006ြ\u0000\bြ\u0000\tြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C66095bb.class, C66092az.class, C66082ap.class, C66080an.class, C66088av.class, C66090ax.class, C66084ar.class});
            case 3:
                return new C66097bd();
            case 4:
                return new C66096bc();
            case 5:
                return f179735e;
            case 6:
                C63010eb ebVar = f179736g;
                if (ebVar == null) {
                    synchronized (C66097bd.class) {
                        ebVar = f179736g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179735e);
                            f179736g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
