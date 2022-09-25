package com.google.p3717aq.p3718a.p3719a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aq.a.a.q */
/* compiled from: PG */
public final class C47883q extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C47883q f123958f;

    /* renamed from: g */
    private static volatile C63010eb f123959g;

    /* renamed from: a */
    public String f123960a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f123961b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f123962c;

    /* renamed from: d */
    public String f123963d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f123964e = BuildConfig.FLAVOR;

    static {
        C47883q qVar = new C47883q();
        f123958f = qVar;
        C62942bv.registerDefaultInstance(C47883q.class, qVar);
    }

    private C47883q() {
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
                return newMessageInfo(f123958f, "\u0000\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001Ȉ\u0003Ȉ\u0004\u0002\u0005Ȉ\u0006Ȉ", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C47883q();
            case 4:
                return new C47882p();
            case 5:
                return f123958f;
            case 6:
                C63010eb ebVar = f123959g;
                if (ebVar == null) {
                    synchronized (C47883q.class) {
                        ebVar = f123959g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f123958f);
                            f123959g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
