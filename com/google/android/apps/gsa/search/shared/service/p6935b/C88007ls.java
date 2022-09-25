package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.libraries.gsa.monet.shared.p1894d.C23107j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ls */
/* compiled from: PG */
public final class C88007ls extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88007ls f237995c;

    /* renamed from: d */
    private static volatile C63010eb f237996d;

    /* renamed from: a */
    public int f237997a;

    /* renamed from: b */
    public C23107j f237998b;

    static {
        C88007ls lsVar = new C88007ls();
        f237995c = lsVar;
        C62942bv.registerDefaultInstance(C88007ls.class, lsVar);
    }

    private C88007ls() {
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
                return newMessageInfo(f237995c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C88007ls();
            case 4:
                return new C88006lr();
            case 5:
                return f237995c;
            case 6:
                C63010eb ebVar = f237996d;
                if (ebVar == null) {
                    synchronized (C88007ls.class) {
                        ebVar = f237996d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237995c);
                            f237996d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
