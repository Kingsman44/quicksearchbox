package com.google.android.apps.gsa.opa.smartspace;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.aa */
/* compiled from: PG */
public final class C83729aa extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C83729aa f228209e;

    /* renamed from: f */
    private static volatile C63010eb f228210f;

    /* renamed from: a */
    public int f228211a;

    /* renamed from: b */
    public String f228212b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f228213c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C83736ah f228214d;

    static {
        C83729aa aaVar = new C83729aa();
        f228209e = aaVar;
        C62942bv.registerDefaultInstance(C83729aa.class, aaVar);
    }

    private C83729aa() {
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
                return newMessageInfo(f228209e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C83729aa();
            case 4:
                return new C83810z();
            case 5:
                return f228209e;
            case 6:
                C63010eb ebVar = f228210f;
                if (ebVar == null) {
                    synchronized (C83729aa.class) {
                        ebVar = f228210f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228209e);
                            f228210f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
