package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.uf */
/* compiled from: PG */
public final class C50361uf extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C50361uf f131089f;

    /* renamed from: g */
    private static volatile C63010eb f131090g;

    /* renamed from: a */
    public int f131091a;

    /* renamed from: b */
    public int f131092b;

    /* renamed from: c */
    public String f131093c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f131094d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f131095e = BuildConfig.FLAVOR;

    static {
        C50361uf ufVar = new C50361uf();
        f131089f = ufVar;
        C62942bv.registerDefaultInstance(C50361uf.class, ufVar);
    }

    private C50361uf() {
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
                return newMessageInfo(f131089f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C50361uf();
            case 4:
                return new C50360ue();
            case 5:
                return f131089f;
            case 6:
                C63010eb ebVar = f131090g;
                if (ebVar == null) {
                    synchronized (C50361uf.class) {
                        ebVar = f131090g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131089f);
                            f131090g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
