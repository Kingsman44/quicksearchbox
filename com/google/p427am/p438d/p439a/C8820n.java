package com.google.p427am.p438d.p439a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.d.a.n */
/* compiled from: PG */
public final class C8820n extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8820n f30201d;

    /* renamed from: e */
    private static volatile C63010eb f30202e;

    /* renamed from: a */
    public String f30203a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f30204b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f30205c;

    static {
        C8820n nVar = new C8820n();
        f30201d = nVar;
        C62942bv.registerDefaultInstance(C8820n.class, nVar);
    }

    private C8820n() {
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
                return newMessageInfo(f30201d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C8820n();
            case 4:
                return new C8819m();
            case 5:
                return f30201d;
            case 6:
                C63010eb ebVar = f30202e;
                if (ebVar == null) {
                    synchronized (C8820n.class) {
                        ebVar = f30202e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30201d);
                            f30202e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
