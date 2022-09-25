package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.jk */
/* compiled from: PG */
public final class C14443jk extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14443jk f43707b;

    /* renamed from: c */
    private static volatile C63010eb f43708c;

    /* renamed from: a */
    public int f43709a;

    static {
        C14443jk jkVar = new C14443jk();
        f43707b = jkVar;
        C62942bv.registerDefaultInstance(C14443jk.class, jkVar);
    }

    private C14443jk() {
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
                return newMessageInfo(f43707b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
            case 3:
                return new C14443jk();
            case 4:
                return new C14442jj();
            case 5:
                return f43707b;
            case 6:
                C63010eb ebVar = f43708c;
                if (ebVar == null) {
                    synchronized (C14443jk.class) {
                        ebVar = f43708c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43707b);
                            f43708c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
