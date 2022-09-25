package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ack */
/* compiled from: PG */
public final class ack extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final ack f128849b;

    /* renamed from: d */
    private static volatile C63010eb f128850d;

    /* renamed from: a */
    public int f128851a;

    /* renamed from: c */
    private int f128852c;

    static {
        ack ack = new ack();
        f128849b = ack;
        C62942bv.registerDefaultInstance(ack.class, ack);
    }

    private ack() {
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
                return newMessageInfo(f128849b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new ack();
            case 4:
                return new acj();
            case 5:
                return f128849b;
            case 6:
                C63010eb ebVar = f128850d;
                if (ebVar == null) {
                    synchronized (ack.class) {
                        ebVar = f128850d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128849b);
                            f128850d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
