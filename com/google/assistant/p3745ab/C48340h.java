package com.google.assistant.p3745ab;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.h */
/* compiled from: PG */
public final class C48340h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48340h f125003b;

    /* renamed from: c */
    private static volatile C63010eb f125004c;

    /* renamed from: a */
    public C48352l f125005a;

    static {
        C48340h hVar = new C48340h();
        f125003b = hVar;
        C62942bv.registerDefaultInstance(C48340h.class, hVar);
    }

    private C48340h() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f125003b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"a"});
            case 3:
                return new C48340h();
            case 4:
                return new C48325g();
            case 5:
                return f125003b;
            case 6:
                C63010eb ebVar = f125004c;
                if (ebVar == null) {
                    synchronized (C48340h.class) {
                        ebVar = f125004c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125003b);
                            f125004c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
