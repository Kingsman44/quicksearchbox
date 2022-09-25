package com.google.common.p4552o;

import com.google.assistant.p3745ab.C48206ab;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.n */
/* compiled from: PG */
public final class C60286n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60286n f163096c;

    /* renamed from: d */
    private static volatile C63010eb f163097d;

    /* renamed from: a */
    public int f163098a;

    /* renamed from: b */
    public C48206ab f163099b;

    static {
        C60286n nVar = new C60286n();
        f163096c = nVar;
        C62942bv.registerDefaultInstance(C60286n.class, nVar);
    }

    private C60286n() {
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
                return newMessageInfo(f163096c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C60286n();
            case 4:
                return new C60253m();
            case 5:
                return f163096c;
            case 6:
                C63010eb ebVar = f163097d;
                if (ebVar == null) {
                    synchronized (C60286n.class) {
                        ebVar = f163097d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163096c);
                            f163097d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
