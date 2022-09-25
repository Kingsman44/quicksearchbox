package com.google.android.apps.search.assistant.verticals.p9880a.p9883b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.b.g */
/* compiled from: PG */
public final class C130332g extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C130332g f357230b;

    /* renamed from: c */
    private static volatile C63010eb f357231c;

    /* renamed from: a */
    public C62995dn f357232a = C62995dn.f170057a;

    static {
        C130332g gVar = new C130332g();
        f357230b = gVar;
        C62942bv.registerDefaultInstance(C130332g.class, gVar);
    }

    private C130332g() {
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
                return newMessageInfo(f357230b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C130330e.f357229a});
            case 3:
                return new C130332g();
            case 4:
                return new C130331f();
            case 5:
                return f357230b;
            case 6:
                C63010eb ebVar = f357231c;
                if (ebVar == null) {
                    synchronized (C130332g.class) {
                        ebVar = f357231c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f357230b);
                            f357231c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
