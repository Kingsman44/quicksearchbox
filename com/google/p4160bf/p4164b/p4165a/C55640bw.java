package com.google.p4160bf.p4164b.p4165a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.bw */
/* compiled from: PG */
public final class C55640bw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55640bw f146805c;

    /* renamed from: d */
    private static volatile C63010eb f146806d;

    /* renamed from: a */
    public int f146807a;

    /* renamed from: b */
    public C55639bv f146808b;

    static {
        C55640bw bwVar = new C55640bw();
        f146805c = bwVar;
        C62942bv.registerDefaultInstance(C55640bw.class, bwVar);
    }

    private C55640bw() {
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
                return newMessageInfo(f146805c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C55640bw();
            case 4:
                return new C55637bt();
            case 5:
                return f146805c;
            case 6:
                C63010eb ebVar = f146806d;
                if (ebVar == null) {
                    synchronized (C55640bw.class) {
                        ebVar = f146806d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146805c);
                            f146806d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
