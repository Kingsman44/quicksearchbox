package com.google.android.apps.search.assistant.libraries.dictation.p8961b;

import com.google.protobuf.C62912at;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.libraries.dictation.b.j */
/* compiled from: PG */
public final class C119288j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C119288j f332642c;

    /* renamed from: d */
    private static volatile C63010eb f332643d;

    /* renamed from: a */
    public int f332644a = 0;

    /* renamed from: b */
    public Object f332645b;

    static {
        C119288j jVar = new C119288j();
        f332642c = jVar;
        C62942bv.registerDefaultInstance(C119288j.class, jVar);
    }

    private C119288j() {
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
                return newMessageInfo(f332642c, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"b", "a", C119275ak.class, C119301w.class, C62912at.class, C62912at.class, C62912at.class});
            case 3:
                return new C119288j();
            case 4:
                return new C119287i();
            case 5:
                return f332642c;
            case 6:
                C63010eb ebVar = f332643d;
                if (ebVar == null) {
                    synchronized (C119288j.class) {
                        ebVar = f332643d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f332642c);
                            f332643d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
