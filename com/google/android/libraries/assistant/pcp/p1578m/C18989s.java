package com.google.android.libraries.assistant.pcp.p1578m;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.pcp.m.s */
/* compiled from: PG */
public final class C18989s extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C18989s f53353f;

    /* renamed from: g */
    private static volatile C63010eb f53354g;

    /* renamed from: a */
    public int f53355a;

    /* renamed from: b */
    public int f53356b;

    /* renamed from: c */
    public String f53357c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f53358d;

    /* renamed from: e */
    public String f53359e = BuildConfig.FLAVOR;

    static {
        C18989s sVar = new C18989s();
        f53353f = sVar;
        C62942bv.registerDefaultInstance(C18989s.class, sVar);
    }

    private C18989s() {
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
                return newMessageInfo(f53353f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0001\u0002ဌ\u0002\u0003ဈ\u0003\u0004င\u0000", new Object[]{"a", C45240c.f118157a, "d", C53306j.m86810b(), "e", "b"});
            case 3:
                return new C18989s();
            case 4:
                return new C18988r();
            case 5:
                return f53353f;
            case 6:
                C63010eb ebVar = f53354g;
                if (ebVar == null) {
                    synchronized (C18989s.class) {
                        ebVar = f53354g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53353f);
                            f53354g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
