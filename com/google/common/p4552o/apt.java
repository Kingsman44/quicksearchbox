package com.google.common.p4552o;

import com.google.android.libraries.search.logging.C38828b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.apt */
/* compiled from: PG */
public final class apt extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final apt f159700c;

    /* renamed from: d */
    private static volatile C63010eb f159701d;

    /* renamed from: a */
    public int f159702a;

    /* renamed from: b */
    public int f159703b;

    static {
        apt apt = new apt();
        f159700c = apt;
        C62942bv.registerDefaultInstance(apt.class, apt);
    }

    private apt() {
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
                return newMessageInfo(f159700c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C38828b.m68179b()});
            case 3:
                return new apt();
            case 4:
                return new aps();
            case 5:
                return f159700c;
            case 6:
                C63010eb ebVar = f159701d;
                if (ebVar == null) {
                    synchronized (apt.class) {
                        ebVar = f159701d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159700c);
                            f159701d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
