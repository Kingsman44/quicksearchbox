package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.bw */
/* compiled from: PG */
public final class C49865bw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49865bw f129579c;

    /* renamed from: e */
    private static volatile C63010eb f129580e;

    /* renamed from: a */
    public C49826ak f129581a;

    /* renamed from: b */
    public C49838aw f129582b;

    /* renamed from: d */
    private int f129583d;

    static {
        C49865bw bwVar = new C49865bw();
        f129579c = bwVar;
        C62942bv.registerDefaultInstance(C49865bw.class, bwVar);
    }

    private C49865bw() {
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
                return newMessageInfo(f129579c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C49865bw();
            case 4:
                return new C49864bv();
            case 5:
                return f129579c;
            case 6:
                C63010eb ebVar = f129580e;
                if (ebVar == null) {
                    synchronized (C49865bw.class) {
                        ebVar = f129580e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129579c);
                            f129580e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
