package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ajg */
/* compiled from: PG */
public final class ajg extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final ajg f135216c;

    /* renamed from: d */
    private static volatile C63010eb f135217d;

    /* renamed from: a */
    public int f135218a;

    /* renamed from: b */
    public boolean f135219b;

    static {
        ajg ajg = new ajg();
        f135216c = ajg;
        C62942bv.registerDefaultInstance(ajg.class, ajg);
    }

    private ajg() {
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
                return newMessageInfo(f135216c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new ajg();
            case 4:
                return new ajf();
            case 5:
                return f135216c;
            case 6:
                C63010eb ebVar = f135217d;
                if (ebVar == null) {
                    synchronized (ajg.class) {
                        ebVar = f135217d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135216c);
                            f135217d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
