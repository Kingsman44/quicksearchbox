package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.cg */
/* compiled from: PG */
public final class C64500cg extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C64500cg f174934f;

    /* renamed from: g */
    private static volatile C63010eb f174935g;

    /* renamed from: a */
    public String f174936a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f174937b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f174938c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f174939d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f174940e = BuildConfig.FLAVOR;

    static {
        C64500cg cgVar = new C64500cg();
        f174934f = cgVar;
        C62942bv.registerDefaultInstance(C64500cg.class, cgVar);
    }

    private C64500cg() {
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
                return newMessageInfo(f174934f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C64500cg();
            case 4:
                return new C64499cf();
            case 5:
                return f174934f;
            case 6:
                C63010eb ebVar = f174935g;
                if (ebVar == null) {
                    synchronized (C64500cg.class) {
                        ebVar = f174935g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174934f);
                            f174935g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
