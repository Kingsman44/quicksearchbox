package com.google.android.libraries.lens.view.p2067ak;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.ak.u */
/* compiled from: PG */
public final class C25282u extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C25282u f68773d;

    /* renamed from: e */
    private static volatile C63010eb f68774e;

    /* renamed from: a */
    public C62995dn f68775a = C62995dn.f170057a;

    /* renamed from: b */
    public C62995dn f68776b;

    /* renamed from: c */
    public C62995dn f68777c;

    static {
        C25282u uVar = new C25282u();
        f68773d = uVar;
        C62942bv.registerDefaultInstance(C25282u.class, uVar);
    }

    private C25282u() {
        C62995dn dnVar = C62995dn.f170057a;
        this.f68776b = dnVar;
        this.f68777c = dnVar;
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
                return newMessageInfo(f68773d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0003\u0000\u0000\u00012\u00022\u00032", new Object[]{"a", C25280s.f68771a, "b", C25281t.f68772a, C45240c.f118157a, C25279r.f68770a});
            case 3:
                return new C25282u();
            case 4:
                return new C25278q();
            case 5:
                return f68773d;
            case 6:
                C63010eb ebVar = f68774e;
                if (ebVar == null) {
                    synchronized (C25282u.class) {
                        ebVar = f68774e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68773d);
                            f68774e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
