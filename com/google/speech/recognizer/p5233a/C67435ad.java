package com.google.speech.recognizer.p5233a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.recognizer.a.ad */
/* compiled from: PG */
public final class C67435ad extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67435ad f183252a;

    /* renamed from: c */
    private static volatile C63010eb f183253c;

    /* renamed from: b */
    private C62995dn f183254b = C62995dn.f170057a;

    static {
        C67435ad adVar = new C67435ad();
        f183252a = adVar;
        C62942bv.registerDefaultInstance(C67435ad.class, adVar);
    }

    private C67435ad() {
        emptyProtobufList();
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
                return newMessageInfo(f183252a, "\u0001\u0001\u0000\u0000\u0005\u0005\u0001\u0001\u0000\u0000\u00052", new Object[]{"b", C67434ac.f183251a});
            case 3:
                return new C67435ad();
            case 4:
                return new C67433ab();
            case 5:
                return f183252a;
            case 6:
                C63010eb ebVar = f183253c;
                if (ebVar == null) {
                    synchronized (C67435ad.class) {
                        ebVar = f183253c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183252a);
                            f183253c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
