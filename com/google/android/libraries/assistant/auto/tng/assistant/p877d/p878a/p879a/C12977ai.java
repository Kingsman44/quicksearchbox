package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.ai */
/* compiled from: PG */
public final class C12977ai extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C12977ai f40350a;

    /* renamed from: b */
    private static volatile C63010eb f40351b;

    static {
        C12977ai aiVar = new C12977ai();
        f40350a = aiVar;
        C62942bv.registerDefaultInstance(C12977ai.class, aiVar);
    }

    private C12977ai() {
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
                return newMessageInfo(f40350a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C12977ai();
            case 4:
                return new C12976ah();
            case 5:
                return f40350a;
            case 6:
                C63010eb ebVar = f40351b;
                if (ebVar == null) {
                    synchronized (C12977ai.class) {
                        ebVar = f40351b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40350a);
                            f40351b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
