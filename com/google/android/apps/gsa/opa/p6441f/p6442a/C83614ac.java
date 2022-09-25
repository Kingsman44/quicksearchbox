package com.google.android.apps.gsa.opa.p6441f.p6442a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52650zp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.f.a.ac */
/* compiled from: PG */
public final class C83614ac extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C83614ac f227951e;

    /* renamed from: f */
    private static volatile C63010eb f227952f;

    /* renamed from: a */
    public int f227953a;

    /* renamed from: b */
    public int f227954b;

    /* renamed from: c */
    public int f227955c;

    /* renamed from: d */
    public String f227956d = BuildConfig.FLAVOR;

    static {
        C83614ac acVar = new C83614ac();
        f227951e = acVar;
        C62942bv.registerDefaultInstance(C83614ac.class, acVar);
    }

    private C83614ac() {
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
                return newMessageInfo(f227951e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဌ\u0000\u0003ဌ\u0001\u0004ဈ\u0002", new Object[]{"a", "b", C52650zp.f138231a, C45240c.f118157a, e.b(), "d"});
            case 3:
                return new C83614ac();
            case 4:
                return new C83613ab();
            case 5:
                return f227951e;
            case 6:
                C63010eb ebVar = f227952f;
                if (ebVar == null) {
                    synchronized (C83614ac.class) {
                        ebVar = f227952f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f227951e);
                            f227952f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
