package com.google.android.apps.auto.p450a.p451a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.auto.a.a.ab */
/* compiled from: PG */
public final class C8857ab extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C8857ab f30766e;

    /* renamed from: f */
    private static volatile C63010eb f30767f;

    /* renamed from: a */
    public int f30768a;

    /* renamed from: b */
    public String f30769b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C8879ax f30770c;

    /* renamed from: d */
    public int f30771d;

    static {
        C8857ab abVar = new C8857ab();
        f30766e = abVar;
        C62942bv.registerDefaultInstance(C8857ab.class, abVar);
    }

    private C8857ab() {
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
                return newMessageInfo(f30766e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0002\u0005င\u0004", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C8857ab();
            case 4:
                return new C8856aa();
            case 5:
                return f30766e;
            case 6:
                C63010eb ebVar = f30767f;
                if (ebVar == null) {
                    synchronized (C8857ab.class) {
                        ebVar = f30767f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30766e);
                            f30767f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
