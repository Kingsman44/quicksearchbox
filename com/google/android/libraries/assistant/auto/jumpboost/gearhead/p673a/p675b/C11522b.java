package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.p675b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.b.b */
/* compiled from: PG */
public final class C11522b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C11522b f37405d;

    /* renamed from: e */
    private static volatile C63010eb f37406e;

    /* renamed from: a */
    public int f37407a;

    /* renamed from: b */
    public long f37408b;

    /* renamed from: c */
    public long f37409c;

    static {
        C11522b bVar = new C11522b();
        f37405d = bVar;
        C62942bv.registerDefaultInstance(C11522b.class, bVar);
    }

    private C11522b() {
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
                return newMessageInfo(f37405d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C11522b();
            case 4:
                return new C11521a();
            case 5:
                return f37405d;
            case 6:
                C63010eb ebVar = f37406e;
                if (ebVar == null) {
                    synchronized (C11522b.class) {
                        ebVar = f37406e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f37405d);
                            f37406e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
