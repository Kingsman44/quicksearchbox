package com.google.p4017at.p4060h.p4073d.p4074a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.d.a.h */
/* compiled from: PG */
public final class C54244h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54244h f142422d;

    /* renamed from: e */
    private static volatile C63010eb f142423e;

    /* renamed from: a */
    public int f142424a;

    /* renamed from: b */
    public String f142425b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f142426c = BuildConfig.FLAVOR;

    static {
        C54244h hVar = new C54244h();
        f142422d = hVar;
        C62942bv.registerDefaultInstance(C54244h.class, hVar);
    }

    private C54244h() {
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
                return newMessageInfo(f142422d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C54244h();
            case 4:
                return new C54243g();
            case 5:
                return f142422d;
            case 6:
                C63010eb ebVar = f142423e;
                if (ebVar == null) {
                    synchronized (C54244h.class) {
                        ebVar = f142423e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142422d);
                            f142423e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
