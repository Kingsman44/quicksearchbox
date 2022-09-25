package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.ai */
/* compiled from: PG */
public final class C119787ai extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C119787ai f333651d;

    /* renamed from: e */
    private static volatile C63010eb f333652e;

    /* renamed from: a */
    public int f333653a;

    /* renamed from: b */
    public int f333654b = 5000;

    /* renamed from: c */
    public int f333655c = 5000;

    static {
        C119787ai aiVar = new C119787ai();
        f333651d = aiVar;
        C62942bv.registerDefaultInstance(C119787ai.class, aiVar);
    }

    private C119787ai() {
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
                return newMessageInfo(f333651d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C119787ai();
            case 4:
                return new C119786ah();
            case 5:
                return f333651d;
            case 6:
                C63010eb ebVar = f333652e;
                if (ebVar == null) {
                    synchronized (C119787ai.class) {
                        ebVar = f333652e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333651d);
                            f333652e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
