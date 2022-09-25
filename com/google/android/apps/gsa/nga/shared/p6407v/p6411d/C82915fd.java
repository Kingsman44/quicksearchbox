package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83614ac;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83673y;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.fd */
/* compiled from: PG */
public final class C82915fd extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C82915fd f226204f;

    /* renamed from: h */
    private static volatile C63010eb f226205h;

    /* renamed from: a */
    public int f226206a;

    /* renamed from: b */
    public int f226207b;

    /* renamed from: c */
    public String f226208c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C83614ac f226209d;

    /* renamed from: e */
    public C83673y f226210e;

    /* renamed from: g */
    private byte f226211g = 2;

    static {
        C82915fd fdVar = new C82915fd();
        f226204f = fdVar;
        C62942bv.registerDefaultInstance(C82915fd.class, fdVar);
    }

    private C82915fd() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f226211g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f226211g = b;
                return null;
            case 2:
                return newMessageInfo(f226204f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003", new Object[]{"a", "b", C82914fc.m132427b(), C45240c.f118157a, "d", "e"});
            case 3:
                return new C82915fd();
            case 4:
                return new C82912fa();
            case 5:
                return f226204f;
            case 6:
                C63010eb ebVar = f226205h;
                if (ebVar == null) {
                    synchronized (C82915fd.class) {
                        ebVar = f226205h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226204f);
                            f226205h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
