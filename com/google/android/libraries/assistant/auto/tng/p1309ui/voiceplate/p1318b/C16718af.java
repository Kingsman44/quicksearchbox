package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.af */
/* compiled from: PG */
public final class C16718af extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C16718af f48884c;

    /* renamed from: d */
    private static volatile C63010eb f48885d;

    /* renamed from: a */
    public int f48886a = 0;

    /* renamed from: b */
    public Object f48887b;

    static {
        C16718af afVar = new C16718af();
        f48884c = afVar;
        C62942bv.registerDefaultInstance(C16718af.class, afVar);
    }

    private C16718af() {
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
                return newMessageInfo(f48884c, "\u0001\u0002\u0001\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", C16732at.class, C16738az.class});
            case 3:
                return new C16718af();
            case 4:
                return new C16717ae();
            case 5:
                return f48884c;
            case 6:
                C63010eb ebVar = f48885d;
                if (ebVar == null) {
                    synchronized (C16718af.class) {
                        ebVar = f48885d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48884c);
                            f48885d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
