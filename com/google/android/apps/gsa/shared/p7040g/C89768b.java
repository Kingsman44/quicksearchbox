package com.google.android.apps.gsa.shared.p7040g;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.shared.g.b */
/* compiled from: PG */
public final class C89768b extends C62937bq implements C62938br {

    /* renamed from: f */
    public static final C89768b f242960f;

    /* renamed from: h */
    private static volatile C63010eb f242961h;

    /* renamed from: a */
    public int f242962a;

    /* renamed from: b */
    public int f242963b;

    /* renamed from: c */
    public C63088z f242964c;

    /* renamed from: d */
    public C63088z f242965d;

    /* renamed from: e */
    public String f242966e;

    /* renamed from: g */
    private byte f242967g = 2;

    static {
        C89768b bVar = new C89768b();
        f242960f = bVar;
        C62942bv.registerDefaultInstance(C89768b.class, bVar);
    }

    private C89768b() {
        emptyIntList();
        this.f242964c = C63088z.f170246b;
        this.f242965d = C63088z.f170246b;
        this.f242966e = BuildConfig.FLAVOR;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f242967g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f242967g = b;
                return null;
            case 2:
                return newMessageInfo(f242960f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0003ည\u0001\u0004ည\u0002\u0005ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C89768b();
            case 4:
                return new C89767a();
            case 5:
                return f242960f;
            case 6:
                C63010eb ebVar = f242961h;
                if (ebVar == null) {
                    synchronized (C89768b.class) {
                        ebVar = f242961h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f242960f);
                            f242961h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
