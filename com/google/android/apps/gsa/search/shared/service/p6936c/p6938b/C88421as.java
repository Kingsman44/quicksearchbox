package com.google.android.apps.gsa.search.shared.service.p6936c.p6938b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.c.b.as */
/* compiled from: PG */
public final class C88421as extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88421as f239066c;

    /* renamed from: d */
    private static volatile C63010eb f239067d;

    /* renamed from: a */
    public int f239068a;

    /* renamed from: b */
    public int f239069b;

    static {
        C88421as asVar = new C88421as();
        f239066c = asVar;
        C62942bv.registerDefaultInstance(C88421as.class, asVar);
    }

    private C88421as() {
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
                return newMessageInfo(f239066c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C88419aq.f239065a});
            case 3:
                return new C88421as();
            case 4:
                return new C88418ap();
            case 5:
                return f239066c;
            case 6:
                C63010eb ebVar = f239067d;
                if (ebVar == null) {
                    synchronized (C88421as.class) {
                        ebVar = f239067d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f239066c);
                            f239067d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
