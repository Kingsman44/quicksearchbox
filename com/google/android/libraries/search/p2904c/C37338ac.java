package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.ac */
/* compiled from: PG */
public final class C37338ac extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37338ac f99176c;

    /* renamed from: d */
    private static volatile C63010eb f99177d;

    /* renamed from: a */
    public int f99178a;

    /* renamed from: b */
    public int f99179b;

    static {
        C37338ac acVar = new C37338ac();
        f99176c = acVar;
        C62942bv.registerDefaultInstance(C37338ac.class, acVar);
    }

    private C37338ac() {
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
                return newMessageInfo(f99176c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C37341af.m66351b()});
            case 3:
                return new C37338ac();
            case 4:
                return new C37333ab();
            case 5:
                return f99176c;
            case 6:
                C63010eb ebVar = f99177d;
                if (ebVar == null) {
                    synchronized (C37338ac.class) {
                        ebVar = f99177d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99176c);
                            f99177d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
