package com.google.p4184bj.p4193c.p4197c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.c.c.be */
/* compiled from: PG */
public final class C55958be extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C55958be f148951f;

    /* renamed from: g */
    private static volatile C63010eb f148952g;

    /* renamed from: a */
    public int f148953a;

    /* renamed from: b */
    public int f148954b = 0;

    /* renamed from: c */
    public Object f148955c;

    /* renamed from: d */
    public int f148956d = 1;

    /* renamed from: e */
    public C55957bd f148957e;

    static {
        C55958be beVar = new C55958be();
        f148951f = beVar;
        C62942bv.registerDefaultInstance(C55958be.class, beVar);
    }

    private C55958be() {
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
                return newMessageInfo(f148951f, "\u0001\b\u0001\u0001\u0001\n\b\u0000\u0000\u0000\u0001ြ\u0000\u0002င\u0006\u0003ြ\u0000\u0004ဉ\u0007\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000", new Object[]{C45240c.f118157a, "b", "a", C55977m.class, "d", C55934ah.class, "e", C55990z.class, C55932af.class, C55940an.class, C55981q.class});
            case 3:
                return new C55958be();
            case 4:
                return new C55955bb();
            case 5:
                return f148951f;
            case 6:
                C63010eb ebVar = f148952g;
                if (ebVar == null) {
                    synchronized (C55958be.class) {
                        ebVar = f148952g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f148951f);
                            f148952g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
