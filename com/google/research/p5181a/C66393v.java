package com.google.research.p5181a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.research.a.v */
/* compiled from: PG */
public final class C66393v extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C66393v f180531f;

    /* renamed from: g */
    private static volatile C63010eb f180532g;

    /* renamed from: a */
    public int f180533a;

    /* renamed from: b */
    public C62971cq f180534b = emptyProtobufList();

    /* renamed from: c */
    public String f180535c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f180536d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f180537e = BuildConfig.FLAVOR;

    static {
        C66393v vVar = new C66393v();
        f180531f = vVar;
        C62942bv.registerDefaultInstance(C66393v.class, vVar);
    }

    private C66393v() {
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
                return newMessageInfo(f180531f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0001\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဈ\u0003", new Object[]{"a", "b", C66396y.class, C45240c.f118157a, "d", "e"});
            case 3:
                return new C66393v();
            case 4:
                return new C66392u();
            case 5:
                return f180531f;
            case 6:
                C63010eb ebVar = f180532g;
                if (ebVar == null) {
                    synchronized (C66393v.class) {
                        ebVar = f180532g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180531f);
                            f180532g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
