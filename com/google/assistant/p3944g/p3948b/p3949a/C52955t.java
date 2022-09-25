package com.google.assistant.p3944g.p3948b.p3949a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.g.b.a.t */
/* compiled from: PG */
public final class C52955t extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C52955t f138843e;

    /* renamed from: f */
    private static volatile C63010eb f138844f;

    /* renamed from: a */
    public int f138845a;

    /* renamed from: b */
    public String f138846b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f138847c;

    /* renamed from: d */
    public boolean f138848d;

    static {
        C52955t tVar = new C52955t();
        f138843e = tVar;
        C62942bv.registerDefaultInstance(C52955t.class, tVar);
    }

    private C52955t() {
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
                return newMessageInfo(f138843e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0002\u0003ဂ\u0001", new Object[]{"a", "b", "d", C45240c.f118157a});
            case 3:
                return new C52955t();
            case 4:
                return new C52954s();
            case 5:
                return f138843e;
            case 6:
                C63010eb ebVar = f138844f;
                if (ebVar == null) {
                    synchronized (C52955t.class) {
                        ebVar = f138844f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138843e);
                            f138844f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
