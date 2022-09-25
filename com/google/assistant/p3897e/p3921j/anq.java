package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.j.anq */
/* compiled from: PG */
public final class anq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final anq f135451c;

    /* renamed from: d */
    private static volatile C63010eb f135452d;

    /* renamed from: a */
    public int f135453a;

    /* renamed from: b */
    public C63088z f135454b = C63088z.f170246b;

    static {
        anq anq = new anq();
        f135451c = anq;
        C62942bv.registerDefaultInstance(anq.class, anq);
    }

    private anq() {
    }

    /* renamed from: a */
    public static C63010eb m86350a() {
        return f135451c.getParserForType();
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
                return newMessageInfo(f135451c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            case 3:
                return new anq();
            case 4:
                return new anp();
            case 5:
                return f135451c;
            case 6:
                C63010eb ebVar = f135452d;
                if (ebVar == null) {
                    synchronized (anq.class) {
                        ebVar = f135452d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135451c);
                            f135452d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
