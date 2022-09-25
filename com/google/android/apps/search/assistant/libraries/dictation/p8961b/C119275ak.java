package com.google.android.apps.search.assistant.libraries.dictation.p8961b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.libraries.dictation.b.ak */
/* compiled from: PG */
public final class C119275ak extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C119275ak f332621b;

    /* renamed from: c */
    private static volatile C63010eb f332622c;

    /* renamed from: a */
    public int f332623a;

    static {
        C119275ak akVar = new C119275ak();
        f332621b = akVar;
        C62942bv.registerDefaultInstance(C119275ak.class, akVar);
    }

    private C119275ak() {
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
                return newMessageInfo(f332621b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C119275ak();
            case 4:
                return new C119274aj();
            case 5:
                return f332621b;
            case 6:
                C63010eb ebVar = f332622c;
                if (ebVar == null) {
                    synchronized (C119275ak.class) {
                        ebVar = f332622c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f332621b);
                            f332622c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
