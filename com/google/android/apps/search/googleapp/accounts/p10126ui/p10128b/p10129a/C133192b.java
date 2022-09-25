package com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.p10129a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.b.a.b */
/* compiled from: PG */
public final class C133192b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C133192b f363050f;

    /* renamed from: g */
    private static volatile C63010eb f363051g;

    /* renamed from: a */
    public int f363052a;

    /* renamed from: b */
    public int f363053b;

    /* renamed from: c */
    public boolean f363054c;

    /* renamed from: d */
    public C63042fg f363055d;

    /* renamed from: e */
    public boolean f363056e;

    static {
        C133192b bVar = new C133192b();
        f363050f = bVar;
        C62942bv.registerDefaultInstance(C133192b.class, bVar);
    }

    private C133192b() {
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
                return newMessageInfo(f363050f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C133192b();
            case 4:
                return new C133191a();
            case 5:
                return f363050f;
            case 6:
                C63010eb ebVar = f363051g;
                if (ebVar == null) {
                    synchronized (C133192b.class) {
                        ebVar = f363051g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f363050f);
                            f363051g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
