package com.google.assistant.p3781ad.p3789d.p3791b.p3792a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.a.s */
/* compiled from: PG */
public final class C48658s extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48658s f125753c;

    /* renamed from: d */
    private static volatile C63010eb f125754d;

    /* renamed from: a */
    public boolean f125755a;

    /* renamed from: b */
    public int f125756b;

    static {
        C48658s sVar = new C48658s();
        f125753c = sVar;
        C62942bv.registerDefaultInstance(C48658s.class, sVar);
    }

    private C48658s() {
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
                return newMessageInfo(f125753c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0004", new Object[]{"a", "b"});
            case 3:
                return new C48658s();
            case 4:
                return new C48657r();
            case 5:
                return f125753c;
            case 6:
                C63010eb ebVar = f125754d;
                if (ebVar == null) {
                    synchronized (C48658s.class) {
                        ebVar = f125754d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125753c);
                            f125754d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
