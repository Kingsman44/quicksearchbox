package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.jo */
/* compiled from: PG */
public final class C55200jo extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55200jo f145284c;

    /* renamed from: e */
    private static volatile C63010eb f145285e;

    /* renamed from: a */
    public int f145286a = 30;

    /* renamed from: b */
    public int f145287b;

    /* renamed from: d */
    private int f145288d;

    static {
        C55200jo joVar = new C55200jo();
        f145284c = joVar;
        C62942bv.registerDefaultInstance(C55200jo.class, joVar);
    }

    private C55200jo() {
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
                return newMessageInfo(f145284c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002င\u0001\u0003ဌ\u0002", new Object[]{"d", "a", "b", C55193jh.f145278a});
            case 3:
                return new C55200jo();
            case 4:
                return new C55199jn();
            case 5:
                return f145284c;
            case 6:
                C63010eb ebVar = f145285e;
                if (ebVar == null) {
                    synchronized (C55200jo.class) {
                        ebVar = f145285e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145284c);
                            f145285e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
