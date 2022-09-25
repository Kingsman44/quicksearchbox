package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.po */
/* compiled from: PG */
public final class C50235po extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50235po f130611e;

    /* renamed from: g */
    private static volatile C63010eb f130612g;

    /* renamed from: a */
    public int f130613a;

    /* renamed from: b */
    public int f130614b = 0;

    /* renamed from: c */
    public Object f130615c;

    /* renamed from: d */
    public int f130616d;

    /* renamed from: f */
    private byte f130617f = 2;

    static {
        C50235po poVar = new C50235po();
        f130611e = poVar;
        C62942bv.registerDefaultInstance(C50235po.class, poVar);
    }

    private C50235po() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f130617f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f130617f = b;
                return null;
            case 2:
                return newMessageInfo(f130611e, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဌ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ᐼ\u0000\u0006ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C50232pl.f130604a, C50229pi.class, C50231pk.class, C50234pn.class, C50225pe.class, C50227pg.class});
            case 3:
                return new C50235po();
            case 4:
                return new C50223pc();
            case 5:
                return f130611e;
            case 6:
                C63010eb ebVar = f130612g;
                if (ebVar == null) {
                    synchronized (C50235po.class) {
                        ebVar = f130612g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130611e);
                            f130612g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
