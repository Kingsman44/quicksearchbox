package com.google.android.apps.gsa.nga.shared.p6275aa.p6284f;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.f.b */
/* compiled from: PG */
public final class C80406b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C80406b f220674f;

    /* renamed from: h */
    private static volatile C63010eb f220675h;

    /* renamed from: a */
    public int f220676a;

    /* renamed from: b */
    public int f220677b;

    /* renamed from: c */
    public String f220678c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f220679d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public long f220680e;

    /* renamed from: g */
    private byte f220681g = 2;

    static {
        C80406b bVar = new C80406b();
        f220674f = bVar;
        C62942bv.registerDefaultInstance(C80406b.class, bVar);
    }

    private C80406b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f220681g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f220681g = b;
                return null;
            case 2:
                return newMessageInfo(f220674f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ᔌ\u0000\u0002ᔈ\u0001\u0003ᔈ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", C65753ak.m96798c(), C45240c.f118157a, "d", "e"});
            case 3:
                return new C80406b();
            case 4:
                return new C80405a();
            case 5:
                return f220674f;
            case 6:
                C63010eb ebVar = f220675h;
                if (ebVar == null) {
                    synchronized (C80406b.class) {
                        ebVar = f220675h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220674f);
                            f220675h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
