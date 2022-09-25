package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.oz */
/* compiled from: PG */
public final class C52363oz extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52363oz f137413c;

    /* renamed from: d */
    private static volatile C63010eb f137414d;

    /* renamed from: a */
    public int f137415a;

    /* renamed from: b */
    public int f137416b;

    static {
        C52363oz ozVar = new C52363oz();
        f137413c = ozVar;
        C62942bv.registerDefaultInstance(C52363oz.class, ozVar);
    }

    private C52363oz() {
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
                return newMessageInfo(f137413c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C52361ox.f137412a});
            case 3:
                return new C52363oz();
            case 4:
                return new C52360ow();
            case 5:
                return f137413c;
            case 6:
                C63010eb ebVar = f137414d;
                if (ebVar == null) {
                    synchronized (C52363oz.class) {
                        ebVar = f137414d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137413c);
                            f137414d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
