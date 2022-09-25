package com.google.p4017at.p4018a.p4019a.p4020a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.a.a.a.bf */
/* compiled from: PG */
public final class C53775bf extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53775bf f141151c;

    /* renamed from: d */
    private static volatile C63010eb f141152d;

    /* renamed from: a */
    public int f141153a;

    /* renamed from: b */
    public int f141154b;

    static {
        C53775bf bfVar = new C53775bf();
        f141151c = bfVar;
        C62942bv.registerDefaultInstance(C53775bf.class, bfVar);
    }

    private C53775bf() {
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
                return newMessageInfo(f141151c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C53773bd.f141150a});
            case 3:
                return new C53775bf();
            case 4:
                return new C53772bc();
            case 5:
                return f141151c;
            case 6:
                C63010eb ebVar = f141152d;
                if (ebVar == null) {
                    synchronized (C53775bf.class) {
                        ebVar = f141152d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141151c);
                            f141152d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
