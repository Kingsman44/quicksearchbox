package com.google.android.apps.search.assistant.libraries.dictation.p8961b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.libraries.dictation.b.aa */
/* compiled from: PG */
public final class C119265aa extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C119265aa f332604c;

    /* renamed from: d */
    private static volatile C63010eb f332605d;

    /* renamed from: a */
    public long f332606a;

    /* renamed from: b */
    public long f332607b;

    static {
        C119265aa aaVar = new C119265aa();
        f332604c = aaVar;
        C62942bv.registerDefaultInstance(C119265aa.class, aaVar);
    }

    private C119265aa() {
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
                return newMessageInfo(f332604c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"a", "b"});
            case 3:
                return new C119265aa();
            case 4:
                return new C119304z();
            case 5:
                return f332604c;
            case 6:
                C63010eb ebVar = f332605d;
                if (ebVar == null) {
                    synchronized (C119265aa.class) {
                        ebVar = f332605d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f332604c);
                            f332605d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
