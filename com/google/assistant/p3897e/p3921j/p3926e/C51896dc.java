package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.dc */
/* compiled from: PG */
public final class C51896dc extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51896dc f136128b;

    /* renamed from: d */
    private static volatile C63010eb f136129d;

    /* renamed from: a */
    public boolean f136130a;

    /* renamed from: c */
    private int f136131c;

    static {
        C51896dc dcVar = new C51896dc();
        f136128b = dcVar;
        C62942bv.registerDefaultInstance(C51896dc.class, dcVar);
    }

    private C51896dc() {
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
                return newMessageInfo(f136128b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C51896dc();
            case 4:
                return new C51895db();
            case 5:
                return f136128b;
            case 6:
                C63010eb ebVar = f136129d;
                if (ebVar == null) {
                    synchronized (C51896dc.class) {
                        ebVar = f136129d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136128b);
                            f136129d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
