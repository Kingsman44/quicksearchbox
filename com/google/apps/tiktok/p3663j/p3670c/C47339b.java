package com.google.apps.tiktok.p3663j.p3670c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.tiktok.j.c.b */
/* compiled from: PG */
public final class C47339b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C47339b f123041f;

    /* renamed from: g */
    private static volatile C63010eb f123042g;

    /* renamed from: a */
    public int f123043a;

    /* renamed from: b */
    public C47345h f123044b;

    /* renamed from: c */
    public long f123045c;

    /* renamed from: d */
    public long f123046d;

    /* renamed from: e */
    public int f123047e;

    static {
        C47339b bVar = new C47339b();
        f123041f = bVar;
        C62942bv.registerDefaultInstance(C47339b.class, bVar);
    }

    private C47339b() {
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
                return newMessageInfo(f123041f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C47339b();
            case 4:
                return new C47338a();
            case 5:
                return f123041f;
            case 6:
                C63010eb ebVar = f123042g;
                if (ebVar == null) {
                    synchronized (C47339b.class) {
                        ebVar = f123042g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f123041f);
                            f123042g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
