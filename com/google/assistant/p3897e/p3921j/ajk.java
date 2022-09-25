package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ajk */
/* compiled from: PG */
public final class ajk extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final ajk f135222c;

    /* renamed from: d */
    private static volatile C63010eb f135223d;

    /* renamed from: a */
    public int f135224a;

    /* renamed from: b */
    public aig f135225b;

    static {
        ajk ajk = new ajk();
        f135222c = ajk;
        C62942bv.registerDefaultInstance(ajk.class, ajk);
    }

    private ajk() {
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
                return newMessageInfo(f135222c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new ajk();
            case 4:
                return new ajj();
            case 5:
                return f135222c;
            case 6:
                C63010eb ebVar = f135223d;
                if (ebVar == null) {
                    synchronized (ajk.class) {
                        ebVar = f135223d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135222c);
                            f135223d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
