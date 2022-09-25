package com.google.android.libraries.assistant.p1467d.p1471b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.d.b.g */
/* compiled from: PG */
public final class C17821g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C17821g f51133c;

    /* renamed from: d */
    private static volatile C63010eb f51134d;

    /* renamed from: a */
    public int f51135a;

    /* renamed from: b */
    public int f51136b;

    static {
        C17821g gVar = new C17821g();
        f51133c = gVar;
        C62942bv.registerDefaultInstance(C17821g.class, gVar);
    }

    private C17821g() {
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
                return newMessageInfo(f51133c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C17819e.m35068b()});
            case 3:
                return new C17821g();
            case 4:
                return new C17820f();
            case 5:
                return f51133c;
            case 6:
                C63010eb ebVar = f51134d;
                if (ebVar == null) {
                    synchronized (C17821g.class) {
                        ebVar = f51134d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f51133c);
                            f51134d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
