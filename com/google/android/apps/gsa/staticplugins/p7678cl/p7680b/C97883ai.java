package com.google.android.apps.gsa.staticplugins.p7678cl.p7680b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.cl.b.ai */
/* compiled from: PG */
public final class C97883ai extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C97883ai f273301c;

    /* renamed from: d */
    private static volatile C63010eb f273302d;

    /* renamed from: a */
    public C62971cq f273303a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f273304b = emptyProtobufList();

    static {
        C97883ai aiVar = new C97883ai();
        f273301c = aiVar;
        C62942bv.registerDefaultInstance(C97883ai.class, aiVar);
    }

    private C97883ai() {
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
                return newMessageInfo(f273301c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", C97914d.class, "b", C97920j.class});
            case 3:
                return new C97883ai();
            case 4:
                return new C97882ah();
            case 5:
                return f273301c;
            case 6:
                C63010eb ebVar = f273302d;
                if (ebVar == null) {
                    synchronized (C97883ai.class) {
                        ebVar = f273302d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f273301c);
                            f273302d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
