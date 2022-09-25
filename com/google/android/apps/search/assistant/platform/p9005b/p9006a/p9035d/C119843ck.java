package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.C33457k;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.ck */
/* compiled from: PG */
public final class C119843ck extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C119843ck f333783d;

    /* renamed from: e */
    private static volatile C63010eb f333784e;

    /* renamed from: a */
    public int f333785a;

    /* renamed from: b */
    public boolean f333786b;

    /* renamed from: c */
    public C33457k f333787c;

    static {
        C119843ck ckVar = new C119843ck();
        f333783d = ckVar;
        C62942bv.registerDefaultInstance(C119843ck.class, ckVar);
    }

    private C119843ck() {
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
                return newMessageInfo(f333783d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002ဉ\u0000", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C119843ck();
            case 4:
                return new C119842cj();
            case 5:
                return f333783d;
            case 6:
                C63010eb ebVar = f333784e;
                if (ebVar == null) {
                    synchronized (C119843ck.class) {
                        ebVar = f333784e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333783d);
                            f333784e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
