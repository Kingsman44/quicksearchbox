package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.zs */
/* compiled from: PG */
public final class C60703zs extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C60703zs f164701f;

    /* renamed from: g */
    private static volatile C63010eb f164702g;

    /* renamed from: a */
    public int f164703a;

    /* renamed from: b */
    public boolean f164704b;

    /* renamed from: c */
    public int f164705c;

    /* renamed from: d */
    public int f164706d;

    /* renamed from: e */
    public C60702zr f164707e;

    static {
        C60703zs zsVar = new C60703zs();
        f164701f = zsVar;
        C62942bv.registerDefaultInstance(C60703zs.class, zsVar);
    }

    private C60703zs() {
        emptyIntList();
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
                return newMessageInfo(f164701f, "\u0001\u0004\u0000\u0001\u0004\t\u0004\u0000\u0000\u0000\u0004ဇ\u0003\u0006ဌ\u0005\u0007ဌ\u0006\tဉ\u0007", new Object[]{"a", "b", C45240c.f118157a, C60700zp.m92637b(), "d", C60697zm.m92635b(), "e"});
            case 3:
                return new C60703zs();
            case 4:
                return new C60698zn();
            case 5:
                return f164701f;
            case 6:
                C63010eb ebVar = f164702g;
                if (ebVar == null) {
                    synchronized (C60703zs.class) {
                        ebVar = f164702g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164701f);
                            f164702g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
