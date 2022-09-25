package com.google.android.apps.gsa.nga.shared.p6274a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.a.s */
/* compiled from: PG */
public final class C80073s extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80073s f219718c;

    /* renamed from: d */
    private static volatile C63010eb f219719d;

    /* renamed from: a */
    public int f219720a = 0;

    /* renamed from: b */
    public Object f219721b;

    static {
        C80073s sVar = new C80073s();
        f219718c = sVar;
        C62942bv.registerDefaultInstance(C80073s.class, sVar);
    }

    private C80073s() {
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
                return newMessageInfo(f219718c, "\u0000\u0002\u0001\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u00023\u0000\u00033\u0000", new Object[]{"b", "a"});
            case 3:
                return new C80073s();
            case 4:
                return new C80071q();
            case 5:
                return f219718c;
            case 6:
                C63010eb ebVar = f219719d;
                if (ebVar == null) {
                    synchronized (C80073s.class) {
                        ebVar = f219719d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219718c);
                            f219719d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
