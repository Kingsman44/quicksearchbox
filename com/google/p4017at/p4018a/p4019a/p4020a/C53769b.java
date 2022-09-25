package com.google.p4017at.p4018a.p4019a.p4020a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.a.a.a.b */
/* compiled from: PG */
public final class C53769b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C53769b f141138f;

    /* renamed from: g */
    private static volatile C63010eb f141139g;

    /* renamed from: a */
    public int f141140a;

    /* renamed from: b */
    public C53799j f141141b;

    /* renamed from: c */
    public C53797h f141142c;

    /* renamed from: d */
    public C53799j f141143d;

    /* renamed from: e */
    public C53799j f141144e;

    static {
        C53769b bVar = new C53769b();
        f141138f = bVar;
        C62942bv.registerDefaultInstance(C53769b.class, bVar);
    }

    private C53769b() {
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
                return newMessageInfo(f141138f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C53769b();
            case 4:
                return new C53742a();
            case 5:
                return f141138f;
            case 6:
                C63010eb ebVar = f141139g;
                if (ebVar == null) {
                    synchronized (C53769b.class) {
                        ebVar = f141139g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141138f);
                            f141139g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
