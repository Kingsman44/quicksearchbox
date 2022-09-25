package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.me */
/* compiled from: PG */
public final class C67131me extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67131me f182477b;

    /* renamed from: c */
    private static volatile C63010eb f182478c;

    /* renamed from: a */
    public C62995dn f182479a = C62995dn.f170057a;

    static {
        C67131me meVar = new C67131me();
        f182477b = meVar;
        C62942bv.registerDefaultInstance(C67131me.class, meVar);
    }

    private C67131me() {
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
                return newMessageInfo(f182477b, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0001\u0000\u0000\u00032", new Object[]{"a", C67130md.f182476a});
            case 3:
                return new C67131me();
            case 4:
                return new C67129mc();
            case 5:
                return f182477b;
            case 6:
                C63010eb ebVar = f182478c;
                if (ebVar == null) {
                    synchronized (C67131me.class) {
                        ebVar = f182478c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182477b);
                            f182478c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
