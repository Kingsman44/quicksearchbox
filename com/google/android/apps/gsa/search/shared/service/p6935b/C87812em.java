package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.em */
/* compiled from: PG */
public final class C87812em extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87812em f237614c;

    /* renamed from: d */
    private static volatile C63010eb f237615d;

    /* renamed from: a */
    public int f237616a;

    /* renamed from: b */
    public int f237617b;

    static {
        C87812em emVar = new C87812em();
        f237614c = emVar;
        C62942bv.registerDefaultInstance(C87812em.class, emVar);
    }

    private C87812em() {
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
                return newMessageInfo(f237614c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C87811el.m142770b()});
            case 3:
                return new C87812em();
            case 4:
                return new C87809ej();
            case 5:
                return f237614c;
            case 6:
                C63010eb ebVar = f237615d;
                if (ebVar == null) {
                    synchronized (C87812em.class) {
                        ebVar = f237615d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237614c);
                            f237615d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
