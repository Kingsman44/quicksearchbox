package com.google.knowledge.p4671b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.b.i */
/* compiled from: PG */
public final class C61816i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C61816i f166995c;

    /* renamed from: d */
    private static volatile C63010eb f166996d;

    /* renamed from: a */
    public int f166997a;

    /* renamed from: b */
    public boolean f166998b;

    static {
        C61816i iVar = new C61816i();
        f166995c = iVar;
        C62942bv.registerDefaultInstance(C61816i.class, iVar);
    }

    private C61816i() {
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
                return newMessageInfo(f166995c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C61816i();
            case 4:
                return new C61815h();
            case 5:
                return f166995c;
            case 6:
                C63010eb ebVar = f166996d;
                if (ebVar == null) {
                    synchronized (C61816i.class) {
                        ebVar = f166996d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166995c);
                            f166996d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
