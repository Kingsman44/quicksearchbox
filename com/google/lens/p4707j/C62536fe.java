package com.google.lens.p4707j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.fe */
/* compiled from: PG */
public final class C62536fe extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62536fe f168839e;

    /* renamed from: g */
    private static volatile C63010eb f168840g;

    /* renamed from: a */
    public int f168841a;

    /* renamed from: b */
    public int f168842b = 0;

    /* renamed from: c */
    public Object f168843c;

    /* renamed from: d */
    public int f168844d;

    /* renamed from: f */
    private byte f168845f = 2;

    static {
        C62536fe feVar = new C62536fe();
        f168839e = feVar;
        C62942bv.registerDefaultInstance(C62536fe.class, feVar);
    }

    private C62536fe() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168845f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f168845f = b;
                return null;
            case 2:
                return newMessageInfo(f168839e, "\u0001\n\u0001\u0001\u0001\n\n\u0000\u0000\u0003\u0001ဌ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ᐼ\u0000\u0007ြ\u0000\bᐼ\u0000\tᐼ\u0000\nြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C62534fc.f168838a, C62532fa.class, C62522er.class, C62524et.class, C62529ey.class, C62520ep.class, C62538fg.class, C62527ew.class, C62513ei.class, C62515ek.class});
            case 3:
                return new C62536fe();
            case 4:
                return new C62533fb();
            case 5:
                return f168839e;
            case 6:
                C63010eb ebVar = f168840g;
                if (ebVar == null) {
                    synchronized (C62536fe.class) {
                        ebVar = f168840g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168839e);
                            f168840g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
