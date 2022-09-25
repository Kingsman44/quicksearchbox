package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.j.akr */
/* compiled from: PG */
public final class akr extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final akr f135286b;

    /* renamed from: d */
    private static volatile C63010eb f135287d;

    /* renamed from: a */
    public int f135288a;

    /* renamed from: c */
    private int f135289c;

    static {
        akr akr = new akr();
        f135286b = akr;
        C62942bv.registerDefaultInstance(akr.class, akr);
    }

    private akr() {
        C63088z zVar = C63088z.f170246b;
    }

    /* renamed from: a */
    public static C63010eb m86321a() {
        return f135286b.getParserForType();
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
                return newMessageInfo(f135286b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002င\u0001", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new akr();
            case 4:
                return new akq();
            case 5:
                return f135286b;
            case 6:
                C63010eb ebVar = f135287d;
                if (ebVar == null) {
                    synchronized (akr.class) {
                        ebVar = f135287d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135286b);
                            f135287d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
