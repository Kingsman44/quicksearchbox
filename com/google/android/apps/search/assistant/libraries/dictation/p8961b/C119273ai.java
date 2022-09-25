package com.google.android.apps.search.assistant.libraries.dictation.p8961b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.libraries.dictation.b.ai */
/* compiled from: PG */
public final class C119273ai extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C119273ai f332618b;

    /* renamed from: c */
    private static volatile C63010eb f332619c;

    /* renamed from: a */
    public boolean f332620a;

    static {
        C119273ai aiVar = new C119273ai();
        f332618b = aiVar;
        C62942bv.registerDefaultInstance(C119273ai.class, aiVar);
    }

    private C119273ai() {
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
                return newMessageInfo(f332618b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            case 3:
                return new C119273ai();
            case 4:
                return new C119272ah();
            case 5:
                return f332618b;
            case 6:
                C63010eb ebVar = f332619c;
                if (ebVar == null) {
                    synchronized (C119273ai.class) {
                        ebVar = f332619c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f332618b);
                            f332619c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
