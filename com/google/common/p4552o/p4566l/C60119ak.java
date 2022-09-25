package com.google.common.p4552o.p4566l;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.ak */
/* compiled from: PG */
public final class C60119ak extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C60119ak f162585e;

    /* renamed from: g */
    private static volatile C63010eb f162586g;

    /* renamed from: a */
    public int f162587a;

    /* renamed from: b */
    public C60114af f162588b;

    /* renamed from: c */
    public int f162589c;

    /* renamed from: d */
    public C62961ch f162590d = emptyIntList();

    /* renamed from: f */
    private byte f162591f = 2;

    static {
        C60119ak akVar = new C60119ak();
        f162585e = akVar;
        C62942bv.registerDefaultInstance(C60119ak.class, akVar);
    }

    private C60119ak() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f162591f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f162591f = b;
                return null;
            case 2:
                return newMessageInfo(f162585e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0002င\u0001\u0003'", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C60119ak();
            case 4:
                return new C60118aj();
            case 5:
                return f162585e;
            case 6:
                C63010eb ebVar = f162586g;
                if (ebVar == null) {
                    synchronized (C60119ak.class) {
                        ebVar = f162586g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162585e);
                            f162586g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
