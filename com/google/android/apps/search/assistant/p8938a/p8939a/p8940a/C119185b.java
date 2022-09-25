package com.google.android.apps.search.assistant.p8938a.p8939a.p8940a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.a.a.a.b */
/* compiled from: PG */
public final class C119185b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C119185b f332382e;

    /* renamed from: f */
    private static volatile C63010eb f332383f;

    /* renamed from: a */
    public int f332384a;

    /* renamed from: b */
    public int f332385b;

    /* renamed from: c */
    public long f332386c;

    /* renamed from: d */
    public boolean f332387d;

    static {
        C119185b bVar = new C119185b();
        f332382e = bVar;
        C62942bv.registerDefaultInstance(C119185b.class, bVar);
    }

    private C119185b() {
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
                return newMessageInfo(f332382e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C119185b();
            case 4:
                return new C119184a();
            case 5:
                return f332382e;
            case 6:
                C63010eb ebVar = f332383f;
                if (ebVar == null) {
                    synchronized (C119185b.class) {
                        ebVar = f332383f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f332382e);
                            f332383f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
