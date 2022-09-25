package com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.i.a.d.o */
/* compiled from: PG */
public final class C121251o extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C121251o f336804b;

    /* renamed from: c */
    private static volatile C63010eb f336805c;

    /* renamed from: a */
    public C62995dn f336806a = C62995dn.f170057a;

    static {
        C121251o oVar = new C121251o();
        f336804b = oVar;
        C62942bv.registerDefaultInstance(C121251o.class, oVar);
    }

    private C121251o() {
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
                return newMessageInfo(f336804b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C121246j.f336793a});
            case 3:
                return new C121251o();
            case 4:
                return new C121245i();
            case 5:
                return f336804b;
            case 6:
                C63010eb ebVar = f336805c;
                if (ebVar == null) {
                    synchronized (C121251o.class) {
                        ebVar = f336805c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f336804b);
                            f336805c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
