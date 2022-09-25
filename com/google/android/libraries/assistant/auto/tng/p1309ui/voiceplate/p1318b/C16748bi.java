package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bi */
/* compiled from: PG */
public final class C16748bi extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C16748bi f48976c;

    /* renamed from: d */
    private static volatile C63010eb f48977d;

    /* renamed from: a */
    public int f48978a;

    /* renamed from: b */
    public int f48979b;

    static {
        C16748bi biVar = new C16748bi();
        f48976c = biVar;
        C62942bv.registerDefaultInstance(C16748bi.class, biVar);
    }

    private C16748bi() {
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
                return newMessageInfo(f48976c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C16748bi();
            case 4:
                return new C16747bh();
            case 5:
                return f48976c;
            case 6:
                C63010eb ebVar = f48977d;
                if (ebVar == null) {
                    synchronized (C16748bi.class) {
                        ebVar = f48977d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48976c);
                            f48977d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
