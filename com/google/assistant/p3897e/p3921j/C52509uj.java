package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.uj */
/* compiled from: PG */
public final class C52509uj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52509uj f137841c;

    /* renamed from: d */
    private static volatile C63010eb f137842d;

    /* renamed from: a */
    public int f137843a;

    /* renamed from: b */
    public C52403ql f137844b;

    static {
        C52509uj ujVar = new C52509uj();
        f137841c = ujVar;
        C62942bv.registerDefaultInstance(C52509uj.class, ujVar);
    }

    private C52509uj() {
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
                return newMessageInfo(f137841c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52509uj();
            case 4:
                return new C52508ui();
            case 5:
                return f137841c;
            case 6:
                C63010eb ebVar = f137842d;
                if (ebVar == null) {
                    synchronized (C52509uj.class) {
                        ebVar = f137842d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137841c);
                            f137842d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
