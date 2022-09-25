package com.google.android.apps.search.googleapp.compliance.p10144a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.googleapp.compliance.a.ao */
/* compiled from: PG */
public final class C133546ao extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C133546ao f363859f;

    /* renamed from: g */
    private static volatile C63010eb f363860g;

    /* renamed from: a */
    public int f363861a;

    /* renamed from: b */
    public boolean f363862b;

    /* renamed from: c */
    public boolean f363863c;

    /* renamed from: d */
    public boolean f363864d;

    /* renamed from: e */
    public C63042fg f363865e;

    static {
        C133546ao aoVar = new C133546ao();
        f363859f = aoVar;
        C62942bv.registerDefaultInstance(C133546ao.class, aoVar);
    }

    private C133546ao() {
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
                return newMessageInfo(f363859f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C133546ao();
            case 4:
                return new C133545an();
            case 5:
                return f363859f;
            case 6:
                C63010eb ebVar = f363860g;
                if (ebVar == null) {
                    synchronized (C133546ao.class) {
                        ebVar = f363860g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f363859f);
                            f363860g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
