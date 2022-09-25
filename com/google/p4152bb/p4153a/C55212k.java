package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.k */
/* compiled from: PG */
public final class C55212k extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C55212k f145348f;

    /* renamed from: h */
    private static volatile C63010eb f145349h;

    /* renamed from: a */
    public int f145350a;

    /* renamed from: b */
    public C55136he f145351b;

    /* renamed from: c */
    public C55136he f145352c;

    /* renamed from: d */
    public C55293n f145353d;

    /* renamed from: e */
    public C55136he f145354e;

    /* renamed from: g */
    private byte f145355g = 2;

    static {
        C55212k kVar = new C55212k();
        f145348f = kVar;
        C62942bv.registerDefaultInstance(C55212k.class, kVar);
    }

    private C55212k() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145355g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145355g = b;
                return null;
            case 2:
                return newMessageInfo(f145348f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C55212k();
            case 4:
                return new C55185j();
            case 5:
                return f145348f;
            case 6:
                C63010eb ebVar = f145349h;
                if (ebVar == null) {
                    synchronized (C55212k.class) {
                        ebVar = f145349h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145348f);
                            f145349h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
