package com.google.android.apps.search.assistant.libraries.dictation.p8961b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.libraries.dictation.b.b */
/* compiled from: PG */
public final class C119280b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C119280b f332629a;

    /* renamed from: b */
    private static volatile C63010eb f332630b;

    static {
        C119280b bVar = new C119280b();
        f332629a = bVar;
        C62942bv.registerDefaultInstance(C119280b.class, bVar);
    }

    private C119280b() {
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
                return newMessageInfo(f332629a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C119280b();
            case 4:
                return new C119264a();
            case 5:
                return f332629a;
            case 6:
                C63010eb ebVar = f332630b;
                if (ebVar == null) {
                    synchronized (C119280b.class) {
                        ebVar = f332630b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f332629a);
                            f332630b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
