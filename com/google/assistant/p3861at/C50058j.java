package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.j */
/* compiled from: PG */
public final class C50058j extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C50058j f130146f;

    /* renamed from: g */
    private static volatile C63010eb f130147g;

    /* renamed from: a */
    public int f130148a;

    /* renamed from: b */
    public String f130149b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f130150c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f130151d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f130152e;

    static {
        C50058j jVar = new C50058j();
        f130146f = jVar;
        C62942bv.registerDefaultInstance(C50058j.class, jVar);
    }

    private C50058j() {
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
                return newMessageInfo(f130146f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003ဈ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C50058j();
            case 4:
                return new C50031i();
            case 5:
                return f130146f;
            case 6:
                C63010eb ebVar = f130147g;
                if (ebVar == null) {
                    synchronized (C50058j.class) {
                        ebVar = f130147g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130146f);
                            f130147g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
