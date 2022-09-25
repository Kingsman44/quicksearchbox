package com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.b.p */
/* compiled from: PG */
public final class C133233p extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C133233p f363141d;

    /* renamed from: e */
    private static volatile C63010eb f363142e;

    /* renamed from: a */
    public int f363143a;

    /* renamed from: b */
    public boolean f363144b;

    /* renamed from: c */
    public boolean f363145c;

    static {
        C133233p pVar = new C133233p();
        f363141d = pVar;
        C62942bv.registerDefaultInstance(C133233p.class, pVar);
    }

    private C133233p() {
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
                return newMessageInfo(f363141d, "\u0001\u0002\u0000\u0001\u0004\u0007\u0002\u0000\u0000\u0000\u0004ဇ\u0000\u0007ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C133233p();
            case 4:
                return new C133232o();
            case 5:
                return f363141d;
            case 6:
                C63010eb ebVar = f363142e;
                if (ebVar == null) {
                    synchronized (C133233p.class) {
                        ebVar = f363142e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f363141d);
                            f363142e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
