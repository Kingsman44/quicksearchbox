package com.google.assistant.p3886c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.ai */
/* compiled from: PG */
public final class C50697ai extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50697ai f131903b;

    /* renamed from: c */
    private static volatile C63010eb f131904c;

    /* renamed from: a */
    public C62971cq f131905a = emptyProtobufList();

    static {
        C50697ai aiVar = new C50697ai();
        f131903b = aiVar;
        C62942bv.registerDefaultInstance(C50697ai.class, aiVar);
    }

    private C50697ai() {
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
                return newMessageInfo(f131903b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C50691ac.class});
            case 3:
                return new C50697ai();
            case 4:
                return new C50696ah();
            case 5:
                return f131903b;
            case 6:
                C63010eb ebVar = f131904c;
                if (ebVar == null) {
                    synchronized (C50697ai.class) {
                        ebVar = f131904c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131903b);
                            f131904c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
