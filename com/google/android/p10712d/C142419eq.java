package com.google.android.p10712d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.eq */
/* compiled from: PG */
public final class C142419eq extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C142419eq f386443d;

    /* renamed from: g */
    private static volatile C63010eb f386444g;

    /* renamed from: a */
    public String f386445a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f386446b;

    /* renamed from: c */
    public int f386447c;

    /* renamed from: e */
    private int f386448e;

    /* renamed from: f */
    private byte f386449f = 2;

    static {
        C142419eq eqVar = new C142419eq();
        f386443d = eqVar;
        C62942bv.registerDefaultInstance(C142419eq.class, eqVar);
    }

    private C142419eq() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f386449f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f386449f = b;
                return null;
            case 2:
                return newMessageInfo(f386443d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔌ\u0001\u0003ဆ\u0002", new Object[]{"e", "a", "b", C142431fb.f386497a, C45240c.f118157a});
            case 3:
                return new C142419eq();
            case 4:
                return new C142418ep();
            case 5:
                return f386443d;
            case 6:
                C63010eb ebVar = f386444g;
                if (ebVar == null) {
                    synchronized (C142419eq.class) {
                        ebVar = f386444g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386443d);
                            f386444g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
