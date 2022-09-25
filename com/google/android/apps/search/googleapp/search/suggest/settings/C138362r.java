package com.google.android.apps.search.googleapp.search.suggest.settings;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.settings.r */
/* compiled from: PG */
public final class C138362r extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C138362r f376422c;

    /* renamed from: d */
    private static volatile C63010eb f376423d;

    /* renamed from: a */
    public int f376424a;

    /* renamed from: b */
    public boolean f376425b = true;

    static {
        C138362r rVar = new C138362r();
        f376422c = rVar;
        C62942bv.registerDefaultInstance(C138362r.class, rVar);
    }

    private C138362r() {
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
                return newMessageInfo(f376422c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C138362r();
            case 4:
                return new C138361q();
            case 5:
                return f376422c;
            case 6:
                C63010eb ebVar = f376423d;
                if (ebVar == null) {
                    synchronized (C138362r.class) {
                        ebVar = f376423d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f376422c);
                            f376423d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
