package com.google.android.apps.search.googleapp.accounts.p10126ui;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.b */
/* compiled from: PG */
public final class C133189b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C133189b f363045d;

    /* renamed from: e */
    private static volatile C63010eb f363046e;

    /* renamed from: a */
    public int f363047a;

    /* renamed from: b */
    public boolean f363048b;

    /* renamed from: c */
    public boolean f363049c;

    static {
        C133189b bVar = new C133189b();
        f363045d = bVar;
        C62942bv.registerDefaultInstance(C133189b.class, bVar);
    }

    private C133189b() {
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
                return newMessageInfo(f363045d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဇ\u0000\u0003ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C133189b();
            case 4:
                return new C133166a();
            case 5:
                return f363045d;
            case 6:
                C63010eb ebVar = f363046e;
                if (ebVar == null) {
                    synchronized (C133189b.class) {
                        ebVar = f363046e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f363045d);
                            f363046e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
