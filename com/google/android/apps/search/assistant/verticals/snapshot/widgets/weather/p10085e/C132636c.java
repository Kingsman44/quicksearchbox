package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10085e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.e.c */
/* compiled from: PG */
public final class C132636c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C132636c f361961d;

    /* renamed from: e */
    private static volatile C63010eb f361962e;

    /* renamed from: a */
    public int f361963a;

    /* renamed from: b */
    public int f361964b;

    /* renamed from: c */
    public C63042fg f361965c;

    static {
        C132636c cVar = new C132636c();
        f361961d = cVar;
        C62942bv.registerDefaultInstance(C132636c.class, cVar);
    }

    private C132636c() {
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
                return newMessageInfo(f361961d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C132640g.f361977a, C45240c.f118157a});
            case 3:
                return new C132636c();
            case 4:
                return new C132635b();
            case 5:
                return f361961d;
            case 6:
                C63010eb ebVar = f361962e;
                if (ebVar == null) {
                    synchronized (C132636c.class) {
                        ebVar = f361962e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f361961d);
                            f361962e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
