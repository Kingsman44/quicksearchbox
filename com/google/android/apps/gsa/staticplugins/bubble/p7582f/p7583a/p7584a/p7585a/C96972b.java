package com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7583a.p7584a.p7585a;

import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7583a.p7584a.C96981d;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.f.a.a.a.b */
/* compiled from: PG */
public final class C96972b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C96972b f271009d;

    /* renamed from: e */
    private static volatile C63010eb f271010e;

    /* renamed from: a */
    public int f271011a;

    /* renamed from: b */
    public C62971cq f271012b = emptyProtobufList();

    /* renamed from: c */
    public long f271013c;

    static {
        C96972b bVar = new C96972b();
        f271009d = bVar;
        C62942bv.registerDefaultInstance(C96972b.class, bVar);
    }

    private C96972b() {
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
                return newMessageInfo(f271009d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဂ\u0000", new Object[]{"a", "b", C96981d.class, C45240c.f118157a});
            case 3:
                return new C96972b();
            case 4:
                return new C96971a();
            case 5:
                return f271009d;
            case 6:
                C63010eb ebVar = f271010e;
                if (ebVar == null) {
                    synchronized (C96972b.class) {
                        ebVar = f271010e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f271009d);
                            f271010e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
