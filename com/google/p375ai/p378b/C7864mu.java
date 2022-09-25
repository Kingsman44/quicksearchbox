package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.mu */
/* compiled from: PG */
public final class C7864mu extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C7864mu f27543e;

    /* renamed from: g */
    private static volatile C63010eb f27544g;

    /* renamed from: a */
    public int f27545a;

    /* renamed from: b */
    public String f27546b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C7536ax f27547c;

    /* renamed from: d */
    public boolean f27548d = true;

    /* renamed from: f */
    private byte f27549f = 2;

    static {
        C7864mu muVar = new C7864mu();
        f27543e = muVar;
        C62942bv.registerDefaultInstance(C7864mu.class, muVar);
    }

    private C7864mu() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27549f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f27549f = b;
                return null;
            case 2:
                return newMessageInfo(f27543e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C7864mu();
            case 4:
                return new C7863mt();
            case 5:
                return f27543e;
            case 6:
                C63010eb ebVar = f27544g;
                if (ebVar == null) {
                    synchronized (C7864mu.class) {
                        ebVar = f27544g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27543e);
                            f27544g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
