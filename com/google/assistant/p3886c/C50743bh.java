package com.google.assistant.p3886c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.bh */
/* compiled from: PG */
public final class C50743bh extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50743bh f132051c;

    /* renamed from: e */
    private static volatile C63010eb f132052e;

    /* renamed from: a */
    public C50741bf f132053a;

    /* renamed from: b */
    public C62971cq f132054b = emptyProtobufList();

    /* renamed from: d */
    private int f132055d;

    static {
        C50743bh bhVar = new C50743bh();
        f132051c = bhVar;
        C62942bv.registerDefaultInstance(C50743bh.class, bhVar);
    }

    private C50743bh() {
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
                return newMessageInfo(f132051c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"d", "a", "b", C50741bf.class});
            case 3:
                return new C50743bh();
            case 4:
                return new C50742bg();
            case 5:
                return f132051c;
            case 6:
                C63010eb ebVar = f132052e;
                if (ebVar == null) {
                    synchronized (C50743bh.class) {
                        ebVar = f132052e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132051c);
                            f132052e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
