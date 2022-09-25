package com.google.android.apps.search.googleapp.discover.p10166a.p10168b.p10169a;

import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57340w;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.a.b.a.j */
/* compiled from: PG */
public final class C133950j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C133950j f364856c;

    /* renamed from: d */
    private static volatile C63010eb f364857d;

    /* renamed from: a */
    public int f364858a;

    /* renamed from: b */
    public C57340w f364859b;

    static {
        C133950j jVar = new C133950j();
        f364856c = jVar;
        C62942bv.registerDefaultInstance(C133950j.class, jVar);
    }

    private C133950j() {
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
                return newMessageInfo(f364856c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C133950j();
            case 4:
                return new C133949i();
            case 5:
                return f364856c;
            case 6:
                C63010eb ebVar = f364857d;
                if (ebVar == null) {
                    synchronized (C133950j.class) {
                        ebVar = f364857d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f364856c);
                            f364857d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
