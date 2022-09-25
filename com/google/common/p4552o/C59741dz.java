package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.dz */
/* compiled from: PG */
public final class C59741dz extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59741dz f160357d;

    /* renamed from: e */
    private static volatile C63010eb f160358e;

    /* renamed from: a */
    public int f160359a;

    /* renamed from: b */
    public int f160360b;

    /* renamed from: c */
    public C59747ed f160361c;

    static {
        C59741dz dzVar = new C59741dz();
        f160357d = dzVar;
        C62942bv.registerDefaultInstance(C59741dz.class, dzVar);
    }

    private C59741dz() {
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
                return newMessageInfo(f160357d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C60547ty.m92614b(), C45240c.f118157a});
            case 3:
                return new C59741dz();
            case 4:
                return new C59740dy();
            case 5:
                return f160357d;
            case 6:
                C63010eb ebVar = f160358e;
                if (ebVar == null) {
                    synchronized (C59741dz.class) {
                        ebVar = f160358e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f160357d);
                            f160358e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
