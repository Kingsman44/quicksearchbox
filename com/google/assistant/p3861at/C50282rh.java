package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.rh */
/* compiled from: PG */
public final class C50282rh extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50282rh f130762c;

    /* renamed from: d */
    private static volatile C63010eb f130763d;

    /* renamed from: a */
    public C62971cq f130764a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f130765b = emptyProtobufList();

    static {
        C50282rh rhVar = new C50282rh();
        f130762c = rhVar;
        C62942bv.registerDefaultInstance(C50282rh.class, rhVar);
    }

    private C50282rh() {
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
                return newMessageInfo(f130762c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"b", C50270qw.class, "a", C50268qu.class});
            case 3:
                return new C50282rh();
            case 4:
                return new C50254qg();
            case 5:
                return f130762c;
            case 6:
                C63010eb ebVar = f130763d;
                if (ebVar == null) {
                    synchronized (C50282rh.class) {
                        ebVar = f130763d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130762c);
                            f130763d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
