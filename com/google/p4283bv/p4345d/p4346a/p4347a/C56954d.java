package com.google.p4283bv.p4345d.p4346a.p4347a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.d.a.a.d */
/* compiled from: PG */
public final class C56954d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56954d f152000c;

    /* renamed from: d */
    private static volatile C63010eb f152001d;

    /* renamed from: a */
    public int f152002a = 0;

    /* renamed from: b */
    public Object f152003b;

    static {
        C56954d dVar = new C56954d();
        f152000c = dVar;
        C62942bv.registerDefaultInstance(C56954d.class, dVar);
    }

    private C56954d() {
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
                return newMessageInfo(f152000c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ျ\u0000", new Object[]{"b", "a"});
            case 3:
                return new C56954d();
            case 4:
                return new C56953c();
            case 5:
                return f152000c;
            case 6:
                C63010eb ebVar = f152001d;
                if (ebVar == null) {
                    synchronized (C56954d.class) {
                        ebVar = f152001d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152000c);
                            f152001d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
