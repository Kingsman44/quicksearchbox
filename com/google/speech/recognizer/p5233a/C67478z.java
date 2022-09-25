package com.google.speech.recognizer.p5233a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.recognizer.a.z */
/* compiled from: PG */
public final class C67478z extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67478z f183404a;

    /* renamed from: b */
    private static volatile C63010eb f183405b;

    static {
        C67478z zVar = new C67478z();
        f183404a = zVar;
        C62942bv.registerDefaultInstance(C67478z.class, zVar);
    }

    private C67478z() {
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
                return newMessageInfo(f183404a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67478z();
            case 4:
                return new C67477y();
            case 5:
                return f183404a;
            case 6:
                C63010eb ebVar = f183405b;
                if (ebVar == null) {
                    synchronized (C67478z.class) {
                        ebVar = f183405b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183404a);
                            f183405b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
