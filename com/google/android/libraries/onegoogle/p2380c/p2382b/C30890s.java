package com.google.android.libraries.onegoogle.p2380c.p2382b;

import com.google.common.p4552o.aih;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.onegoogle.c.b.s */
/* compiled from: PG */
public final class C30890s extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C30890s f83291c;

    /* renamed from: d */
    private static volatile C63010eb f83292d;

    /* renamed from: a */
    public int f83293a;

    /* renamed from: b */
    public aih f83294b;

    static {
        C30890s sVar = new C30890s();
        f83291c = sVar;
        C62942bv.registerDefaultInstance(C30890s.class, sVar);
    }

    private C30890s() {
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
                return newMessageInfo(f83291c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C30890s();
            case 4:
                return new C30889r();
            case 5:
                return f83291c;
            case 6:
                C63010eb ebVar = f83292d;
                if (ebVar == null) {
                    synchronized (C30890s.class) {
                        ebVar = f83292d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f83291c);
                            f83292d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
