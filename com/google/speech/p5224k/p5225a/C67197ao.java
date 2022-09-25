package com.google.speech.p5224k.p5225a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.k.a.ao */
/* compiled from: PG */
public final class C67197ao extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67197ao f182649b;

    /* renamed from: c */
    private static volatile C63010eb f182650c;

    /* renamed from: a */
    public C62961ch f182651a = emptyIntList();

    static {
        C67197ao aoVar = new C67197ao();
        f182649b = aoVar;
        C62942bv.registerDefaultInstance(C67197ao.class, aoVar);
    }

    private C67197ao() {
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
                return newMessageInfo(f182649b, "\u0001\u0001\u0000\u0000\f\f\u0001\u0000\u0001\u0000\f\u001e", new Object[]{"a", C67198ap.f182652a});
            case 3:
                return new C67197ao();
            case 4:
                return new C67195am();
            case 5:
                return f182649b;
            case 6:
                C63010eb ebVar = f182650c;
                if (ebVar == null) {
                    synchronized (C67197ao.class) {
                        ebVar = f182650c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182649b);
                            f182650c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
