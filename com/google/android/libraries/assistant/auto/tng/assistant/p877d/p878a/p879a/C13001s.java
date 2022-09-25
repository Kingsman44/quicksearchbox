package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a;

import com.google.android.apps.auto.p450a.p451a.C8857ab;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.s */
/* compiled from: PG */
public final class C13001s extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C13001s f40405b;

    /* renamed from: c */
    private static volatile C63010eb f40406c;

    /* renamed from: a */
    public C62971cq f40407a = emptyProtobufList();

    static {
        C13001s sVar = new C13001s();
        f40405b = sVar;
        C62942bv.registerDefaultInstance(C13001s.class, sVar);
    }

    private C13001s() {
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
                return newMessageInfo(f40405b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C8857ab.class});
            case 3:
                return new C13001s();
            case 4:
                return new C13000r();
            case 5:
                return f40405b;
            case 6:
                C63010eb ebVar = f40406c;
                if (ebVar == null) {
                    synchronized (C13001s.class) {
                        ebVar = f40406c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40405b);
                            f40406c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
