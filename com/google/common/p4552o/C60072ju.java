package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ju */
/* compiled from: PG */
public final class C60072ju extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C60072ju f162395f;

    /* renamed from: g */
    private static volatile C63010eb f162396g;

    /* renamed from: a */
    public int f162397a;

    /* renamed from: b */
    public String f162398b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f162399c;

    /* renamed from: d */
    public long f162400d;

    /* renamed from: e */
    public boolean f162401e;

    static {
        C60072ju juVar = new C60072ju();
        f162395f = juVar;
        C62942bv.registerDefaultInstance(C60072ju.class, juVar);
    }

    private C60072ju() {
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
                return newMessageInfo(f162395f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, C60071jt.f162394a, "d", "e"});
            case 3:
                return new C60072ju();
            case 4:
                return new C60070js();
            case 5:
                return f162395f;
            case 6:
                C63010eb ebVar = f162396g;
                if (ebVar == null) {
                    synchronized (C60072ju.class) {
                        ebVar = f162396g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162395f);
                            f162396g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
