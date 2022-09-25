package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.c.a.dh */
/* compiled from: PG */
public final class C57307dh extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57307dh f152966c;

    /* renamed from: d */
    private static volatile C63010eb f152967d;

    /* renamed from: a */
    public int f152968a = 0;

    /* renamed from: b */
    public Object f152969b;

    static {
        C57307dh dhVar = new C57307dh();
        f152966c = dhVar;
        C62942bv.registerDefaultInstance(C57307dh.class, dhVar);
    }

    private C57307dh() {
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
                return newMessageInfo(f152966c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"b", "a", C57306dg.class});
            case 3:
                return new C57307dh();
            case 4:
                return new C57304de();
            case 5:
                return f152966c;
            case 6:
                C63010eb ebVar = f152967d;
                if (ebVar == null) {
                    synchronized (C57307dh.class) {
                        ebVar = f152967d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152966c);
                            f152967d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
