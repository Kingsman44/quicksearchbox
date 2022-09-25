package com.google.android.apps.search.googleapp.p10370p;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.p.az */
/* compiled from: PG */
public final class C136859az extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C136859az f372506b;

    /* renamed from: c */
    private static volatile C63010eb f372507c;

    /* renamed from: a */
    public C62995dn f372508a = C62995dn.f170057a;

    static {
        C136859az azVar = new C136859az();
        f372506b = azVar;
        C62942bv.registerDefaultInstance(C136859az.class, azVar);
    }

    private C136859az() {
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
                return newMessageInfo(f372506b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C136858ay.f372505a});
            case 3:
                return new C136859az();
            case 4:
                return new C136857ax();
            case 5:
                return f372506b;
            case 6:
                C63010eb ebVar = f372507c;
                if (ebVar == null) {
                    synchronized (C136859az.class) {
                        ebVar = f372507c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f372506b);
                            f372507c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
