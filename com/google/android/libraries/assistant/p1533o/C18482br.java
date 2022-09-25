package com.google.android.libraries.assistant.p1533o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.o.br */
/* compiled from: PG */
public final class C18482br extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C18482br f52415c;

    /* renamed from: d */
    private static volatile C63010eb f52416d;

    /* renamed from: a */
    public int f52417a = 0;

    /* renamed from: b */
    public Object f52418b;

    static {
        C18482br brVar = new C18482br();
        f52415c = brVar;
        C62942bv.registerDefaultInstance(C18482br.class, brVar);
    }

    private C18482br() {
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
                return newMessageInfo(f52415c, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"b", "a", C18479bo.class, C18481bq.class, C18477bm.class});
            case 3:
                return new C18482br();
            case 4:
                return new C18474bj();
            case 5:
                return f52415c;
            case 6:
                C63010eb ebVar = f52416d;
                if (ebVar == null) {
                    synchronized (C18482br.class) {
                        ebVar = f52416d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f52415c);
                            f52416d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
