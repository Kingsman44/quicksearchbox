package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.ar */
/* compiled from: PG */
public final class C56237ar extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56237ar f149786c;

    /* renamed from: d */
    private static volatile C63010eb f149787d;

    /* renamed from: a */
    public int f149788a;

    /* renamed from: b */
    public C56224ae f149789b;

    static {
        C56237ar arVar = new C56237ar();
        f149786c = arVar;
        C62942bv.registerDefaultInstance(C56237ar.class, arVar);
    }

    private C56237ar() {
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
                return newMessageInfo(f149786c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C56237ar();
            case 4:
                return new C56236aq();
            case 5:
                return f149786c;
            case 6:
                C63010eb ebVar = f149787d;
                if (ebVar == null) {
                    synchronized (C56237ar.class) {
                        ebVar = f149787d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149786c);
                            f149787d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
