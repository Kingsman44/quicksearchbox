package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.alk */
/* compiled from: PG */
public final class alk extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final alk f159060d;

    /* renamed from: e */
    private static volatile C63010eb f159061e;

    /* renamed from: a */
    public int f159062a;

    /* renamed from: b */
    public int f159063b;

    /* renamed from: c */
    public boolean f159064c;

    static {
        alk alk = new alk();
        f159060d = alk;
        C62942bv.registerDefaultInstance(alk.class, alk);
    }

    private alk() {
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
                return newMessageInfo(f159060d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", ali.m92431b(), C45240c.f118157a});
            case 3:
                return new alk();
            case 4:
                return new alj();
            case 5:
                return f159060d;
            case 6:
                C63010eb ebVar = f159061e;
                if (ebVar == null) {
                    synchronized (alk.class) {
                        ebVar = f159061e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159060d);
                            f159061e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
