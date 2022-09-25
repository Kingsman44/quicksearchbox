package com.google.speech.p5228m;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.az */
/* compiled from: PG */
public final class C67295az extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67295az f182919c;

    /* renamed from: d */
    private static volatile C63010eb f182920d;

    /* renamed from: a */
    public int f182921a;

    /* renamed from: b */
    public int f182922b;

    static {
        C67295az azVar = new C67295az();
        f182919c = azVar;
        C62942bv.registerDefaultInstance(C67295az.class, azVar);
    }

    private C67295az() {
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
                return newMessageInfo(f182919c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C67295az();
            case 4:
                return new C67294ay();
            case 5:
                return f182919c;
            case 6:
                C63010eb ebVar = f182920d;
                if (ebVar == null) {
                    synchronized (C67295az.class) {
                        ebVar = f182920d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182919c);
                            f182920d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
