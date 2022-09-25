package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.xp */
/* compiled from: PG */
public final class C8156xp extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C8156xp f28669f;

    /* renamed from: g */
    private static volatile C63010eb f28670g;

    /* renamed from: a */
    public int f28671a;

    /* renamed from: b */
    public String f28672b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C7893nw f28673c;

    /* renamed from: d */
    public boolean f28674d;

    /* renamed from: e */
    public int f28675e;

    static {
        C8156xp xpVar = new C8156xp();
        f28669f = xpVar;
        C62942bv.registerDefaultInstance(C8156xp.class, xpVar);
    }

    private C8156xp() {
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
                return newMessageInfo(f28669f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0004ဇ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C8153xm.f28668a});
            case 3:
                return new C8156xp();
            case 4:
                return new C8155xo();
            case 5:
                return f28669f;
            case 6:
                C63010eb ebVar = f28670g;
                if (ebVar == null) {
                    synchronized (C8156xp.class) {
                        ebVar = f28670g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28669f);
                            f28670g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
