package com.google.speech.recognizer.p5233a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.recognizer.a.r */
/* compiled from: PG */
public final class C67470r extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67470r f183377c;

    /* renamed from: e */
    private static volatile C63010eb f183378e;

    /* renamed from: a */
    public float f183379a;

    /* renamed from: b */
    public float f183380b;

    /* renamed from: d */
    private int f183381d;

    static {
        C67470r rVar = new C67470r();
        f183377c = rVar;
        C62942bv.registerDefaultInstance(C67470r.class, rVar);
    }

    private C67470r() {
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
                return newMessageInfo(f183377c, "\u0001\u0002\u0000\u0001\u0001\n\u0002\u0000\u0000\u0000\u0001ခ\u0000\nခ\t", new Object[]{"d", "a", "b"});
            case 3:
                return new C67470r();
            case 4:
                return new C67469q();
            case 5:
                return f183377c;
            case 6:
                C63010eb ebVar = f183378e;
                if (ebVar == null) {
                    synchronized (C67470r.class) {
                        ebVar = f183378e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183377c);
                            f183378e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
