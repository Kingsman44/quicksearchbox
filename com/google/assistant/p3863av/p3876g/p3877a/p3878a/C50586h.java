package com.google.assistant.p3863av.p3876g.p3877a.p3878a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.av.g.a.a.h */
/* compiled from: PG */
public final class C50586h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50586h f131635b;

    /* renamed from: c */
    private static volatile C63010eb f131636c;

    /* renamed from: a */
    public C62971cq f131637a = emptyProtobufList();

    static {
        C50586h hVar = new C50586h();
        f131635b = hVar;
        C62942bv.registerDefaultInstance(C50586h.class, hVar);
    }

    private C50586h() {
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
                return newMessageInfo(f131635b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C50580b.class});
            case 3:
                return new C50586h();
            case 4:
                return new C50585g();
            case 5:
                return f131635b;
            case 6:
                C63010eb ebVar = f131636c;
                if (ebVar == null) {
                    synchronized (C50586h.class) {
                        ebVar = f131636c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131635b);
                            f131636c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
