package com.google.p4283bv.p4354e.p4356b.p4358b.p4360b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.b.ae */
/* compiled from: PG */
public final class C57121ae extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57121ae f152475c;

    /* renamed from: d */
    private static volatile C63010eb f152476d;

    /* renamed from: a */
    public int f152477a;

    /* renamed from: b */
    public int f152478b;

    static {
        C57121ae aeVar = new C57121ae();
        f152475c = aeVar;
        C62942bv.registerDefaultInstance(C57121ae.class, aeVar);
    }

    private C57121ae() {
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
                return newMessageInfo(f152475c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C57121ae();
            case 4:
                return new C57120ad();
            case 5:
                return f152475c;
            case 6:
                C63010eb ebVar = f152476d;
                if (ebVar == null) {
                    synchronized (C57121ae.class) {
                        ebVar = f152476d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152475c);
                            f152476d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
