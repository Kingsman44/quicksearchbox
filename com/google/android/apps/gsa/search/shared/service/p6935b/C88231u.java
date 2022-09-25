package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.u */
/* compiled from: PG */
public final class C88231u extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88231u f238474c;

    /* renamed from: d */
    private static volatile C63010eb f238475d;

    /* renamed from: a */
    public int f238476a;

    /* renamed from: b */
    public boolean f238477b;

    static {
        C88231u uVar = new C88231u();
        f238474c = uVar;
        C62942bv.registerDefaultInstance(C88231u.class, uVar);
    }

    private C88231u() {
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
                return newMessageInfo(f238474c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C88231u();
            case 4:
                return new C88204t();
            case 5:
                return f238474c;
            case 6:
                C63010eb ebVar = f238475d;
                if (ebVar == null) {
                    synchronized (C88231u.class) {
                        ebVar = f238475d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238474c);
                            f238475d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
