package com.google.p4500cm.p4501a.p4508c.p4509a.p4510a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.cm.a.c.a.a.k */
/* compiled from: PG */
public final class C58159k extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C58159k f155488f;

    /* renamed from: g */
    private static volatile C63010eb f155489g;

    /* renamed from: a */
    public int f155490a;

    /* renamed from: b */
    public int f155491b;

    /* renamed from: c */
    public String f155492c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public long f155493d;

    /* renamed from: e */
    public long f155494e;

    static {
        C58159k kVar = new C58159k();
        f155488f = kVar;
        C62942bv.registerDefaultInstance(C58159k.class, kVar);
    }

    private C58159k() {
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
                return newMessageInfo(f155488f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C58159k();
            case 4:
                return new C58158j();
            case 5:
                return f155488f;
            case 6:
                C63010eb ebVar = f155489g;
                if (ebVar == null) {
                    synchronized (C58159k.class) {
                        ebVar = f155489g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155488f);
                            f155489g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
