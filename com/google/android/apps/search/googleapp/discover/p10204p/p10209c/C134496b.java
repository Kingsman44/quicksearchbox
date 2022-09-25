package com.google.android.apps.search.googleapp.discover.p10204p.p10209c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.p.c.b */
/* compiled from: PG */
public final class C134496b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C134496b f366280b;

    /* renamed from: c */
    private static volatile C63010eb f366281c;

    /* renamed from: a */
    public C62971cq f366282a = C62942bv.emptyProtobufList();

    static {
        C134496b bVar = new C134496b();
        f366280b = bVar;
        C62942bv.registerDefaultInstance(C134496b.class, bVar);
    }

    private C134496b() {
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
                return newMessageInfo(f366280b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C134496b();
            case 4:
                return new C134493a();
            case 5:
                return f366280b;
            case 6:
                C63010eb ebVar = f366281c;
                if (ebVar == null) {
                    synchronized (C134496b.class) {
                        ebVar = f366281c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366280b);
                            f366281c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
