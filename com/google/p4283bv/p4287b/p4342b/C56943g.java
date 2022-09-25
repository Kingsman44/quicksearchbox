package com.google.p4283bv.p4287b.p4342b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.bv.b.b.g */
/* compiled from: PG */
public final class C56943g extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C56943g f151982f;

    /* renamed from: g */
    private static volatile C63010eb f151983g;

    /* renamed from: a */
    public int f151984a;

    /* renamed from: b */
    public String f151985b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C63088z f151986c = C63088z.f170246b;

    /* renamed from: d */
    public int f151987d;

    /* renamed from: e */
    public boolean f151988e;

    static {
        C56943g gVar = new C56943g();
        f151982f = gVar;
        C62942bv.registerDefaultInstance(C56943g.class, gVar);
    }

    private C56943g() {
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
                return newMessageInfo(f151982f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဌ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C56941e.m88235b(), "e"});
            case 3:
                return new C56943g();
            case 4:
                return new C56942f();
            case 5:
                return f151982f;
            case 6:
                C63010eb ebVar = f151983g;
                if (ebVar == null) {
                    synchronized (C56943g.class) {
                        ebVar = f151983g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151982f);
                            f151983g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
