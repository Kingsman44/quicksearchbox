package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.jm */
/* compiled from: PG */
public final class C50071jm extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C50071jm f130181f;

    /* renamed from: g */
    private static volatile C63010eb f130182g;

    /* renamed from: a */
    public int f130183a;

    /* renamed from: b */
    public String f130184b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f130185c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f130186d;

    /* renamed from: e */
    public boolean f130187e;

    static {
        C50071jm jmVar = new C50071jm();
        f130181f = jmVar;
        C62942bv.registerDefaultInstance(C50071jm.class, jmVar);
    }

    private C50071jm() {
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
                return newMessageInfo(f130181f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C50071jm();
            case 4:
                return new C50070jl();
            case 5:
                return f130181f;
            case 6:
                C63010eb ebVar = f130182g;
                if (ebVar == null) {
                    synchronized (C50071jm.class) {
                        ebVar = f130182g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130181f);
                            f130182g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
