package com.google.p5277z.p5282c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.z.c.ao */
/* compiled from: PG */
public final class C68005ao extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C68005ao f184258a;

    /* renamed from: d */
    private static volatile C63010eb f184259d;

    /* renamed from: b */
    private C62995dn f184260b = C62995dn.f170057a;

    /* renamed from: c */
    private byte f184261c = 2;

    static {
        C68005ao aoVar = new C68005ao();
        f184258a = aoVar;
        C62942bv.registerDefaultInstance(C68005ao.class, aoVar);
    }

    private C68005ao() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f184261c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f184261c = b;
                return null;
            case 2:
                return newMessageInfo(f184258a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001в", new Object[]{"b", C68004an.f184257a});
            case 3:
                return new C68005ao();
            case 4:
                return new C68003am();
            case 5:
                return f184258a;
            case 6:
                C63010eb ebVar = f184259d;
                if (ebVar == null) {
                    synchronized (C68005ao.class) {
                        ebVar = f184259d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184258a);
                            f184259d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
