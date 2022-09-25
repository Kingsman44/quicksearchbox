package com.google.p4283bv.p4354e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C8142xb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.g */
/* compiled from: PG */
public final class C57522g extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57522g f153646d;

    /* renamed from: f */
    private static volatile C63010eb f153647f;

    /* renamed from: a */
    public int f153648a;

    /* renamed from: b */
    public C57526k f153649b;

    /* renamed from: c */
    public int f153650c;

    /* renamed from: e */
    private byte f153651e = 2;

    static {
        C57522g gVar = new C57522g();
        f153646d = gVar;
        C62942bv.registerDefaultInstance(C57522g.class, gVar);
    }

    private C57522g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153651e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153651e = b;
                return null;
            case 2:
                return newMessageInfo(f153646d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C8142xb.m22955b()});
            case 3:
                return new C57522g();
            case 4:
                return new C57521f();
            case 5:
                return f153646d;
            case 6:
                C63010eb ebVar = f153647f;
                if (ebVar == null) {
                    synchronized (C57522g.class) {
                        ebVar = f153647f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153646d);
                            f153647f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
