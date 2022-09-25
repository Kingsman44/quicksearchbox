package com.google.p4283bv.p4354e.p4356b.p4358b.p4360b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.b.aj */
/* compiled from: PG */
public final class C57126aj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57126aj f152491c;

    /* renamed from: d */
    private static volatile C63010eb f152492d;

    /* renamed from: a */
    public int f152493a;

    /* renamed from: b */
    public int f152494b;

    static {
        C57126aj ajVar = new C57126aj();
        f152491c = ajVar;
        C62942bv.registerDefaultInstance(C57126aj.class, ajVar);
    }

    private C57126aj() {
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
                return newMessageInfo(f152491c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C57125ai.m88262b()});
            case 3:
                return new C57126aj();
            case 4:
                return new C57123ag();
            case 5:
                return f152491c;
            case 6:
                C63010eb ebVar = f152492d;
                if (ebVar == null) {
                    synchronized (C57126aj.class) {
                        ebVar = f152492d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152491c);
                            f152492d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
