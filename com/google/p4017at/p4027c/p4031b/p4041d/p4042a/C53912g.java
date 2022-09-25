package com.google.p4017at.p4027c.p4031b.p4041d.p4042a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4816ai.p4818b.C63204j;

/* renamed from: com.google.at.c.b.d.a.g */
/* compiled from: PG */
public final class C53912g extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C53912g f141465e;

    /* renamed from: g */
    private static volatile C63010eb f141466g;

    /* renamed from: a */
    public String f141467a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f141468b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f141469c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C63204j f141470d;

    /* renamed from: f */
    private byte f141471f = 2;

    static {
        C53912g gVar = new C53912g();
        f141465e = gVar;
        C62942bv.registerDefaultInstance(C53912g.class, gVar);
    }

    private C53912g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f141471f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f141471f = b;
                return null;
            case 2:
                return newMessageInfo(f141465e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0001\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Љ", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C53912g();
            case 4:
                return new C53911f();
            case 5:
                return f141465e;
            case 6:
                C63010eb ebVar = f141466g;
                if (ebVar == null) {
                    synchronized (C53912g.class) {
                        ebVar = f141466g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141465e);
                            f141466g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
