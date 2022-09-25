package com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.c.a.a.a.a.p */
/* compiled from: PG */
public final class C45670p extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C45670p f120138f;

    /* renamed from: g */
    private static volatile C63010eb f120139g;

    /* renamed from: a */
    public int f120140a;

    /* renamed from: b */
    public String f120141b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f120142c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f120143d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f120144e = BuildConfig.FLAVOR;

    static {
        C45670p pVar = new C45670p();
        f120138f = pVar;
        C62942bv.registerDefaultInstance(C45670p.class, pVar);
    }

    private C45670p() {
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
                return newMessageInfo(f120138f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C45670p();
            case 4:
                return new C45669o();
            case 5:
                return f120138f;
            case 6:
                C63010eb ebVar = f120139g;
                if (ebVar == null) {
                    synchronized (C45670p.class) {
                        ebVar = f120139g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f120138f);
                            f120139g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
