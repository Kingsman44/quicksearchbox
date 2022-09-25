package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.da */
/* compiled from: PG */
public final class C56301da extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C56301da f150037e;

    /* renamed from: f */
    private static volatile C63010eb f150038f;

    /* renamed from: a */
    public int f150039a;

    /* renamed from: b */
    public String f150040b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f150041c;

    /* renamed from: d */
    public int f150042d;

    static {
        C56301da daVar = new C56301da();
        f150037e = daVar;
        C62942bv.registerDefaultInstance(C56301da.class, daVar);
    }

    private C56301da() {
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
                return newMessageInfo(f150037e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", C56299cz.m87962b()});
            case 3:
                return new C56301da();
            case 4:
                return new C56297cx();
            case 5:
                return f150037e;
            case 6:
                C63010eb ebVar = f150038f;
                if (ebVar == null) {
                    synchronized (C56301da.class) {
                        ebVar = f150038f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150037e);
                            f150038f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
