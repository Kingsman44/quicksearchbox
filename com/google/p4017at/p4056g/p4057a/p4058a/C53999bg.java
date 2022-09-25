package com.google.p4017at.p4056g.p4057a.p4058a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.bg */
/* compiled from: PG */
public final class C53999bg extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53999bg f141668b;

    /* renamed from: c */
    private static volatile C63010eb f141669c;

    /* renamed from: a */
    public C53998bf f141670a;

    static {
        C53999bg bgVar = new C53999bg();
        f141668b = bgVar;
        C62942bv.registerDefaultInstance(C53999bg.class, bgVar);
    }

    private C53999bg() {
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
                return newMessageInfo(f141668b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C53999bg();
            case 4:
                return new C53991az();
            case 5:
                return f141668b;
            case 6:
                C63010eb ebVar = f141669c;
                if (ebVar == null) {
                    synchronized (C53999bg.class) {
                        ebVar = f141669c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141668b);
                            f141669c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
