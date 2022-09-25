package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.bk */
/* compiled from: PG */
public final class C51713bk extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51713bk f135658c;

    /* renamed from: d */
    private static volatile C63010eb f135659d;

    /* renamed from: a */
    public int f135660a;

    /* renamed from: b */
    public boolean f135661b;

    static {
        C51713bk bkVar = new C51713bk();
        f135658c = bkVar;
        C62942bv.registerDefaultInstance(C51713bk.class, bkVar);
    }

    private C51713bk() {
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
                return newMessageInfo(f135658c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C51713bk();
            case 4:
                return new C51712bj();
            case 5:
                return f135658c;
            case 6:
                C63010eb ebVar = f135659d;
                if (ebVar == null) {
                    synchronized (C51713bk.class) {
                        ebVar = f135659d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135658c);
                            f135659d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
