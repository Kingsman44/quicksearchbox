package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.assistant.p3994s.p3995a.C53346km;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.qr */
/* compiled from: PG */
public final class C88141qr extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88141qr f238262c;

    /* renamed from: d */
    private static volatile C63010eb f238263d;

    /* renamed from: a */
    public int f238264a;

    /* renamed from: b */
    public C53346km f238265b;

    static {
        C88141qr qrVar = new C88141qr();
        f238262c = qrVar;
        C62942bv.registerDefaultInstance(C88141qr.class, qrVar);
    }

    private C88141qr() {
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
                return newMessageInfo(f238262c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C88141qr();
            case 4:
                return new C88140qq();
            case 5:
                return f238262c;
            case 6:
                C63010eb ebVar = f238263d;
                if (ebVar == null) {
                    synchronized (C88141qr.class) {
                        ebVar = f238263d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238262c);
                            f238263d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
